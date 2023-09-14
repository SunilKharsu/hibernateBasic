package com.ncu.hibernate.dao;

import java.util.List;

import com.ncu.hibernate.entity.Customer;

public interface CustomerDao {
	public void insertRecord(Customer customer);

	public List<Customer> getAllCustomers();
	public Customer getCustomerById(int id);
	public void updateRecordById(int id);
	public void deleteRecordById(int id);
}
