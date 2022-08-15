package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.Address;
import com.example.demo.repository.AddressRepo;

import java.util.List;

import javax.transaction.Transactional;

@Service
@Transactional
public class AddressService {
	@Autowired
	private AddressRepo addressRepo;
	
	public void save(Address address) {
		addressRepo.save(address);	
	}

	public List<Address> listAll() {
		return addressRepo.findAll();
	}

}
