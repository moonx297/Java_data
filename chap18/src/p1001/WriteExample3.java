package p1001;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample3 {

				public static void main(String[] args) throws Exception {
				OutputStream os = new FileOutputStream("c:/temp/test.txt");
				byte[] data = "ABCD".getBytes();
				os.write(data,1,2);					//--> 1번의 위치부터 2개만 출력해라!
				os.flush();
				os.close();
}
		}