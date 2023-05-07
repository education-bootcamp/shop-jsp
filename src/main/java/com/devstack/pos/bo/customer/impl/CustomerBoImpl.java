package com.devstack.pos.bo.customer.impl;

import com.devstack.pos.bo.customer.CustomerBo;
import com.devstack.pos.dao.DaoFactory;
import com.devstack.pos.dao.custom.CustomerDao;
import com.devstack.pos.dto.CustomerDto;
import com.devstack.pos.entity.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerBoImpl implements CustomerBo {

    CustomerDao customerDao =
            (CustomerDao) DaoFactory.getInstance().getDao(DaoFactory.DaoType.CUSTOMER);

    @Override
    public void saveCustomer(CustomerDto dto) {
        customerDao.save(
                new Customer(dto.getCustomerId(), dto.getName(), dto.getAddress(), dto.getSalary())
        );
    }

    @Override
    public CustomerDto findCustomer(long id) {
        Customer customer = customerDao.find(id);
        if (customer != null) {
            return new CustomerDto(
                    customer.getCustomerId(),
                    customer.getName(),
                    customer.getAddress(),
                    customer.getSalary()
            );
        }
        return null;
    }

    @Override
    public void updateCustomer(CustomerDto dto) throws ClassNotFoundException {
        customerDao.update(
                new Customer(dto.getCustomerId(), dto.getName(), dto.getAddress(), dto.getSalary())
        );
    }

    @Override
    public void deleteCustomer(long id) {
        customerDao.delete(id);
    }

    @Override
    public List<CustomerDto> findAllCustomers() {
        List<CustomerDto> dtos = new ArrayList();
        for (Customer customer : customerDao.findAll()
        ) {
            dtos.add(
                    new CustomerDto(
                            customer.getCustomerId(),
                            customer.getName(),
                            customer.getAddress(),
                            customer.getSalary()
                    )
            );
        }
        return dtos;
    }
}
