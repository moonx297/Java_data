package p350;     //p357

public class SmartTelevision implements RemoteControl1, Searchable{
	private int volume;
	

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
	
	public void search(String url) {
		System.out.println(url + "을 검색합니다.");
	}
}

