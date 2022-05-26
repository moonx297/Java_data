package one;

public class TwoDiff {

	public static void main(String[] args) {

		int a = 5;
		int b = 17;
		
		int k = (a>=b)? a-b : b-a;		//괄호를 쳐주는게 좋다. 예의상~ 안쳐줘도 상관은 없다.
		
		System.out.println("a와 b의 차이 : " + k);

	}

} 