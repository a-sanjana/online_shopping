package com.bphc.shoppingbackend.dao;

import java.util.List;

import com.bphc.shoppingbackend.dto.Address;
import com.bphc.shoppingbackend.dto.Cart;
import com.bphc.shoppingbackend.dto.User;

public interface UserDAO {

	// user related operation
	User getByEmail(String email);
	User get(int id);
	List<User> list();	

	boolean add(User user);
	
	// adding and updating a new address
	Address getAddress(int addressId);
	boolean addAddress(Address address);
	boolean updateAddress(Address address);
	Address getBillingAddress(int userId);
	List<Address> listShippingAddresses(int userId);
	

	
}
