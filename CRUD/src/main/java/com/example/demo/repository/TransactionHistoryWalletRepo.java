package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Address;
import com.example.demo.model.TransactionHistoryWallet;

public interface TransactionHistoryWalletRepo extends JpaRepository <TransactionHistoryWallet, Integer> {


}
