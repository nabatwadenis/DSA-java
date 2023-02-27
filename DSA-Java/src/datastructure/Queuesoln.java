package datastructure;

class QueueUsingArray{
	int front_queue, rear_queue;
	int capacity_of_queue;
	static int[] q1;
	
	QueueUsingArray(int size){
		capacity_of_queue = size;
		q1 = new int[capacity_of_queue];	
	}
	void enqueue(int value) {
		if(rear_queue == capacity_of_queue) {
			System.out.println("Queue is full");
		}else {
			q1[rear_queue] = value;
			rear_queue++;
		}
		
	}
	void dequeue() {
		if(rear_queue == 0) {
			System.out.println("Queue is empty cannot delete");
		}else {
			for(int i = 0; i< rear_queue -1 ; i++) {
				q1[i] = q1[i + 1];	
			}
			rear_queue--;
		}
	}
	void display() {
		if(rear_queue == 0) {
			System.out.println("Queue is empty nothing to display");
		}else {
			for(int j =0; j < rear_queue; j++) {
				System.out.println(q1[j]);
			}
		}
		
	}
	
}
public class Queuesoln {

	public static void main(String[] args) {
		QueueUsingArray q2 = new QueueUsingArray(5);
		q2.enqueue(2);
		q2.enqueue(7);
		q2.enqueue(4);
		q2.enqueue(9);
		q2.enqueue(8);
		q2.enqueue(5);
		q2.enqueue(6);
		//q2.dequeue();
		q2.display();
	}

}
