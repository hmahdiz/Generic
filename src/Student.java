public class Student implements Comparable<Student> {

	private String name;
	private int age;
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// public void setName(String name) {
	// this.name = name;
	// }

	@Override
	public String toString() {
		return this.name;
	}

	@Override
	public boolean equals(Object obj){
		if (this.name.equals((Student)obj)) {
			return true;
		}
		return false;
	}
	
	@Override
	public int compareTo(Student input) {
		// TODO Auto-generated method stub
		if (this.equals(input)) {
			return 0;
		}
		if (this.age > input.age) {
			return 1;
		}
		else {
			return -1;
		}
	}

//	@Override
//	public int compareTo(Student input) {
//		// TODO Auto-generated method stub
//		return this.name.compareTo(input.name);
//	}
}
