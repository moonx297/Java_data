package chap04;

public class CheckOverFlowExample {

	public static void main(String[] args) {
		try {											//뭔가 에러가 날거같으면 try catch 안에 넣어라. 그러면 해결해 줄것.
			int result = safeAdd (2000000000, 2000000000);			//safeAdd 처음 소문자 중간 대문자인거는 함수이다. 
			System.out.println(result);								//Syso 도 대문자로 시작해서 함수이다.
		} catch (ArithmeticException e) {
			System.out.println("오버플로우가 발생하여 정확하게 계산할 수 없음.");
		}
		}

	public static int safeAdd (int left, int right) {
		if((right>0)) {
			if(left>(Integer.MAX_VALUE - right)) {
				throw new ArithmeticException("오버플로우 발생");
			}
		} else {					//그렇지 않을때는 : else
			if(left<(Integer.MIN_VALUE - right)) {
				throw new ArithmeticException("오버플로우 발생");
			}
		}
		return left + right;
	}

	}

