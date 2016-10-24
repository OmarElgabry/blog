
public class Main {

	public static void main(String[] args) {
		Microwave myMicrowave = new Microwave();
		
		myMicrowave.start(); // start
		myMicrowave.pause(); // pause
		
		myMicrowave.start(); // start again

		// You can't start again because it's already working.
		// myMicrowave.start();
		
		myMicrowave.stop(); // stop
		
	}

}
