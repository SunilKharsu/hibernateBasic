package com.ncu.hibernate.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ncu.hibernate.entity.Customer;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
@Repository
public class CustomerDaoImpl implements CustomerDao {

	@Autowired
	private EntityManager entityManager;
	@Override
	@Transactional
	public void insertRecord(Customer customer) {
		// TODO Auto-generated method stub
		entityManager.persist(customer);
	}
	@Override
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		TypedQuery<Customer> typedQuery = entityManager.createQuery("from Customer", Customer.class);
		return typedQuery.getResultList();
	}
	

	@Override
	public Customer getCustomerById(int id) {
		// TODO Auto-generated method stub
	TypedQuery<Customer> typedQuery = entityManager.createQuery("from Customer where customId=:id",Customer.class);
	typedQuery.setParameter("id", id);
	return typedQuery.getSingleResult();
	}



	@Override
	@Transactional
	public void updateRecordById(int id) {
Customer customer =   entityManager.find(Customer.class,id);
if(customer!=null) {
	customer.setCustomerNameString("New Name");
    customer.setCustomerEmail("new-email@example.com");
    entityManager.merge(customer);

    System.out.println("Record updated Successfully!!");
}else {
    System.out.println("Customer with ID " + id + " not found.");
    }
	}



	@Override
	@Transactional
	public void deleteRecordById(int id) {
		Customer customer =   entityManager.find(Customer.class,id);
		if(customer!=null) {
		entityManager.remove(customer);

		    System.out.println("Record Deleted Successfully!!");
		}else {
		    System.out.println("Customer with ID " + id + " not found.");
		    }
		
	}

}
