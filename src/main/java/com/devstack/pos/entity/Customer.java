package com.devstack.pos.entity;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

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
    @OneToMany(
            fetch = FetchType.EAGER,
            cascade = CascadeType.ALL,
            mappedBy = "customer")
    private List<Order> orders = new ArrayList<>();

}
