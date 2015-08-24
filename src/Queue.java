public class Queue<E> {

	private int rear;
	private int front;
	private final int size;
	private E[] elements;

	public Queue() {
		size = 2;
		front = 0;
		rear = 0;

		elements = (E[]) new Object[size];

	}

	public void push(E pushValue) throws Exception {

		if (rear == size) {
			throw new Exception("Queue is full !");
		}

		elements[rear] = pushValue;
		rear++;

	}

	public E pop() throws Exception {

		if (front == rear) {
			throw new Exception("Queue is empty !");
		}

		return elements[front++];

	}

	@Override
	public String toString() {
		return "This is Queue";
	}

	@Override
	public boolean equals(Object obj) {
		
		if (obj instanceof Queue) {
			Queue q = (Queue) obj;			
		}
		
		
		return true;
	}
}
