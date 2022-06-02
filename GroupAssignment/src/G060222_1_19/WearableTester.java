package G060222_1_19;

class WearableTester {

	public static void main(String[] args) {
		Wearable[] a = new Wearable[2];
		a[0] = new HeadPhone();
		a[1] = new WearableComputer();
		
		for(int i = 0; i < a.length; i++)
			a[i].putOn();

		for(int i = 0; i < a.length; i++)
			a[i].putOff();
	}
}
