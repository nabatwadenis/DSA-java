package datastructure;


class Queue{
	int rear, capacity;
	static int q1[];
	
	Queue(int size){
		capacity = size;
		q1 = new int[capacity];	
	}
	
	void enqueue(int value) {
		if(rear == capacity) {
			System.out.print("Queue already full");	
		}else {
			q1[rear] = value;
			rear++;
		}
	}
	void dequeue() {
		if(rear == 0) {
			System.out.print("The queue is empty nothing to delete");
		}else {
			for(int i = 0; i< rear; i++) {
				q1[i] = q1[i + 1];
			}
			rear--;
		}
	}
	void display() {
		if(rear == 0) {
			System.out.print("Nothing to display");
		}else {
			for(int i=0; i<rear;i++) {
				System.out.print(q1[i]);
			}
		}
	}
	
}
public class Qsummary {

	public static void main(String[] args) {
		Queue q2 = new Queue(5);
		q2.enqueue(3);
		q2.enqueue(5);
		q2.enqueue(7);
		q2.enqueue(8);
		q2.enqueue(9);
		q2.display();

	}

}
