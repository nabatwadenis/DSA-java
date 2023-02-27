package datastructure;

public class Circularlinkedlist {
	private ListNode last; //this keeps track of the last node
	private int length; //hold the size;
	
	private class ListNode{
		private ListNode next; //the link to next node
		private int data; // the data part
		
		public ListNode(int data) {
			this.data = data;
			
		}
		
	}
	public Circularlinkedlist() {
		last = null;
		length = 0;
	}
	public int length() {
		return length;
	}
	public boolean isEmpty() {
		return length == 0;
	}
	public void createCirc() {
		ListNode first = new ListNode(1);
		ListNode second = new ListNode(5);
		ListNode third = new ListNode(7);
		ListNode fourth = new ListNode(9);
		
		first.next = second;
		second.next = third;
		third.next = fourth;
	}

	public static void main(String[] args) {
		Circularlinkedlist cll = new Circularlinkedlist();
		//cll.length();
		System.out.println(cll.length());
		
		

	}

}
