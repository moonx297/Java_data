package p658;

public class Box<T> {
	private T t;					//private에 손대고 싶으면 직접 손댈 수 없고 함수로 대야 한다.

	public T get() {
		return t;
	}

	public void set(T t) {
		this.t = t;
	}


}
