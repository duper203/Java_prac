//2110883 김혜수
//2022.09.22
//LAB03_05 날짜 출력하
package Lab03;

import java.util.Scanner;

class Mydate {
	private int year;
	private int month;
	private int date;

	public Mydate(int y, int m, int d) {
		year = y;
		month = m;
		date = d;

	}

	public String printDate1() {
		return (year + "." + month + "." + date);
	}

	public String printDate2() {
		String[] months = { "Jan", "Feb", "mar", "apr", "may", "jun", "jul", "aug", "sep", "oct", "nov", "dec" };
		return (months[month - 1] + "." + date + "." + year);
	}
}

public class MydateTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("연도 : ");
		int y = sc.nextInt();
		System.out.print("월 : ");
		int m = sc.nextInt();
		System.out.print("일 : ");
		int d = sc.nextInt();

		Mydate date = new Mydate(y, m, d);
		System.out.println(date.printDate1());
		System.out.println(date.printDate2());
	}

}
