import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class Stack<E> {

	private E[] elemets;
	private final int size;
	private int top;

	public void push(E pushValue) throws Exception {

		if ((top == size - 1)) {
			throw new Exception();
		}
		elemets[++top] = pushValue;

	}

	public E pop() throws Exception {
		if (top == -1) {
			throw new Exception();
		}
		return elemets[top--];
	}

	public Stack(int s) {
		size = s;
		top = -1;
		elemets = (E[]) new Object[size];
	}

	@Override
	public String toString() {
		return "This is Stack";
	}

	// private <E> getType(){
	//
	// this.getClass().getComponentType();
	// return null;
	// }

	@Override
	public boolean equals(Object obj) {

		if (this == obj)
			return true;

		if (!(obj instanceof Stack<?>))
			return false;

		Stack<E> newObj = (Stack<E>) obj;	
		
		if (this.elemets.length == newObj.elemets.length) {

			for (int i = 0; i < this.elemets.length; i++) {

				if (this.elemets[i] != newObj.elemets[i]) {
					return false;
				}
			}

			return true;
		}

		return false;
	}
}
