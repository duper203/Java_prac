// 김혜수 (2110883)
//20220908
//Lab01-5:2자리 수 입력 후 자리수 같은지 판별 
package Lab1_01;

import java.util.Scanner;

public class Lab1_05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.print("2자리수 정수 입력(10~99) >> ");
		int num = sc.nextInt();
		
		int x = num / 10;
		int y = num % 10;
		
		String same = (x == y ) ? "yes! 10의자리와 1의 자리가 같습니다 " : "no! 10의자리와 1의 자리가 다릅니다 ";
		System.out.print(same);
		
		

	}

}
