package octal;

public class Octal {
	
	//static final int JINSUNUM = 2;

	public static void main(String[] args) {
		
		
		int num = 8;
		int cnt = 0; //배열은 0부터 시작
		int[] bin = new int[15];
		
		while(num >=1) { 	//8진수 연산
			
			//bin[cnt] = num%JINSUNUM;
			bin[cnt] = num%8;
			cnt++;
			//num = num/JINSUNUM;
			num = num/8;
		}
		for(int i = cnt-1 ; i>=0; i--) {		//8진수 역으로 출력하기
			System.out.print(bin[i]);
		}
		
	}

}
