package com.wiley.beginningspring.ch6;

import com.wiley.beginningspring.ch6.service.AccountService;
import com.wiley.beginningspring.ch6.service.AccountServiceJdbcTxImpl;

public class MainApp {
    public static void main(String[] args) {

        AccountService accountService = new AccountServiceJdbcTxImpl();
        accountService.transferMoney(100L, 101L, 5.0);
    }
}
