package com.qa.accountapp;

import java.util.HashMap;

public class service {
	
	private HashMap <Integer, Account> map =  new HashMap <Integer, Account>();
	private int id = 0;
	
	
	public service() 
	{
		
	}
	
	public void addAccount (String firstName, String lastName, int accountNumber)
	{
		map.put(id, new Account (firstName, lastName, accountNumber) );
		id++;
		
	}
	
	public void removeAccount (int id)
	
	{
		map.remove(id);
	}
	
	
	public HashMap<Integer, Account> getAccounts()
	{
		return map;
	}
	
	

}
