//2022 09 15
//2110883 김혜수
//Lab02_3 369게임 완성하기 
package Lab02;


public class Lab02_03 {
	public static void main(String[] args) {
		
		
		
		for (int i = 1; i <= 50; i++) {
			int count = 0;
			int x = i /10;
			int y = i %10;
			
			if (x == 3 || x == 6 || x ==9) {
				count += 1;
			}
			if (y == 3 || y == 6 || y ==9) {
				count += 1;
			}
			if (count == 1)
				System.out.print("짝  ");
			else if ( count == 2)
				System.out.print("짝짝  ");
			else
				System.out.print(i+"  ");
			
		}
	}
	
	
		

}
