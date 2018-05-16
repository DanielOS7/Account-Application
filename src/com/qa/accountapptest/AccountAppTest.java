package com.qa.accountapptest;

import com.qa.accountapp.*;

import static org.junit.Assert.*;

import org.junit.Test;

public class AccountAppTest {

	@Test
	public void testAddAccount() {


		service hmap = new service();
		hmap.addAccount("Daniel", "Olugbade", 144044);
		assertEquals("Wrong First Name.", "Daniel", hmap.getAccounts().get(0).getFirstName());
		assertEquals("Wrong Last Name.", "Olugbade", hmap.getAccounts().get(0).getLastName());
		assertEquals("Wrong Account Number.", 144044, hmap.getAccounts().get(0).getAccountNumber());
		
	}
	
	@Test
	public void testRemoveAccount() {


		service hmap = new service();

		hmap.removeAccount(0);
		assertEquals("Account not removed", null, hmap.getAccounts().get(0));
		
		
		
	}
	
	@Test
	public void testListAccount() {


		service hmap = new service();
		hmap.addAccount("Daniel", "Olugbade", 144044);
		hmap.removeAccount(0);
		assertEquals("List is not empty", null, hmap.getAccounts().get(0));
		
		
		
	}

}
