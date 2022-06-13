package G061022_2_4;

public class Test03 {

	public static void main(String[] args) {
	    for (int i = 0; i < 10; i++) {
	        System.out.print("i=");
	        System.out.printf("%2d", i);
	        System.out.print("     " + "j=");
	        for (int j = 0; j <= i; j++) {
	        if (j > 0)
	        System.out.print(", " + j);
	        else
	        System.out.print(j);
	        }
	        System.out.println();
	      }

	   for (int i = 0; i <= 10; i++) {
	     System.out.print("i=");
	     System.out.printf("%2d", i);
	     System.out.print("     " + "j=");
	     for (int j = 0; j <= 10 - i; j++) {
	         if (j > 0)
	             System.out.print(", " + j);
	         else
	             System.out.print(j);
	         }
	         System.out.println();
	      }
	   }
	}