package com.hala.bank;


public class BankTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bank one=new Bank(001,"halaww","小明","男","河北省",167343562,2000000);
		
		System.out.println(one.toString());
		
		one.save(100000);
		one.withdraw(1000000);
		
	}

}
