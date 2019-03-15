package com.hala.bank;

public class Bank {
	
	private int id;
	private String passWord;
	private String useName;
	private String sex;
	private String location;
	private int phoneNum;
	private int balance;
	
	public Bank() {
		super();
	}

	public Bank(int id, String passWord, String useName, String sex, String location, int phoneNum, int balance) {
		super();
		this.id = id;
		this.passWord = passWord;
		this.useName = useName;
		this.sex = sex;
		this.location = location;
		this.phoneNum = phoneNum;
		this.balance = balance;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getUseName() {
		return useName;
	}

	public void setUseName(String useName) {
		this.useName = useName;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(int phoneNum) {
		this.phoneNum = phoneNum;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public String toString(){
		return "账户信息【id:"+id+",passWord:"+passWord
				+",useName:"+useName+",sex:"+sex
				+",location:"+location+",phoneNum:"+phoneNum
				+",balance:"+balance+"】";
	}
	
	public void save(int money){
		int currentMoney=getBalance();
		currentMoney+=money;
		setBalance(currentMoney);
		System.out.println("您成功存入"+money+"元，"
				+ "现在账户余额为："+getBalance());
		
	}
	
	public void withdraw(int money){
		if(money>getBalance()){
			System.out.println("账户余额不足，取钱失败！");
		}else{
			int currentMoney=getBalance();
			currentMoney-=money;
			setBalance(currentMoney);
			System.out.println("成功取出"+money+"元,"
					+ "账户余额为:"+getBalance());
		}
	}
	
	
	
	
	
	
	

}
