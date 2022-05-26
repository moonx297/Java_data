package chap03;

public class SignOperatorExample {

	public static void main(String[] args) {
		int x=-100;
		int result1 = +x;
		int result2 = -x;
		System.out.println("result1=" + result1);
		System.out.println("result2=" + result2);
		
		short s =100;		//앞에서는 int로 -100했는데 왜 여기서는 short 인가요..? 
		int result3= -s;
		System.out.println("result3=" +result3);
		

	}

}
