package G061022_2_4;

public class Test05 {
    public static void main(String[] args) {
        boolean run = true;
	int n = 10;
		
	    while(run) {
		if(n>=1) {                  // num이 10이상이면
		    System.out.println(n);
		    --n;	              // 1씩 계속 뺀다
		}
		else if(n==0) {             // num이 0이 되면
		    run = false;              // run은 false가되고 중단.
		}
	    }
    }
}

