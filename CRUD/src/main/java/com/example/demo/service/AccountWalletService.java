package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.AccountWallet;
import com.example.demo.model.Address;
import com.example.demo.repository.AccountWalletRepo;
import com.example.demo.repository.AddressRepo;

import java.util.List;

import javax.transaction.Transactional;

@Service
@Transactional
public class AccountWalletService {
	@Autowired
	private AccountWalletRepo accountWalletRepo;

	public void save(AccountWallet accountWallet) {
		accountWalletRepo.save(accountWallet);	
	}
	
}
