package cs2025.hfut.ch2;

public class Student {
	String name;
	String num;
	int score;
	public Student(String name, String num, int score) {
		super();
		this.name = name;
		this.num = num;
		this.score = score;
	}
	void eat()
	{
		System.out.println("Student is eating.");
	}
}
