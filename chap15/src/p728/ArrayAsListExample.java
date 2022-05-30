package p728;

import java.util.Arrays;
import java.util.List;

public class ArrayAsListExample {

	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("홍길동", "신용권", "감자바");				//중괄호가 아니라 파라미터임..
		for(String name: list1) {      			//for문 간략하게 쓰는법!
			System.out.println(name);
		}
		
		List<Integer> list2 = Arrays.asList(1,2,3);
		for(int value : list2) {
			System.out.println(value);
		}

	}

}
			//제네릭을 쓰니 <String> 도 쓰고 <Integer> 도 쓰고 형식에 영향 받지 않고 왔다갔다 가능하다.