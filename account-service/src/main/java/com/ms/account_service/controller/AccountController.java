package com.ms.account_service.controller;

import com.ms.account_service.entity.Account;
import com.ms.account_service.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @GetMapping
    public ResponseEntity<?> list(){
        return ResponseEntity.status(200).body(accountService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> get(@PathVariable  String id){
        return ResponseEntity.status(200).body(accountService.get(id));
    }

    @PostMapping
    public ResponseEntity<?> save(@RequestBody(required = false) Account account){
        return ResponseEntity.status(200).body(accountService.save(account));

    }

    @PutMapping
    public ResponseEntity<?> update(@RequestBody Account account){
        return ResponseEntity.status(200).body(accountService.update(account));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable String id){
        return ResponseEntity.status(200).body(accountService.delete(id));
    }
}
