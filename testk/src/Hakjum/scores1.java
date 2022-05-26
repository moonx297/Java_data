package Hakjum;

public class scores1 {

	public static void main(String[] args) {
		int h[] = { 98, 70, 45, 60, 83 };
		int max = 0;
		int min = 999;
		
		int sum = 0;
		for(int i=0; i<5; i++) {
			sum += h[i];
			
			if(h[i] > max) max = h[i];
			if(h[i] < min) min = h[i];
		
		}
		
		System.out.println("총합 : " + sum);
		double avg = (double) sum /5;
		System.out.println("평균 : " + avg);
		System.out.println("최고점수 : " + max);
		System.out.println("최저점수 : " + min);

		
	}

}


