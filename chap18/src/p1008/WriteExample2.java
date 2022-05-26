package p1008;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample2 {

public static void main(String[] args) throws Exception {
		
		Writer writer = new FileWriter("c:/temp/test.txt");
		char[] data = "홍길동".toCharArray();
	
		writer.write(data,1,2);		//0=홍  1=길  2=동  ==> 그래서 출력은 길동으로만 된다.
		writer.flush();
		writer.close();
	}
}
