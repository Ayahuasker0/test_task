package com.example.demo.config;


import com.example.demo.entity.TransactionAccount;
import com.example.demo.repository.TransactionAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class TestTransactionAccountConfigurer {

    @Autowired
    private TransactionAccountRepository repository;

    @EventListener
    public void createTestTransactionAccounts(ApplicationStartedEvent event) {
        repository.save(TransactionAccount.builder()
                .balance( new BigDecimal("8.00"))
                .username("user1")
                .build()
        );

        repository.save(TransactionAccount.builder()
                .balance( new BigDecimal("8.00"))
                .username("user2")
                .build()
        );
    }
}
