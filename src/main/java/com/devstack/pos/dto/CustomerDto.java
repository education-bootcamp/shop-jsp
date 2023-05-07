package com.devstack.pos.dto;

import lombok.Data;

@Data
public class CustomerDto {
    private long customerId;
    private String name;
    private String address;
    private double salary;
}
