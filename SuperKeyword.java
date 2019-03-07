package com.regnant;

public class SuperKeyword {
	int a, b, c;

}

class Man extends SuperKeyword {
	int a, b, c;

	Man(int a, int b) {
		this.a = a;
		this.b = b;
	}

	void add(int a, int b) {
		super.a = a;
		super.b = b;
		super.c = super.a + super.b;
		super.c = this.a + this.b;
	}

	void display() {
		System.out.println("Derived class a :" + a);
		System.out.println("Derived class b :" + b);
		System.out.println("Derived class c :" + c);

		System.out.println("********************");

		System.out.println("Base class    a :" + super.a);
		System.out.println("Base class    b :" + super.b);
		System.out.println("Base class    c :" + super.c);
	}
}
