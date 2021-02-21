package com.example.demo.repository;

import com.example.demo.entity.TransactionAccount;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TransactionAccountRepository extends CrudRepository<TransactionAccount,Long> {
    Optional<TransactionAccount> findByUsername(String username);
}
