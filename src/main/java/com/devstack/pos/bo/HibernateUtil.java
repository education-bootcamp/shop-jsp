package com.devstack.pos.bo;

import com.devstack.pos.dao.custom.impl.CustomerImpl;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.model.naming.ImplicitNamingStrategyJpaCompliantImpl;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {
    private static SessionFactory sessionFactory = buildSessionFactory();

    private HibernateUtil() {
    }

    private static SessionFactory buildSessionFactory() {
        StandardServiceRegistry standardRegistry = new StandardServiceRegistryBuilder()
                .configure("org/hibernate/example/hibernate.cfg.xml")
                .build();

        Metadata metadata = new MetadataSources(standardRegistry)
                .addAnnotatedClass(CustomerImpl.class)
                .getMetadataBuilder()
                .applyImplicitNamingStrategy(ImplicitNamingStrategyJpaCompliantImpl.INSTANCE)
                .build();

        return metadata.getSessionFactoryBuilder()
                .build();
    }

    public static Session openSession() {
        return sessionFactory.openSession();
    }
}
