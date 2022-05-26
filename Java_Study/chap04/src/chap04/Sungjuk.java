package chap04;

public class Sungjuk {

	public static void main(String[] args) {
		
		int score = 100;
		
		int num = score/10;
		
//		if(num == 10) {				//100점일 경우에 F학점이 나오는 버그가 있음. 그럴때 if 점프문을 넣어줘라.
//			num = 9;
//		}
//		
		switch(num) {
		case 9:
			System.out.println("A 학점 입니다..");
			break;
		case 8:
			System.out.println("B 학점 입니다.");
			break;
		case 7:
			System.out.println("C 학점 입니다.");
			break;
		case 6:
			System.out.println("D 학점 입니다.");
			break;
	
		default:
			System.out.println("F 학점 입니다.");
			
			
		}

	}

}
