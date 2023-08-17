package com.batch8group4.onlinebank.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.batch8group4.onlinebank.model.Account;
import com.batch8group4.onlinebank.model.Admin;
import com.batch8group4.onlinebank.service.AccountService;

@CrossOrigin
@RestController
@RequestMapping("/api/account")
public class AccountController {
	@Autowired
	AccountService accountService;
	
	
}
