package com.regnant;

public class DoubleLinkedListTest {
	public static void main(String[] args) {
		DoubleLinkedList a = new DoubleLinkedList();
		a.push(4);
		a.push(5);
		a.push(6);
		System.out.println("Elements in List :");
		a.display();
		System.out.println("Reverse Elements in List :");
		a.displayReverse();
		a.remove(5);
		System.out.println("Elements after removing in list");
		a.display();
		System.out.println("Max element in list:"+a.max());
		System.out.println("Min element in list:"+a.min());
		a.size();        
		System.out.println("size of list= " +a.size());
		
	}
}