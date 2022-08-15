package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.AccountWallet;
import com.example.demo.model.TransactionHistoryWallet;
import com.example.demo.repository.TransactionHistoryWalletRepo;
import com.example.demo.service.AccountWalletService;


@RestController
@RequestMapping("/wow")
public class AccountWalletController {
	@Autowired
	private AccountWalletService accountWalletService;
	
	@Autowired
	TransactionHistoryWalletRepo transactionHistoryWalletRepo;
	
	TransactionHistoryWallet transactionHistoryWallet;
	
	@PostMapping(value = "/save-wallet")
	public String saveWallet(@RequestBody AccountWallet accountWallet) {
		if(accountWallet != null) {
			//address.setEmail(f.getEmail());
			//address.getEmail();
			accountWalletService.save(accountWallet);
			return "successfully created wallet!";
			
		}else {
			return "Wallet Already Existed!";
		}
		
	}
	
	@PutMapping(value = "/add-balance")
	public String addWallet(@RequestBody AccountWallet accountWallet, @RequestBody TransactionHistoryWallet transactionHistoryWallet) {
		
		TransactionHistoryWallet u = new TransactionHistoryWallet();
		
		u.getTransactionWalletId();
		u.getEmail();
		u.getAmount();
		
		transactionHistoryWalletRepo.save(u);
		
		double bal = accountWallet.getBalance();
		double amt = transactionHistoryWallet.getAmount();
		double newbal = bal + amt;
		System.out.println(bal);
		System.out.println(amt);
		accountWallet.setBalance(newbal);
		return "Successfully Added Balance!";
		
	}
}
