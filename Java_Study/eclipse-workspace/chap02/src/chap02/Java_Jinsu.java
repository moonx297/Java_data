package chap02;

import java.io.IOException;
import java.util.Scanner;

public class Java_Jinsu {

	public static void main(String[] args) throws IOException {

		System.out.print("10������ �Է��ϼ��� : ");
		// my_in�� Scanner�� �ý��ۿ��� �Է��� �о���� ��ü
		Scanner my_in = new Scanner(System.in);
		// 	ken�� my_in���� �о�� ���� ���������� ��ȯ�� ��
		int ken = Integer.parseInt(my_in.next());
		// 	Scanner�� ��� �Է��� �ޱ� ������ �ݾ��־�� ��.
		my_in.close();
		
		// 	10����, 2����, 8����, 16���� ���
		System.out.println("10������ : " + ken);
		System.out.println("2������ : " + Integer.toBinaryString(ken));
		System.out.println("8������ : " + Integer.toOctalString(ken));
		System.out.println("16������ : " + Integer.toHexString(ken));
	}
}