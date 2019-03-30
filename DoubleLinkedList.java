package com.regnant;

public class DoubleLinkedList {
	Node1 current = null;
	Node1 head = null;

	void push(int data) {
		Node1 n = new Node1();
		n.data = data;
		if (head == null) {
			head = n;
			current = n;
		} else {
			current.nextnode = n;
			n.previous = current;
			current = n;
		}
	}

	void display() {
		Node1 n = head;
		while (n != null) {
			System.out.println(n.data);
			n = n.nextnode;
		}
	}
	//reverse orer of elements
	void displayReverse() {
		Node1 n = current;
		while (n != null) {
			System.out.println(n.data);
			n = n.previous;
		}
	}

	// Removing node by data
	void remove(int data) {
		Node1 t = null;
		Node1 n = head;
		while (n != null) {
			if (n.data == data) {
				t.nextnode = n.nextnode;
				break;
			}
			t = n;
			n = n.nextnode;
		}
		System.out.println("removed element:"+data);
	}
	// max element
	int max(){
		int max=head.data;
		Node1 t= head;
		while(t!=null){
			if(t.data>max){
				max=t.data;
			}
			t=t.nextnode;
		}
		return max;
		}
	// min element
		int min(){
			int min=head.data;
			Node1 t= head;
			while(t!=null){
				if(t.data<min){
					min=t.data;
				}
				t=t.nextnode;
			}
			return min;
			}
	//List size
	int size(){
		int size=0;
		Node1 t=head;
		while (t!=null){
			size++;
			t=t.nextnode;
		}
		return size;
	}
		
	
	
}