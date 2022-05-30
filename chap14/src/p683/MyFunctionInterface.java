package p683;

public class MyFunctionInterface {

	public static void main(String[] args) {
		MyFunctionalInterface fi;
		
		fi = (x) -> {
			int result = x * 5;
			System.out.println(result);
		}; // 람다식은 화살표 다음에 꼭 세미클론!		
		fi.method(2);

		fi = (x) -> {System.out.println(x*5);};
		fi.method(2);

		fi = x -> System.out.println(x*5);
		fi.method(2);							//가장 간략한 방법
}
}
