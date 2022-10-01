//2022 09 15
//2110883 김혜수
//Lab02_2 컴터 수 맞추고총 시도 횟수 출력하
package Lab02;
import java.util.Scanner;
public class Lab02_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int computer = (int)(Math.random()*100);
		System.out.print("정답을 추측하여 보시오 ");
		 int count = 1;
		
		while ( true ) {
			
			int user = sc.nextInt();
			
			if (user > computer) {
				System.out.println("더 낮아요");
				count += 1;
				continue;
			}
			else if (user < computer) {
				System.out.println("더 높아요");
				count+=1;
				continue;
			}
			else
				System.out.print("축하합니다");System.out.print("시도 횟수:"+count);break;
			
		}
	}
}