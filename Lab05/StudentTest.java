//2110883 김혜수
//22.10.06
//Lab05 Human Student
package Lab05;

import java.util.ArrayList;
import java.util.Scanner;

class Human {
	private String name;
	private int age;

	public Human(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "이름:" + name + ", 나이:" + age;
	}

}

class Student extends Human {
	private String major;
	private String sID;

	public Student(String name, int age, String major, String sID) {
		super(name, age);
		this.major = major;
		this.sID = sID;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getsID() {
		return sID;
	}

	public void setsID(String sID) {
		this.sID = sID;
	}

	@Override
	public String toString() {
		return "[학생정보]이름:" + super.toString() + ", 전공:" + major + ", 학번:" + sID;
	}

}

public class StudentTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Human[] arrayofHuman = new Human[3];

		for (int i = 0; i < 3; i++) {

			System.out.print("[" + (i + 1) + "]Human 입력:");
			String name = sc.next();
			int age = sc.nextInt();

			arrayofHuman[i] = new Human(name, age);

		}

		Student[] arrayofStudent = new Student[3];

		for (int i = 0; i < 3; i++) {

			System.out.print("[" + (i + 1) + "]Student 입력:");
			String name = sc.next();
			int age = sc.nextInt();
			String major = sc.next();
			String sID = sc.next();

			arrayofStudent[i] = new Student(name, age, major, sID);

		}

		for (int i = 0; i < 3; i++) {
			System.out.println(arrayofHuman[i]);
		}
		for (int i = 0; i < 3; i++) {
			System.out.println(arrayofStudent[i]);
		}

	}

}
