package com.devstack.pos.dao;

import com.devstack.pos.dao.custom.impl.CustomerDaoImpl;


public class DaoFactory {

    public enum DaoType{
        CUSTOMER
    }

    private static DaoFactory daoFactory;
    private DaoFactory(){}
    public static DaoFactory getInstance(){
        return (daoFactory==null?daoFactory= new DaoFactory():daoFactory);
    }
    public SuperDao getDao(DaoType daoType){
        switch (daoType){
            case CUSTOMER:
                return new CustomerDaoImpl();
            default:
                return null;
        }
    }
}
