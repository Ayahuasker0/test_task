package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class TransactionAccount {

    @Id
    @GeneratedValue
    private Long id;
    private String transactionAccountId;
    private Double sum;
}
