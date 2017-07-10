package test;

import java.sql.Date;

import com.magazine.bo.Customer;
import com.magazine.service.CustomerService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
        "classpath:/mvc-dispacther-servlet.xml"})
public class CustomerServiceTest {

    @Autowired
    @Qualifier("customerService")
    CustomerService customerService;
    
    private Customer prepareCustomer(){
    	Customer cust = new Customer();
    	cust.setCustName("capgemini");
    	cust.setAddress("chennai");
    	cust.setEmail("ln@gmail.com");
    	cust.setPhoneNumber("8888888888");
    	cust.setCreateOn(new Date(new java.util.Date().getTime()));
    	cust.setCreateBy("TEST");
    	return cust;
    }
    
    @Test
    public void test_ml_always_return_true() {
    	Customer cust = prepareCustomer();
    	customerService.createCustomer(cust);
    	assertNotNull(cust.getCustid());
    }
}
