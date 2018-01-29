package Queue;

public class App {

	public static void main(String[] args) {
		queue q = new queue();
		
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		
//		q.dequeue();
//		q.dequeue();
//		q.dequeue();
//		q.dequeue();
		
		q.traverseQueue();

	}

}
