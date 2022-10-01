//2110883 김혜수
//2022.09.22
//LAB03_03 Movie 정보 출력하기 
package Lab03;
import java.util.Scanner;
class Movie{
	private String title;
	private String director;
	private int year;
	private double rating; 
	
	public Movie(String s, double rating, String d, int year) {
		title = s; director = d; this.year = year; this.rating = rating;
	}
	@Override
	public String toString() {
		return("Movie["+"title = "+title+", "+"rating = "+rating+", "+"director = "+director+", "+"year = "+year+"]");
	}
}

public class MovieTest {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.print("제목: ");
		String s =sc.nextLine();
		System.out.print("감독 : ");
		String d =sc.nextLine();
		System.out.print("연도: ");
		int year =sc.nextInt();
		System.out.print("평: ");
		double rating =sc.nextDouble();
		
		Movie m = new Movie(s, rating,d, year);
		System.out.println(m);
	}
}
