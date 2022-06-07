package G060722_2_1;

public class Casting {

	public static void main(String[] args) {
		
		long longValue = 30;
		int intValue = (int)longValue;	//long -> int
		System.out.println(intValue);
		
		double doubleValue = 20.8;
		intValue = (int)doubleValue;	//double -> int
		System.out.println(intValue);
		
		char charValue = '하';
		intValue = (int)charValue;		//char -> int
		System.out.println(intValue);
		
		intValue = 44032;
		charValue = (char)intValue;		//int -> char
		System.out.println(charValue);

		int intResult = 2;
		double doubleResult = 3.3;
		System.out.println(intResult + (int)doubleResult);	//double -> int
	}
}