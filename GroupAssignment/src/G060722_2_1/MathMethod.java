package G060722_2_1;

public class MathMethod {

	public static void main(String[] args) {
		System.out.println(Math.abs(3.14));
		System.out.println(Math.abs(-12));
		//abs -> 절댓값
	
		System.out.println(Math.random());
		System.out.println(Math.random()*10);
		//random -> 0.0~1.0사이의 임의의 double형 데이터를 생성
		
		System.out.println(Math.max(0, 12));
		System.out.println(Math.min(-13, 100));
		//max or min -> 전달된 데이터 중 제일 큰 수와 제일 작은 수를 반환
		
		System.out.println(Math.round(3.14));
		System.out.println(Math.round(3.74));
		//round -> 반올림
		
		System.out.println(Math.ceil(3.6));
		System.out.println(Math.ceil(3.2));
		System.out.println(Math.ceil(3));
		//ceil -> 소수점을 double 형태로 올려서 반환
		
		System.out.println(Math.pow(2.0, 3.0)); // 2에3승 = 8
		System.out.println(Math.pow(3.0, 3.0)); // 3에3승 = 27
		//pow -> 제곱연산 수행 
		
		System.out.println(Math.sqrt(4.0));
		System.out.println(Math.sqrt(16.0));
		//제곱근 루트
	}
}
