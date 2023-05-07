package com.devstack.pos.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/*lombock*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
/*@Data , don't use it with entity*/
@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long customerId;
    private String name;
    private String address;
    private double salary;
}
