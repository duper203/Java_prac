// 김혜수 (2110883)
//20220908
//Lab01-6:비트연산자 

package Lab1_01;

import java.util.Scanner;

public class Lab1_06 {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.print("정수 두개 입력:");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		
		System.out.print("x&y="+(x&y)+"  ");
		System.out.print("x|y="+(x|y)+"  ");
		System.out.print("x^y="+(x^y)+"  ");
		System.out.print("~x="+(~x)+"  ");
		System.out.print("x>>2="+(x>>2)+"  ");
		System.out.print("x<<2="+(x<<2)+"  ");
		System.out.print("x>>>2="+(x>>>2)+"  ");
		
		
	}

}
