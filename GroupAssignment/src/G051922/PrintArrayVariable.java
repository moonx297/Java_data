package G051922;

class PrintArrayVariable {
    public static void main(String[] args) {
	int[] a = new int[5];
	System.out.println("a = " + a);
	a=null;
	System.out.println("a = " + a);
    }
}

