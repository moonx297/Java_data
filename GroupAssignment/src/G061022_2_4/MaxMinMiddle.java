package G061022_2_4;

import java.util.Scanner;

public class MaxMinMiddle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i=0;
		int[] num = new int[5];
		
		System.out.println("숫자 5개를 입력하시오: ");
		for(i=0; i<=4; i++) {
			num[i] = input.nextInt();
		}
		int max = num[0];
		int min = num[0];
		for(i =1; i<=4; i++) {
			if(num[i] > max) max = num[i];
			if(num[i] < min) min = num[i];
		}
		
		System.out.print("최댓값은 " + max + "입니다.");
		System.out.print("최솟값은 " + min + "입니다.");
		
		int size = num.length;
		
		if(size % 2 == 0) {
			int m = size / 2;
			int n = size / 2-1;
			
			float result = (float)(num[m] + num[n])/2;
			System.out.println("중간값은 " + result + "입니다.");
		}
	}
}
