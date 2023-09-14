package com.ncu.hibernate;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.ncu.hibernate.dao.CustomerDao;
import com.ncu.hibernate.entity.Address;
import com.ncu.hibernate.entity.Customer;
import com.ncu.hibernate.entity.Income;

@SpringBootApplication
public class HibernateApplication {

	public static void main(String[] args) {
		SpringApplication.run(HibernateApplication.class, args);
		
		
	}
	
	@Bean
	public CommandLineRunner commandLineRunner(CustomerDao customerDao) {
		return CommandLineRunner -> callCustomer(customerDao);
	}

	private void callCustomer(CustomerDao customerDao) {
		// TODO Auto-generated method stub
		System.out.println("Saving Data");
		
		Address address = new Address("Auto Market", "No 07", "Bhiwani", "Haryana", "127028");
		Income income = new Income(120000.0, "Salary", "Farm");
		Customer cutomerObj1 = new Customer("Sunil", "sunilkharsu02@gmail.com", "9518005924", address, income);
		
		customerDao.insertRecord(cutomerObj1);
		System.out.println("Record saved successfully!");
		System.out.println("--------------------------------------------");
		
		List<Customer> customers = customerDao.getAllCustomers();
		for(Customer customer : customers) {
			System.out.println(customer);
		}
		
//		U
		System.out.println("Updating Record!!");
		System.out.println("---------------------------------------");
		customerDao.updateRecordById(1);
		System.out.println("Record Updated Success");
		System.out.println("---------------------------------------");
//		Updated Records
		System.out.println("Updated Records");
		List<Customer> customers2 = customerDao.getAllCustomers();
		for(Customer customer : customers2) {
			System.out.println(customer);
		}
		System.out.println("Deleted Record!!");
		System.out.println("---------------------------------------");
		customerDao.deleteRecordById(1);
		System.out.println("Deleted Record Success!!");
		System.out.println("---------------------------------------");
		
		System.out.println("Updated Records");
		List<Customer> customers3 = customerDao.getAllCustomers();
		for(Customer customer : customers3) {
			System.out.println(customer);
		}
	}

}
