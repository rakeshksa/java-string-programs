package com.pattern;

class Sultan{
	String name;
	int age;
	double fund;
	public Sultan(String name, int age, double fund) {
		
		this.name = name;
		this.age = age;
		this.fund = fund;
	}
	
}

public class Tipu {
	int id;
	Sultan s;
	
	void display(int id ,Sultan s) {
		System.out.println(id);
		System.out.println(s.age+" "+s.name+" "+s.fund);
	}

	public static void main(String[] args) {
		Sultan s1=new Sultan("rakesh", 23, 5000000);
		Tipu t1=new Tipu();
		t1.display(010, s1);

	}

}
