package com.assignment.chat.client.test;

import java.net.ServerSocket;
import java.net.Socket;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import com.assignment.chat.client.Client;
import com.assignment.chat.server.Server;

@RunWith(JUnit4.class)
public class ClientTest {
	
	private Server serverChat;
	private Client clientChat;
	private ServerSocket serverScocket;
	
	
	@Before
	public void init() {
	    clientChat = new Client("localhost", 1500, "Test");
	}
	
	  @Test
	  public void testCreateSocket() {
		  
		  try {
			  Socket clientSocket = clientChat.setSocket("localhost", 1500);
			  Assert.assertNotNull(clientSocket);
		} catch (Exception e) {
			e.printStackTrace();
		}
	  }
	  
	  @Test
	  public void testStart() {
		  
		  try {
			  Socket clientSocket = clientChat.setSocket("localhost", 1500);
			  Assert.assertTrue(clientChat.start());
		  } catch (Exception e) {
			  e.printStackTrace();
		  }
	  }
	  
	  @Test
	  public void testStartFail() {
		  
		  try {
			  Socket clientSocket = clientChat.setSocket("lo", 1500);
			  clientChat.start();
		  } catch (Exception e) {
			  Assert.assertEquals("lo", e.getMessage());
		  }
	  }
	  
	  @Test
	  public void testCreateSocketFail() {
		  
		  try {
			  Socket clientSocket = clientChat.setSocket("lo", 1500);
		} catch (Exception e) {
			 Assert.fail("Establish to connection failed");
		}
	  }
	  
}
