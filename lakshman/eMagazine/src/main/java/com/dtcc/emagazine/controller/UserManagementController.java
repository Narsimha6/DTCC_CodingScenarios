package com.dtcc.emagazine.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.dtcc.emagazine.model.Customer;
import com.dtcc.emagazine.service.UserService;
import com.dtcc.emagazine.util.CustomErrorType;

@RestController
@RequestMapping("/api")
public class UserManagementController {

	public static final Logger logger = LoggerFactory
			.getLogger(UserManagementController.class);

	@Autowired
	UserService userService; 

	@RequestMapping(value = "/user/", method = RequestMethod.GET)
	public ResponseEntity<List<Customer>> listAllUsers() {
		if(logger.isInfoEnabled()){
			logger.info("Listing All Users");
		}
		List<Customer> customers = userService.findAllUsers();
		if (customers.isEmpty()) {
			return new ResponseEntity(HttpStatus.NO_CONTENT);
			// You many decide to return HttpStatus.NOT_FOUND
		}
		return new ResponseEntity<List<Customer>>(customers, HttpStatus.OK);
	}

	
	@RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> getUser(@PathVariable("id") long id) {
		if(logger.isInfoEnabled()){
			logger.info("Fetching User with id {}", id);
		}
		Customer user = userService.findById(id);
		if (user == null) {
			logger.error("User with id {} not found.", id);
			return new ResponseEntity<CustomErrorType>(new CustomErrorType("User with id " + id
					+ " not found"), HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Customer>(user, HttpStatus.OK);
	}


	@RequestMapping(value = "/user/", method = RequestMethod.POST)
	public ResponseEntity<?> createUser(@RequestBody Customer user,
			UriComponentsBuilder ucBuilder) {
		if(logger.isInfoEnabled()){
			logger.info("Creating User : {}", user);
		}
		if (userService.isUserExist(user)) {
			logger.error("Unable to create. A User with name {} already exist",
					user.getName());
			return new ResponseEntity<CustomErrorType>(new CustomErrorType(
					"Unable to create. A User with name " + user.getName()
							+ " already exist."), HttpStatus.CONFLICT);
		}
		userService.saveUser(user);

		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(ucBuilder.path("/api/user/{id}")
				.buildAndExpand(user.getId()).toUri());
		return new ResponseEntity<String>(headers, HttpStatus.CREATED);
	}

	
	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/user/{id}", method = RequestMethod.PUT)
	public ResponseEntity<?> updateUser(@PathVariable("id") long id,
			@RequestBody Customer user) {
		logger.info("Updating User with id {}", id);

		Customer currentUser = userService.findById(id);

		if (currentUser == null) {
			logger.error("Unable to update. User with id {} not found.", id);
			return new ResponseEntity(new CustomErrorType(
					"Unable to upate. User with id " + id + " not found."),
					HttpStatus.NOT_FOUND);
		}

		currentUser.setName(user.getName());
		currentUser.setAge(user.getAge());
		currentUser.setPhone(user.getPhone());
		currentUser.setAddress(user.getAddress());
		currentUser.setEmail(user.getEmail());

		userService.updateUser(currentUser);
		return new ResponseEntity<Customer>(currentUser, HttpStatus.OK);
	}

	
}