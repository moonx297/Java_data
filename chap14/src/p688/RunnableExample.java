package p688;

public class RunnableExample {

	public static void main(String[] args) {
//		Runnable runnable = () -> {
//			for(int i = 0; i<10; i++) {
//				System.out.println(i);
//			}
//		};
//		
//		Thread thread = new Thread(runnable);			//메모리 단위를 thread라고 함
//		thread.start();
		
		Thread thread = new Thread(()->{
			for(int i = 0; i<10; i++) {
				System.out.println(i);
			}
			
		});
		thread.start();
	}
}
