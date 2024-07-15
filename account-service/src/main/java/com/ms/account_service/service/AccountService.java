package com.ms.account_service.service;

import com.ms.account_service.entity.Account;
import com.ms.account_service.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;


    public Account get(String id) {
        return accountRepository.findById(id).orElseThrow(() -> new RuntimeException("Account not found"));
    }

    public Account save(Account account) {
        return accountRepository.save(account);

    }

    public Account update(Account account) {
        return null;
    }

    public Account delete(String id) {
        return new Account();

    }

    public List<Account> getAll() {
        return accountRepository.findAll();
    }
}
