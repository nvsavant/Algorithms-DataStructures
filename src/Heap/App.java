package Heap;

public class App {

	public static void main(String[] args) {
		heap h1 = new heap(10);
		
		h1.insert(100);
		h1.insert(30);
		h1.insert(90);
		h1.insert(40);
		h1.insert(-70);
		h1.insert(60);
		h1.insert(-20);
		
		h1.heapSort();
		

	}

}
