package com.devstack.pos.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CustomerDto {
    private long customerId;
    private String name;
    private String address;
    private double salary;
}
