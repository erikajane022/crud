package com.example.demo.model;

import javax.persistence.Entity;
import org.springframework.data.repository.CrudRepository;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Address {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
		private int addressId;
		private String email;
		private String address;
		private String contactPerson;
		private String contactNumber;	
		
		public int getAddressId() {
			return addressId;
		}
		public void setAddressId(int addressId) {
			this.addressId = addressId;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getContactPerson() {
			return contactPerson;
		}
		public void setContactPerson(String contactPerson) {
			this.contactPerson = contactPerson;
		}
		public String getContactNumber() {
			return contactNumber;
		}
		public void setContactNumber(String contactNumber) {
			this.contactNumber = contactNumber;
		}
		public Address() {
		
		}
		
		public Address(int addressId, String email, String address, String contactPerson, String contactNumber) {
			super();
			this.addressId = addressId;
			this.email = email;
			this.address = address;
			this.contactPerson = contactPerson;
			this.contactNumber = contactNumber;
		}
		
		@Override
		public String toString() {
			return "Address [addressId=" + addressId + ", email=" + email + ", address=" + address + ", contactPerson="
					+ contactPerson + ", contactNumber=" + contactNumber + "]";
		}
		
		
}
