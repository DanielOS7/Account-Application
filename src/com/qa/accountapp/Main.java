package com.qa.accountapp;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {

	public static void main(String[] args) {
		
		service myService = new service ();
		
		
		
		myService.addAccount("Daniel", "Olugbade", 144044);
		
		System.out.println(myService.getAccounts().get(0).toString());
		
		String jsonInString = "";
		ObjectMapper mapper = new ObjectMapper();
		try 
		{
			jsonInString = mapper.writeValueAsString(myService.getAccounts().get(0));
		
			
		}
		catch (JsonProcessingException e) 
		{
			e.printStackTrace();
		}
		
		System.out.println(jsonInString);
		

	}
	
	

}
