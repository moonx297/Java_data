package p997;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample2 {

	public static void main(String[] args) throws IOException {
		
		InputStream is = new FileInputStream("c:/temp/test.txt");
		int readByteNo;
		byte[]readBytes = new byte[3];		//배열 3. 그 길이만큼만 가져오라는 뜻
		String data = "";
		while(true) {
			readByteNo = is.read(readBytes);
			if(readByteNo == -1) break;
			data += new String(readBytes, 0, readByteNo);
		}
		System.out.println(data);
		is.close();

	}

}
