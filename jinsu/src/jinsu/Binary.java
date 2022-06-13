package jinsu;

import java.util.Scanner;

public class Binary {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("10진수:");
		int n = input.nextInt();
		int cnt = 0; //배열은 0부터 시작
		int[] bin = new int[15];
		
		while(n >=1) { 	//2진수 연산
			
			bin[cnt] = n%2;
			cnt++;
			n = n/2;
		}
		for(int i = cnt-1 ; i>=0; i--) {		//2진수 역으로 출력하기
			System.out.print(bin[i]);
		}
		
	}

}
