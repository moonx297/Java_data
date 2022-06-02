package G053122_1_17;
//shape 클래스는 도형의 개념을 나타내기 위한 추상 클래스이다.
//추상 클래스이므로 이 클래스의 인스턴스를 생성 할 수 없다.
//구체적인 도형 클래스는 이 클래스로부터 파생된다.
//@author 시바타
//@see Object

public abstract class Shape {
//	도형 정보를 나타내는 문자열을 반환하는 추상 메서드이다.
//	Shape 클래스에서 파생되는 클래스에서 이 메서드를 구현한다.
//	이 메서드는 java.lang.Object 클래스의 메서드를 추상 메서드로
//	오버라이드한 메서드이다!
	
	public abstract String toString();
	
//	draw 메서드는 도형을 그리기 위한 추상 메서드이다.
//	Shape 클래스에서 파생되는 클래스에서 이 메서드를 구현한다.
	
	public abstract void draw();
	
//	print 메서드는 도형 정보의 표시하고 도형 자체를 그린다.
//	구체적으로는 다음 두 단계를 따른다.
//	Step 1. toString 메서드가 반환하는 문자열을 표시하고 줄 바꿈
//	Step 2. draw 메서드를 호출해서 도형을 그림
	
	public void print() {
		System.out.println(toString());
		draw();
	}
}
//point 클래스는 점을 나타내는 클래스이다.
//이 클래스는 도형을 나타내는 추상 클래스 Shape로부터 파생된 클래스이다.
//필드는 없다.
//@author 시바타
//@see Shape

	public class Point extends Shape {
//점을 생성하는 생성자이다.
//받는 인수가 없다
		public Point() {
		}
		//아무것도 하지 않는다
//toString 메서드는 점에 관련된 도형 정보를 문자열로 반환한다.
//반환하는 문자열은 항상"Point"이다.
//@return문자열 "point"를 반환한다.
		public String toString() {
			return "Point";
		}
		
//draw메서드는 점을 그리는 메서드이다.
//플러스  기호 +를 1개만 표시하고 줄 바꿈한다
		public void draw() {
			System.out.println('+');
		}
}
//	AbstLine 클래스는 직선을 나타내는 추상 클래스이다.
//	이 클래스는 도형을 나타내는 추상 클래스 쉐입으로부터 파생되는 클래스이다.
//	추상 클래스이므로 본 클래스의 인스턴스를 생성할 수 없다.
//	구체적인 직선 클래스는 이 클래스를 통해 파생된다.
	//@author 시바타
	//@see Shape
	//@SEE hORZlINE vERTlINE
	public abstract class AbstLine extends Shape {
		//직선의 길이를 나타내는 int형 필드
		private int length;
		
		//직선을 생성하는 생성자이다.
//		길이를 인수로 받는다.
//		@param length 생성할 직선의 길이
		
		public AbstLine(int length) {
			setLength(length);
		}
		//직선의 길이를 반환한다. @return 직선의 길이
		
		public int getLength() {
			return length;
		}
		//직선 길이를 설정. @param length 설정할 직선의 길이
		
		public void setLength(int length) {
			this.length = length;
		}
		
		//toString 메서드는 직선에 관련된 도형 정보를 문자열로 반환한다.
		//@return 문자열 "AbstLine(length:3)"을 반환한다.
		//3 부분은 길이에 해당하는 값이다.
		public String toString() {
			return "AbstLine(length:" + length + ")";
		}
	}