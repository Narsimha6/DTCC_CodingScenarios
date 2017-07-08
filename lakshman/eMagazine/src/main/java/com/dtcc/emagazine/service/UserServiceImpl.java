package com.dtcc.emagazine.service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import com.dtcc.emagazine.model.Customer;

@Service("userService")
public class UserServiceImpl implements UserService {

	private static final AtomicLong counter = new AtomicLong();

	private static List<Customer> customers;

	static {
		customers = populateDummyUsers();
	}

	public List<Customer> findAllUsers() {
		return customers;
	}

	public Customer findById(long id) {
		for (Customer user : customers) {
			if (user.getId() == id) {
				return user;
			}
		}
		return null;
	}

	public Customer findByName(String name) {
		for (Customer user : customers) {
			if (user.getName().equalsIgnoreCase(name)) {
				return user;
			}
		}
		return null;
	}

	public void saveUser(Customer customer) {
		customer.setId(counter.incrementAndGet());
		customers.add(customer);
	}

	public void updateUser(Customer customer) {
		int index = customers.indexOf(customer);
		customers.set(index, customer);
	}

	public boolean isUserExist(Customer customer) {
		return findByName(customer.getName()) != null;
	}

	public void deleteAllUsers() {
		customers.clear();
	}

	private static List<Customer> populateDummyUsers() {
		List<Customer> users = new ArrayList<Customer>();
		users.add(new Customer(counter.incrementAndGet(), "Rani", 30, "Chennai","123234234","rani@abc.com"));
		users.add(new Customer(counter.incrementAndGet(), "Salman", 32, "Mumbai","123234098","salman@abc.com"));
		users.add(new Customer(counter.incrementAndGet(), "Ajay", 32, "Mumbai","123234098","salman@abc.com"));
		users.add(new Customer(counter.incrementAndGet(), "Vijay", 31, "Kolkata","123234345","vijay@abc.com"));
		users.add(new Customer(counter.incrementAndGet(), "Sachin", 35, "Delhi","123234098","sachin@abc.com"));
		return users;
	}

}