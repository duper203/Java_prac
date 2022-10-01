//2022 09 15
//2110883 김혜수
//Lab02_5 2차원 배열 츌력하기 
package Lab02;

import java.util.Arrays;

public class Lab02_05 {

	public static void main(String[] args) {
		int[][]n = {{1,2,3},{1,2},{1},{2,3,4},{1,2}};
		
		for(int a = 0; a < n.length; a++) {
			
			for (int b = 0; b <n[a].length;b++ ) {
				System.out.print(n[a][b]+"  ");
			}
			System.out.println("");
		}
		
	}

}
