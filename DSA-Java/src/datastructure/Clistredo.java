package datastructure;

public class Clistredo {
	Node head, tail;
	class Node{
		Node next;
		int data;
		
		Node(int data){
			this.data = data;
		}
	}
	void insertElement(int value) {
		Node newNode = new Node(value);
		if(head == null) {
			head = newNode;
			tail = newNode;
			tail.next = newNode;
		}else {
			tail.next = newNode;
			tail = newNode;
			tail.next = head;
		}
		
	}
	void deleteElement() {
		if(tail != head) {
			head = head.next;
			tail.next = head;	
		}else {
			head = tail = null;
		}
	}
	void display() {
		Node n1 = head;
		if(tail == null && head == null) {
			System.out.print("Nothing to display");
		}else {
			do {
				System.out.print(n1.data);
				n1 =n1.next;
			}while(n1 != head);
		}
	}

	public static void main(String[] args) {
		Clistredo c3 = new Clistredo();
		c3.display();
		System.out.println();
		c3.insertElement(4);
		c3.insertElement(6);
		c3.insertElement(8);
		c3.insertElement(9);
		c3.display();
		
		

	}

}
