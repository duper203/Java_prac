// 김혜수 (2110883)
//20220908
//Lab01-4: 구의 반지름으로 구 부피 구하기 
package Lab1_01;

import java.util.Scanner;

public class Lab1_04 {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		
		double PI = 3.141592;
		
		System.out.print("반지름 :");
		int r = sc.nextInt();
		
		double volume = PI*r*r*r*4/3;
		System.out.println("구의 부피: "+ volume);

	}

}
