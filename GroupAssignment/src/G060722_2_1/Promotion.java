package G060722_2_1;

public class Promotion {

	public static void main(String[] args) {
		double a = 3.6;
		float b = 3.6F;
		
		byte byteValue = 10;
		int intValue = byteValue;
		intValue = byteValue;				//int <-byte
		System.out.println(intValue);
		
		char charValue = '하';
		intValue = charValue;				//int <- char
		System.out.println(intValue);
		
		intValue = 500;
		long longValue = intValue;			//long <- int
		System.out.println(longValue);
		
		intValue = 200;	
		double doubleValue = intValue;		//double <- int
		System.out.println(doubleValue);
		

	}

}
