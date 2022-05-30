package p691;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;

public class ConsumerExample {

	public static void main(String[] args) {
		
		Consumer<String> consumer = t -> System.out.println(t+"8");     //제네릭은 어떤 형태든 받아드려서 string을 integer로 바꾸고 accept(5)라고 하면 출력값은 13이 됨.
		consumer.accept("java ");

		BiConsumer<String, String> bigConsumer = (t, u) -> System.out.println(t+u);
		bigConsumer.accept("java", " 8");

		DoubleConsumer doubleConsumer = d -> System.out.println("java " + d);
		doubleConsumer.accept(8.0);
		
		ObjIntConsumer<String> objIntConsumer = (t, j) -> System.out.println(t+j);
		objIntConsumer.accept("java ", 8);
		
		
		
	}

}
