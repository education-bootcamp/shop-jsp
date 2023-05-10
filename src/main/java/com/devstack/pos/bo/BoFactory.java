package com.devstack.pos.bo;

import com.devstack.pos.bo.customer.impl.CustomerBoImpl;


public class BoFactory {

    public enum BoType{
        CUSTOMER
    }

    private static BoFactory boFactory;
    private BoFactory(){}
    public static BoFactory getInstance(){
        return (boFactory==null?boFactory= new BoFactory():boFactory);
    }
    public SuperBo getBo(BoType boType){
        switch (boType){
            case CUSTOMER:
                return new CustomerBoImpl();
            default:
                return null;
        }
    }
}
