package G0525;

import java.util.Scanner;

class CoordinateTester2 {
  static boolean compCoordinate(Coordinate c1, Coordinate c2) {
    return c1.getX() == c2.getX() && c1.getY() == c2.getY();
  }
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
		
    double x, y;
    System.out.println("좌표 p를 입력하세요.");
    System.out.print("x좌표:"); x = stdIn.nextDouble();
    System.out.print("y좌표:"); y = stdIn.nextDouble();
    Coordinate p = new Coordinate(x,y);
		
    System.out.println("좌표 q를 입력하세요.");
    System.out.print("x좌표:"); x = stdIn.nextDouble();
    System.out.print("y좌표:"); y = stdIn.nextDouble();
    Coordinate q = new Coordinate(x,y);
		
    System.out.println((p == q)
					  ? "p == q입니다."				
					  : "p != q입니다.");		//답이 이거인 이유는 각자 생성된 객체는 주소가 다르기 때문에 P와 q는 같을수없음.
    System.out.println(p.getX() == q.getX() &&
				      p.getY() == q.getY()
				      ? "p와 q가 같습니다."		//그러나 이거는 순수한 x의 값과 y의 값이 같으므로 같습니다가 정답! 
				      : "p와 q가 다릅니다.");
    System.out.println(compCoordinate(p, q)
						   ? "p와 q가 같습니다."
				           : "p와 q가 다릅니다.");
    }
}

