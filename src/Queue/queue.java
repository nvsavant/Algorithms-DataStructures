package Queue;

import java.util.LinkedList;

public class queue {
	private LinkedList<Integer> queue;

	public queue() {
		this.queue = new LinkedList<Integer>();
	}

	public void enqueue(int data) {
		this.queue.addFirst(data);
	}

	public int dequeue() {
		if (this.queue.isEmpty())
			return -1;
		return this.queue.removeLast();
	}

	public int peek() {
		if (this.queue.isEmpty())
			return -1;
		return this.queue.getLast();

	}

	public int size() {
		return this.queue.size();
	}
	
	public void traverseQueue() {
		for (Integer item : queue) {
			System.out.print(item + "-->");
		}
		System.out.println("NULL");
	}

}
