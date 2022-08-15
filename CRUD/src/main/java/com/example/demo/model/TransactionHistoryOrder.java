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
public class TransactionHistoryOrder {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int transactionOrderId;
	private String email;
	private int orderAmount;
	@CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
	private Date orderDate;
	public int getTransactionId() {
		return transactionOrderId;
	}
	public void setTransactionId(int transactionId) {
		this.transactionOrderId = transactionId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getOrderAmount() {
		return orderAmount;
	}
	public void setOrderAmount(int orderAmount) {
		this.orderAmount = orderAmount;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public TransactionHistoryOrder() {

	}
	
	public TransactionHistoryOrder(int transactionOrderId, String email, int orderAmount, Date orderDate) {
		this.transactionOrderId = transactionOrderId;
		this.email = email;
		this.orderAmount = orderAmount;
		this.orderDate = orderDate;
	}
	
	@Override
	public String toString() {
		return "TransactionHistoryOrder [transactionOrderId=" + transactionOrderId + ", email=" + email + ", orderAmount="
				+ orderAmount + ", orderDate=" + orderDate + "]";
	}
	
}
