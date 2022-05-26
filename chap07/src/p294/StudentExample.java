package p294;

public class StudentExample {

	public static void main(String[] args) {
		Student student = new Student("홍길동", "123456-1234567", 1);
		System.out.println("name : " + student.name);
		System.out.println("ssn : " + student.ssn);
		System.err.println("studentNo : " + 
							student.studentNo);
					//err: error 값을 나타내고 싶으면 err: 빨간 글씨로 뜬다.
	}

}
