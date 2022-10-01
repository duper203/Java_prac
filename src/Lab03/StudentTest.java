//2110883 김혜수
//2022.09.22
//LAB03_04 Student 정보 출력하
package Lab03;

import java.util.Scanner;

class Student {
	private String name;
	private String id;
	private int age;

	public Student(String n, String id, int a) {
		name = n;
		this.id = id;
		age = a;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getid() {
		return id;
	}

	public void setid(String phone) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return ("Student[" + "name = " + name + ", " + "학번 = " + id + ", " + "나이 = " + age + "]");
	}
}

public class StudentTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("학생의 이름 : ");
		String name = sc.nextLine();
		System.out.print("학생의 학번 : ");
		String id = sc.nextLine();
		System.out.print("학생의 나이 : ");
		int age = sc.nextInt();

		Student s1 = new Student(name, id, age);
		System.out.println(s1);

	}

}
