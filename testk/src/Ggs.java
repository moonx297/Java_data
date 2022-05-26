import java.util.Scanner;

public class Ggs {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {								//while true에는 if와 break가 들어가는게 기본 원칙이다.
			System.out.print("구구셈 몇단 : ");
			int dan = scan.nextInt();
			if(!(dan==0 || dan == 1)) {
				System.out.println(dan+" 단 출력");
				for (int j = 1; j <= 9; j++) {
					System.out.print(dan + " * " + j + " = " + dan*j + "\n");
				}
			}
			else
			{
				System.out.print("프로그램을 종료합니다.");
				break;
			}
		}
			
				

	}

}
