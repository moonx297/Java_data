package one;

import java.util.Scanner;

public class OctHex1Line {

	public static void main(String[] args) {		//static : 프로그램이 끝까지 갈거야라는 뜻
															//void: return
		Scanner stdln = new Scanner(System.in);
		
		System.out.print("정수:");
		int x = stdln.nextInt();
		
		System.out.printf("8진수는 %o이고 16진수는 %x입니다.\n", x, x);

	}

}
