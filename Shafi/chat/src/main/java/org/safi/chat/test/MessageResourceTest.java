package org.safi.chat.test;

import static com.jayway.restassured.RestAssured.get;
import static com.jayway.restassured.RestAssured.given;
import static com.jayway.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.junit.Test;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;

public class MessageResourceTest {
	
	@Test
    public void makeSureTheApplicationIsUp() {
        given().when().get("http://localhost:8089/chat").then().statusCode(200);
    }
	
	@Test
    public void makeSureTheMessageIsReceived() {
        given().when().get("http://localhost:8089/chat/webapi/messages").then().statusCode(200);
    }
	
	@Test
    public void makeSureTheMessageWithMessageIdIsReceived() {
        given().when().get("http://localhost:8089/chat/webapi/messages/1").then().statusCode(200);
    }
	
	/*@Test
    public void invalidMessageDetails() {
        given().when().get("http://localhost:8089/chat/webapi/messages/3").then().statusCode(500);
    }*/
	
	@Test
	public void postMessages() {
		String myJson = "{\"firstName\":\"Jimi \"}";
		RestAssured.baseURI = "http://localhost:8089/chat/webapi/";

		Response r = given().contentType("application/json").body("{\"firstName\":\"Jimi \"}").when().post("");

		String body = r.getBody().asString();
		System.out.println(body);

	}
	
	
	@Test
    public void getAllUsers() {
        given().when().get("http://localhost:8089/chat/webapi/users").then().statusCode(200);
    }
	
	@Test
    public void getParticularUser() {
        given().when().get("http://localhost:8089/chat/webapi/users/adminSafi").then().statusCode(200);
    }
	
	@Test
	public void postUsers() {
		String myJson = "{\"firstName\":\"Jimi \"}";
		RestAssured.baseURI = "http://localhost:8089/chat/webapi/users";

		Response r = given().contentType("application/json").body("{\"firstName\":\"Jimi \"}").when().post("");

		String body = r.getBody().asString();
		System.out.println(body);

	}
	
	
 
}