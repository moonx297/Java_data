package p296;

public class Computer extends Calculator {
	
	
	@Override				//Ctrl + space bar 누르면 그냥 나옴.
	double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI * r * r;

	
}

}
