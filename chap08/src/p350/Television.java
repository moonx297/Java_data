package p350;

public class Television implements RemoteControl1 {
	//필드
	private int volume;
	
	//turnOn() 추상메소드의 실체 메소드

	@Override
	public void turnoOn() {
		System.out.println("Tv를 켭니다.");
		
	}
	@Override
	public void turnoOff() {
		System.out.println("Tv를 끕니다.");
		
	}
	@Override
	public void setVolume(int volume) {
		if(volume>RemoteControl1.MAX_VOLUME) {
			this.volume = RemoteControl1.MAX_VOLUME;
		}else if(volume<RemoteControl1.MIN_VOLUME) {
			this.volume = RemoteControl1.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("현재 Tv볼륨: " + this.volume);
	}
}
