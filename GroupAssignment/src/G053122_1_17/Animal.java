package G053122_1_17;
//동물 클래스 버전 2//
abstract class Animal {
	private String name;								//이름
	public Animal(String name) { this.name = name; }	//생성자
	public abstract void bark();						//짖기
	public String getName() { return name; }			//이름 확인
	public abstract String toString();					//문자열 표현 반환
	public void introduce() {
		System.out.print(toString()+"이다.");
		bark();
	}
}
//개클래스 버전2//
class Dog extends Animal {
	private String type;

	public Dog(String name, String type) {
		super(name); this.type = type;
	}
	public void bark() { System.out.println("멍멍!"); } //짖기
	public String toString() {
		return type + "의 " + getName();
	}
}
//고양이 클래스 버전2//
class Cat extends Animal {
	private int age;

	public Cat(String name, int age) {
		super(name); this.age = age;
	}
	public void bark() { System.out.println("냐옹!"); } //짖기
	public String toString() {
		return age + "의 " +getName();
	}
}
	//동물 클래스 버전 2 사용 예
	class AnimalTester1 {
		public static void main(String[] args) {
			Animal[] a = new Animal[2];
			a[0] = new Dog("뭉치", "치와와"); //개
			a[1] = new Cat("마이클", 7); //고양이
			
			for (int i =0; i<a.length; i++) {
				System.out.println("a[" + i + "] = ");
				a[i].introduce();
			}
		}
	}
