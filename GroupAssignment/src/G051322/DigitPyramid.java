package G051322;

import java.util.Scanner;

class DigitPyramid {

	public static void main(String[] args) {
		Scanner stdln = new Scanner(System.in);
		System.out.println("숫자 피라미드를 표시합니다.");
		System.out.println("단수는:");
		int n = stdln.nextInt();
		for (int i =1; i <= n; i++) {
			for (int j =1; j <= n - i; j++) 
				System.out.print(' ');
				for (int j =1; j <= 2 * i - 1; j++)
					System.out.print(i % 10);
				System.out.println();
			
			
		}

	}

}
