//2022 09 15
//2110883 김혜수
//Lab02_6 랜덤 배열 생성 2차원 배열 생성 후 5개의 정수 1 랜하게 배열 
package Lab02;
public class Lab02_06 {

	public static void main(String[] args) {
		
		int[][] seats = {{0, 0, 0, 0, 0},{0, 0, 0, 0, 0},{0, 0, 0, 0, 0}};
		
		int count =0;
		
		while(count < 5) {
		
		int a = (int)(Math.random()*2);
		int b = (int)(Math.random()*4);
		
	
		if (seats[a][b] == 1) {
			continue;
			
		}
		else
			seats[a][b] = 1;count+=1;
		}
	
		
		for(int i = 0; i<seats.length; i++) {
			System.out.println();
		
			for (int k = 0; k < seats[i].length; k++) {
				System.out.print(seats[i][k]+" ");
			}
	}

	}
}
