package com.qa.accountapp;

public class Main {

	public static void main(String[] args) {
		
		service myService = new service ();
		
		
		myService.addAccount("Daniel", "Olugbade", 144044);
		
		System.out.println(myService.getAccounts().get(0).toString());

	}

}
