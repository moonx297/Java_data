package chap04;

public class Test {

	public static void main(String[] args) {


			int num = 5;
			
			int sum = ++num + num++; 	//=sum =12
					//= 6      = 7
			++num;   //=8
			num++;   //=9
			
			System.out.println("num=" + num);
			System.out.println("sum=" + sum);

	}

}
