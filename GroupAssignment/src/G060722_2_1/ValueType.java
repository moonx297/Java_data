package G060722_2_1;

public class ValueType {

	public static void main(String[] args) {
		
		byte byteType = -128;
		byte byteType1 = 127;
		//byte byteType = -129; //오류
		//byte byteTypw2 = 128; //오류
		//-> byte range from -128~128
		
		short shortType = -32768;
		//short shortType1 = -32769; 오류
		short shortType1 = 32767;
		//short shortType2 = 32768; 오류
		//-> short range from -32768~32767
		
		int intType = -2147483648;
		//int intType1 = -2147483649; 오류
		int intType1 = 2147483647;
		//int intType2 = 2147483648; 오류
		//-> int range from -2147483648~2147483647
		
	

	}

}
