package com.example.demo.model;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.CreationTimestamp;

@Entity
public class TransactionHistoryWallet {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int transactionWalletId;
	private String email;
	private double amount;
	@CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
	private Date addDate;
	
	public int getTransactionWalletId() {
		return transactionWalletId;
	}
	public void setTransactionWalletId(int transactionWalletId) {
		this.transactionWalletId = transactionWalletId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getAddDate() {
		return addDate;
	}
	public void setAddDate(Date addDate) {
		this.addDate = addDate;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public TransactionHistoryWallet() {

	}
	public TransactionHistoryWallet(int transactionWalletId, String email, Date addDate, double amount) {
		this.transactionWalletId = transactionWalletId;
		this.email = email;
		this.addDate = addDate;
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "TransactionHistoryWallet [transactionWalletId=" + transactionWalletId + ", email=" + email
				+ ", addDate=" + addDate + ", amount=" + amount + "]";
	}
	
}
