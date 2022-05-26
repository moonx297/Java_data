package p1008;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample3 {

public static void main(String[] args) throws Exception {
		
		Writer writer = new FileWriter("c:/temp/test.txt");
		char[] data = "안녕 난 문희인이라고 해. Moon 이라고 불러줘".toCharArray();
	
		writer.write(data,3,2);		//3번째는 띄어쓰기니까 없고, 2자리까지만 출력되니 '난'이라고 출력된다.
		writer.flush();
		writer.close();
	}
}
