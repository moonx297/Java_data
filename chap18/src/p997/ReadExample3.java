package p997;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class ReadExample3 {

	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream ("c:/temp/test.txt");
		int readByteNo;
		byte[]readBytes = new byte[8];
		readByteNo = is.read(readBytes, 2,5);		//2는 세칸 띄우고 시작.
		for (int i=0; i<readBytes.length; i++) {
			System.out.print((char)readBytes[i]);
		}
		is.close();
	}

}
