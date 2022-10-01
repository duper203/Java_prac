// 김혜수 (2110883)
//20220908
//Lab01-1: 오렌지 개수의 필요한 상자 수 와 남은 오렌지 수 

package Lab1_01;

import java.util.Scanner;

public class Lab1_01 {

	public static void main(String[] args) {
		
		int num;
		int box;
		int left;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("오렌지의 개수 입력:");
		num = sc.nextInt();
		
		box = num / 10;
		left = num % 10;
		
		System.out.print(box + "박스가 필요하고 " + left +"개가 남는다");
		
		
	}

}
