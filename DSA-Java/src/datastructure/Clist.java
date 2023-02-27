package datastructure;

public class Clist {
	
	Node head, tail;//define a node head and tail
	
	class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data =data;
		}
	}
	void insertElements(int ele) {
		Node newNode = new Node(ele);
		if(head == null) { //start the circular linked list
			head = newNode;
			tail = newNode;
			tail.next = newNode;
		}else { //insert into the linked list
			tail.next = newNode;
			tail = newNode;
			tail.next = head;
		}	
	}
	void displayElements() {
		Node n1 = head;
		if(tail == null && head == null) {
			System.out.print("Circular linked list empty");
		}else {
			do {
				System.out.print(n1.data);
				n1 = n1.next;
				
			}while(n1 != head);
		}
	}
	void deleteElements() {
		if(tail != head) {
			head = head.next;
			tail.next = head;
			
		}else {
			head=tail=null;
			
		}
	}

	public static void main(String[] args) {
		Clist c = new Clist();
		c.insertElements(2);
		c.insertElements(7);
		c.insertElements(8);
		c.deleteElements();
		c.displayElements();
		
		

	}

}
