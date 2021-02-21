package com.example.demo.Entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Transaction {

    @Id
    @GeneratedValue
    private Long id;

    private Double writingOffSum;
    private Date date;

    @ManyToOne
    @JoinColumn(name = "transactionAccount_id")
    private TransactionAccount transactionAccount;

    public Transaction(){}

    Transaction(Double writingOffSum, Date date){
        this.writingOffSum = writingOffSum;
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getWritingOffSum() {
        return writingOffSum;
    }

    public void setWritingOffSum(Double writingOffSum) {
        this.writingOffSum = writingOffSum;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
