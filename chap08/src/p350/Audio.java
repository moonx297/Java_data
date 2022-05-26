package p350;

public class Audio implements RemoteControl1 {
	//필드
	private int volume;
	private boolean mute;
	//turnOn() 추상메소드의 실체 메소드

	@Override
	public void turnoOn() {
		System.out.println("Audio를 켭니다.");
		
	}
	@Override
	public void turnoOff() {
		System.out.println("Audio를 끕니다.");
		
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
		System.out.println("현재 Audio 볼륨: " + this.volume);
	}
	@Override
	public void setMute(boolean mute) {
		this.mute = mute;
		if(mute) {
			System.out.println("Audio 무음 처리합니다.");
		} else {
			System.out.println("Autio 무음 해제합니다.");
		}
	
	}
	 
	
}
