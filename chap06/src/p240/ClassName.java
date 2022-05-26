package p240;

public class ClassName {
 //인스턴스 필드와 메소드
	static int field1;
	static void method1() {}				//일반 변수 int
	
	//정적 필드와 메소드
	static int field2;
	static void method2() {}		//정적 변수 static
	
	//정적 블록
	static {
		field1 =10;
		method1();
		field2 =10;
		method2();
	}
	
	//정적 메소드
	static void Method3() {
	field1 = 10;			//static 은 this 안됨~
		method1();
		field2 = 10;
		method2();
	}
}
