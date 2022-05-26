package p245;

public class Person {
	final String nation = "korea";		//MASK-ROM과 같이 
	final String ssn;					//P-ROM
	String name;						//EEP-ROM
	
	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
	
}
