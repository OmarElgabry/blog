
public class PausedState implements State {

	private Microwave curMicrowave;
	PausedState(Microwave _curMicrowave){
		curMicrowave = _curMicrowave;
	}
	@Override
	public void start() {
		System.out.println("The Microwave is Working again");
		curMicrowave.setCurState(curMicrowave.getWorkingState());
	}

	@Override
	public void pause() {
		System.out.println("Error: The Microwave is already Paused");
	}

	@Override
	public void stop() {
		System.out.println("You have stopped the Microwave");
		curMicrowave.setCurState(curMicrowave.getWaitingState());
	}

}
