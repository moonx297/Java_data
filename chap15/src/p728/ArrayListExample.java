package p728;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		List<String> list = new ArrayList</*String*/>();		//ArrayList를 새로 만들어야 검색이 빨라져.!
		
		list.add("Java");							//0번
		list.add("JDBC");							//1번
		list.add("Servlet/JSP");					//원래 2번인데 밑에 2라고 써있어서 이게 3번으로 밀려남.
		list.add(2, "Database");					//2번
		list.add("iBATIS");							//4번

		int size = list.size();
		System.out.println("총 객체수: " + size);
		System.out.println();
		
		String skill = list.get(2);
		System.out.println("2: " + skill);
		System.out.println();
		
		for(int i=0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ":" + str);
		}
		System.out.println();
			
		list.remove(2);								//2번 지워! 그래서 DATABASE가 지워짐
		list.remove(2);								//그다음 2번 지워! 그래서 SERVLET/JSP이 지워짐
		list.remove("iBATIS");						//IBATIS 지워! 그래서 지워짐.
													//결론 => JAVA 와 JDBC만 남음.
		for(int i=0; i<list.size(); i++) {					//근데 삭제할때 위에서부터 지우면 안됨. 밑에서부터 위로 지워야 함.
			String str = list.get(i);
			System.out.println(i + ":" + str);
		}
	}

}
