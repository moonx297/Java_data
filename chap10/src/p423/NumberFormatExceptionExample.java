package p423;

public class NumberFormatExceptionExample {

	public static void main(String[] args) {

		String data1 = "100";
		String data2 = "a100";

	int value1 = Integer.parseInt(data1);
	//int value2 = Integer.parseInt(data2);
	
	System.out.println(data1+5);		// data1 ="100" 은 문자이지 숫자 100이 아니다. 그렇기에 data1+5를 하면 "100"+"5" => 1005가 나온다.
	System.out.println(value1+5);		// value1 = 문자 dara1 100을 integer로 변환시켜 value1으로 저장해줬기 때문에 value1인 100+5 는 =>105!!
	
	
	
	}

}
