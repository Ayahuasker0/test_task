package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User  {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String password;
}
