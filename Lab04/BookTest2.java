package Lab04;
import java.util.ArrayList;
import java.util.Scanner;

class Book{
	private String title;
	private String score;
	static int count =0 ;
	
	
	
	public Book(String title, String score) {
		super();
		this.title = title;
		this.score = score;
		count++;
	}
	
	public String getTitle() { return title;}
	public void setTitle(String title) { this.title = title;}
	public String getScore() { return score;}
	public void setScore(String score) { this.score = score;}
	
	@Override
	public String toString() {
		return "Book [title=" + title + ", score=" + score + "]";
	} 
	
	
	
	
}

public class BookTest2 {

	public static void main(String[] args) {
		ArrayList<Book> b = new ArrayList<Book>();

		while(true) {
			Scanner scan = new Scanner(System.in);
			System.out.println("===============================");
			System.out.println("1. 책 등록 ");
			System.out.println("2. 책 검색 ");
			System.out.println("3. 모든 책 출력 ");
			System.out.println("4. 종료 ");
			System.out.println("===============================");
			System.out.print("메뉴를 선택하시오:");
			int num = scan.nextInt();
			
			
			if (num == 1) {
				
				System.out.print("책 제목 ");
				String title = scan.next();
				System.out.print("책 평점 ");
				String store = scan.next();
				
				
				b.add(new Book(title,store));

				
			}
			else if(num == 2) {
				
				System.out.print("책 제목 ");
				String title = scan.next();
				
				for(Book obj:b){
					
					if(title.equals(obj.getTitle())) {
						System.out.println(obj);
					}
					

			}
			}
			
			else if(num ==3) {
				
				// for(Book obj:b)
				// 	System.out.println(obj);

				for(int i =0; i < b.size();i++){
					System.out.println(b.get(i));
				}
				
			}
			else if (num ==4 ) {
				System.out.println("종료");
				break;
			}
			
		}
	}
				
			
				
					
		
	}


	


