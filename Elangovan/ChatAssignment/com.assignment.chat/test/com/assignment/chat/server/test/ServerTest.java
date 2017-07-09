package com.assignment.chat.server.test;

import java.net.ServerSocket;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import com.assignment.chat.server.Server;

@RunWith(JUnit4.class)
public class ServerTest {
	
	private Server serverChat;
	private ServerSocket serverScocket;
	
	
	@Before
	public void init() {
	    serverChat = new Server(1500);
	}
	
	  @Test
	  public void testCreateSocket() {
		  
		  try {
			  serverScocket = serverChat.createSocket(1500);
			  Assert.assertNotNull(serverScocket);
			  Assert.assertEquals(1500, serverScocket.getLocalPort());
		} catch (Exception e) {
			e.printStackTrace();
		}
	  }
	  
	  @Test
	  public void testClientConnect() {
		  
		  try {
			  serverChat.clientConnect(serverScocket);
		  } catch (Exception e) {
			  Assert.fail("Establish to client connection failed");
		  }
	  }
	  
}
