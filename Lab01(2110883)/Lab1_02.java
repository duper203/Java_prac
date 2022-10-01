// 김혜수 (2110883)
//20220908
//Lab01-2: 두 수를 입력 받아 계산과 큰수 작은 수 찾기 

package Lab1_01;

import java.util.Scanner;

public class Lab1_02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.print("x:");
		int x = sc.nextInt();
		System.out.print("y:");
		int y = sc.nextInt();
		
		int add = x + y;
		int sub = x - y;
		int mul = x * y;
		int mean = (x + y )/2;
		
		int max_value;
		int min_value;
		
		max_value = (x > y) ? x : y;
		min_value = (x < y) ? x : y;
		
		System.out.println("두수의 합"+add);
		System.out.println("두수의 차"+sub);
		System.out.println("두수의 곱"+mul);
		System.out.println("두수의 평균"+mean);
		System.out.println("큰수 "+ max_value);
		System.out.println("작은 수"+min_value);

	}

}
