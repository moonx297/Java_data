package chap06;

public class ArrayReferenceObjectExample {

	public static void main(String[] args) {
		String[] strArray = new String[3];
		strArray[0] = "Java";
		strArray[1] = "Java";
		strArray[2] = new String("Java");		//new는 주머니와 같다.
		
		System.out.println( strArray[0] == strArray[1]);
		System.out.println( strArray[0] == strArray[2] );		// == 주소를 비교
		System.out.println( strArray[0].equals(strArray[2]) );	// .equals는 내용을 비교

	}

}
