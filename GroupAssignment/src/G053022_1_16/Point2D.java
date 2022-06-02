package G053022_1_16;


import java.util.GregorianCalendar;
import static java.util.GregorianCalendar.*;

public class Point2D {
    private static int counter = 0;
    private static int day;
	
    private int x=0;
    private int y=0;
	
    static {
      GregorianCalendar today = new GregorianCalendar();
      day = today.get(DATE);		//DATE 대문자 상수이다?!
    }
	
    {
      if(++counter ==day) {
        System.out.print("당첨");
        System.out.printf("오늘 %d개의 좌표가 생성됐습니다.\n", counter);
      }
    }
	
public Point2D() {
		
	    if(++counter == day) {
	        System.out.print("당첨!!");
	        System.out.printf("오늘 %d개의 좌표가 생성됐습니다.\n", counter);
	    }
	}
	public Point2D(int x) {
	    if(++counter == day) {
	        System.out.print("당첨!!");
	        System.out.printf("오늘 %d개의 좌표가 생성됐습니다.\n", counter);
	    }
	    this.x = x;
	}
	public Point2D(int x, int y) {
	    if(++counter == day) {
	        System.out.print("당첨!!");
	        System.out.printf("오늘 %d개의 좌표가 생성됐습니다.\n", counter);
	    }
	    this.x = x;	this.y = y;
	}
	@Override
	public String toString() {
		return "Point2D [x=" + x + ", y=" + y + "]";
	}
	
	
}
