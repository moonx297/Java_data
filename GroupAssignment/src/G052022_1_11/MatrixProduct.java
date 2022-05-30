package G052022_1_11;

import java.util.Scanner;

public class MatrixProduct {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int[][]a=new int[4][3];
		int[][]b=new int[3][4];
		int[][]c=new int[4][4];

		//행렬 a
		System.out.println("행령 a의 요소를 입력하세요.");
		for (int i =0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.printf("a[%d][%d] :", i,j);
				a[i][j] = stdIn.nextInt();
			}
		}
		//행렬 b
		System.out.println("행렬 b의 요소를 입력하세요.");
		for (int i = 0; i < 3; i++) {
			for (int j=0; j<4; j++) {
				System.out.printf("b[%d][%d] :", i,j);
				b[i][j] = stdIn.nextInt();
			}
		}
		//행렬출력
		for (int i =0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				c[i][j] = 0;
				for(int k=0;k<3;k++) {
					c[i][j]+= a[i][k] * b[k][j];
				}
			}
	}
		System.out.println("행렬 a와 b의 곱");
		for (int i =0; i < 4; i++) {
			for (int j = 0; j < 4; j++) 
				System.out.printf("%5d", c[i][j]);
			System.out.println();
		}
	}
}
