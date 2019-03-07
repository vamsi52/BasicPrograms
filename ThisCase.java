package com.regnant;

public class ThisCase {
	int a, b, c;
	String name;

	ThisCase(int a, int b, int c, String name) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.name = name;
	}
	
	void mynumber(int a, int b, int c) {
		System.out.println("local variable of a  :" + a);
		System.out.println("class variable of a  :" + this.a);
		System.out.println("local variable of b  :" + b);
	}

	void myname(String name) {
		System.out.println("local variable name  :" + name);
		System.out.println("class variable name  :" + this.name);
	}
}
