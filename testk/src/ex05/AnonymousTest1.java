package ex05;

public interface Car {
	public void run();
	public void stop();
}

public class AnonymousTest1{

	public static void main(String[] args) {
		Car foorCar = new Car() {
			public void run() {
				System.out.println("달려라!");
			}
			
			public void stop() {
				System.out.println("멈....멈춰!!!");
			}
		};
		
		foorCar.run();
		foorCar.stop();
		

	}

}
