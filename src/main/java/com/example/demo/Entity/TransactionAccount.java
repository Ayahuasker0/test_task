package com.example.demo.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class TransactionAccount {

    @Id
    @GeneratedValue
    private Long id;
    private String accountId;
    private Double sum;

    @OneToMany
}
