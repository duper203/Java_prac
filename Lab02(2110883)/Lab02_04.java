//2022 09 15
//2110883 김혜수
//Lab02_4 피타고라스 수식에 성립하는 세변의 길이를 출력하
package Lab02;
import java.util.Scanner;

public class Lab02_04 {
	public static void main(String[] args) {
		
		for (int a = 1; a <= 20; a++) {
			for(int b = 1; b <= 20; b++) {
				for(int c=1; c <=20; c++)
				
					if (a*a + b*b == c*c) {
						System.out.print(a+"  ");
						System.out.print(b+"  ");
						System.out.println(c+"  ");
					}
				
			}
			
		
		}
		}
	
}
