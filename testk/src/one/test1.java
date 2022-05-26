package one;

public class test1 {

	public static void main(String[] args) {

		int i = 0;
		
		while(true) {
			
			i++;
			
			if(i%5!=0) continue;
			if(i>50) break;
			
			System.out.println("i="+i);
			
		}

	}

}
