package G060822_2_2;

import java.util.Scanner;

public class IfTest1 {

	public static void main(String[] args) {

		//int year=2004;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("년도를 입력하시오: ");
		int year = sc.nextInt();
		if(((year%4)==0 && (year%100)!=0) || (year%400==0)){
			System.out.println(year+"년은 윤년입니다.");
		}else {
			System.out.println(year+"년은 윤년이 아닙니다.");
		}
	}
}
