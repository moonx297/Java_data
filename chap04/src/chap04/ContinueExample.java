package chap04;

public class ContinueExample {

	public static void main(String[] args) {
	for(int i=0; i<=50; i++) {
		if(i%5 !=0) {
			continue;
		}
		
		if(i!=0) {				// i가 0이 아니면 으로 설정했기에 --> 출력에서 0포함 안 함.
		System.out.println(i);
	}
	}
	}
}
