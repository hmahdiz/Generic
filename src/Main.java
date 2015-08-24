import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		Stack<String> stack = new Stack(1);
		Stack<Integer> stack2 = new Stack(1);

		try {
			stack.push("1");
			stack2.push(1);

			boolean isEquals = stack.equals(stack2);

			System.out.println(isEquals);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		Queue<String> queue = new Queue();
		try {
			queue.push("1");
			queue.push("2");

			// System.out.println(queue.pop());
			// System.out.println(queue.pop());

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public <T extends Comparable<T>> T maximum(T input1, T input2, T input3) {

		T result = input2;
		if (input1.compareTo(input2) > 0) {
			result = input1;
		}
		if (input3.compareTo(result) > 0) {
			result = input3;
		}
		return result;

	}

	public <T> void print(T[] input) {
		for (int i = 0; i < input.length; i++) {
			System.out.println(input[i]);
		}
	}

}
