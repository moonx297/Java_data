package p350;

public class RemoteControlExample {

	public static void main(String[] args) {

		RemoteControl1 rc = null;	//인터페이스 변수 선언
		
		rc = new Television();
		rc.turnoOn();		//인터페이스의 turnOn() 메소드를 호출
		rc.turnoOff();
		rc.setMute(true);
		
		//RemoteContol rc = new RemoteControl(); --> 원래 클래스 상식
		//Audop rc = new Audio();
		rc = new Audio();
		rc.turnoOn();		//인터페이스의 turnOn() 메소드를 호출
		rc.turnoOff();
		rc.setMute(true);
	}

}
