package P1004;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample2 {

	public static void main(String[] args) throws Exception {
		
		Reader reader= new FileReader("c:/temp/test.txt");
		int readCharNo;
		char[] cbuf = new char[5];
		readCharNo = reader.read(cbuf,2,3);			
		// 여기서 만약 new char[4]로 지정하고 cbuf,2,3으로 지정하면 총 5개의 배열이 필요함으로 에러가 뜬다.
		for(int i=0; i<cbuf.length; i++) {
			System.out.print(cbuf[i]);

		}
		reader.close();
	}	
}
