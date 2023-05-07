package com.devstack.pos.bo.customer;

import com.devstack.pos.bo.SuperBo;
import com.devstack.pos.dto.CustomerDto;
import com.devstack.pos.entity.Customer;

import java.util.List;

public interface CustomerBo extends SuperBo {
    public void saveCustomer(CustomerDto dto);
    public CustomerDto findCustomer(long id);
    public void updateCustomer(CustomerDto dto);
    public void deleteCustomer(long id);
    public List<CustomerDto> findAllCustomers();
}
