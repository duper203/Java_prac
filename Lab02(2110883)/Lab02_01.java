//2022 09 15
//2110883 김혜수
//Lab02_1 두개의 정수를 받아 입력한 연산자로 계산하기 
package Lab02;
import java.util.Scanner;


public class Lab02_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, y, result = 0;
		System.out.print("연산 기호 입력");
		String sign = sc.next();
		System.out.print("숫자 두개 입력");
		x = sc.nextInt();
		y = sc.nextInt();
		
		switch(sign)
		{
		case "+":
			result = x+y;System.out.println(x+sign+y+"="+result);
			break;
		case "-":
			result = x-y;System.out.println(x+sign+y+"="+result);
			break;
		case "*":
			result = x*y;System.out.println(x+sign+y+"="+result);
			break;
		case "/":
			if (y != 0)
				result = x/y;
				System.out.println("0으로 나눌 수 없습니다.");
			break;
		}
	}
}
