package com.example.demo.repository;

import com.example.demo.model.AccountWallet;
import com.example.demo.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountWalletRepo extends JpaRepository <AccountWallet, Integer>{
	

}