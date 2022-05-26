import java.util.Scanner;

public class Abolute1 {

	public static void main(String[] args) {
		Scanner stdIn= new Scanner(System.in);
		
		System.out.println("정숫값:");
		int n = stdIn.nextInt();
		
		if (n>=0)
			System.out.println("절댓값은 "+ n + "입니다.");
		else
			System.out.println("절댓값은 "+ -n +"입니다.");

	}

}
