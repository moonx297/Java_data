package G061022_2_4;

public class Unicode {

public static void main(String[] args) {

	String iput = "안뇽~";
	for(int i=0; i< iput.length(); i++) { //input에 저장된 문자길이만큼
	System.out.printf("0x%04X%n",(int)iput.charAt(i)); //문자를 유니코드로 변환해 출력

		}
    }
}


