package p242;   

public class Car {

	int speed;
	void run() {
		System.out.println(speed + "으로 달립니다.");
	}

	
	
	public static void main(String[] args) {		//같은 덩어이이지만 static이 없으면 에러가 난다.
		Car myCar = new Car();
		myCar.speed = 60;
		myCar.run();
	}

}
