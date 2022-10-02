package Lab04;

import java.util.ArrayList;
import java.util.Scanner;

class Book {
	private String title;
	private String score;
	static int count = 0;

	public Book(String title, String score) {
		super();
		this.title = title;
		this.score = score;
		count++;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", score=" + score + "]";
	}

}

public class BookTest3 {

	public static void main(String[] args) {
		Book[] b = new Book[100];

		int a = 0;

		while (a != 1) {
			Scanner scan = new Scanner(System.in);
			System.out.println("===============================");
			System.out.println("1. 책 등록 ");
			System.out.println("2. 책 검색 ");
			System.out.println("3. 모든 책 출력 ");
			System.out.println("4. 종료 ");
			System.out.println("===============================");
			System.out.print("메뉴를 선택하시오:");
			int num = scan.nextInt();

			switch (num) {
			case 1:
				System.out.print("책 제목 ");
				String title = scan.next();
				System.out.print("책 평점 ");
				String score = scan.next();

				b[Book.count] = new Book(title, score);

				break;

			case 2:

				System.out.print("책 제목 ");
				String title1 = scan.next();

				for (int i = 0; i < Book.count; i++) {
					if (title1.equals(b[i].getTitle())) {
						System.out.println(b[i]);
					}
				}
				break;

			case 3:

				for (int i = 0; i < Book.count; i++) {
					System.out.println(b[i]);
				}
				break;

			case 4:
				a = 1;
				break;
			}

		}
	}

}
