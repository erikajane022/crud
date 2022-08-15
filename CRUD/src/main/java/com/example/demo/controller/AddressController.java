package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.AccountWallet;
import com.example.demo.model.Address;
import com.example.demo.model.TransactionHistoryWallet;
import com.example.demo.service.AccountWalletService;
import com.example.demo.service.AddressService;
import org.springframework.web.servlet.ModelAndView;



@RestController
@RequestMapping("/wow")
public class AddressController {
	//User f = null;
	@Autowired
	private AddressService addressService;
	
	
	@PostMapping(value = "/save-address")
	public String saveAddress(@RequestBody Address address) {
		//address.setEmail(f.getEmail());
		//address.getEmail();
		addressService.save(address);
		return "successfully saved address!";
	}
	
	@GetMapping(value = "/address")
	public List<Address> address() {
		return addressService.listAll();
		
	    //ModelAndView mav = new ModelAndView("address");
	    //mav.addObject("listAddress", listAddress);    
	    
	}
	
}
