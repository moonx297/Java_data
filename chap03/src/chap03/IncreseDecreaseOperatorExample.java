package chap03;				

public class IncreseDecreaseOperatorExample {			//p.71

	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("-----------------");
		x++;
		++x;											//x++ 랑 ++x 이렇게 두번이니까 +2가 돼서 x=12 맞겠죠?
		System.out.println("x=" + x);
		
		System.out.println("------------------");
		y--;
		--y;
		System.out.println("y=" + y);
		
		System.out.println("------------------");
		z = x++;										//여기서 z의 값이 어떻게 나왔나
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		
		System.out.println("------------------");
		z = ++x;
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		
		System.out.println("------------------");
		z = ++x;
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		System.out.println("y=" + y);
		

	}

}
