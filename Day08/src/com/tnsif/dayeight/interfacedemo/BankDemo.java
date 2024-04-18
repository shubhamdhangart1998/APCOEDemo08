package com.tnsif.dayeight.interfacedemo;

public class BankDemo {

	public static void main(String[] args) {

		
		SavingAccount s1=new SavingAccount("Aakask", "Pune", 1234, 17000);
		s1.deposit(10000);
		System.out.println(s1);
		
		s1.withdraw(21000);
		System.out.println(s1);
	}

}
