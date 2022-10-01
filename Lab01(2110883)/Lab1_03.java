// 김혜수 (2110883)
//20220908
//Lab01-3: 완전한 파일 이름 만들기 

package Lab1_01;

import java.util.Scanner;

public class Lab1_03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.print("드라이브 이름:");
		String drive_name = sc.next();
		System.out.print("디렉터리 이름:");
		String dir_name = sc.next();
		System.out.print("파일 이름:");
		String file_name= sc.next();
		System.out.print("확장자:");
		String extension= sc.next();
		
		System.out.println("완전한 이름은 "+ drive_name +dir_name + file_name + "."+ extension);
		
	}

}
