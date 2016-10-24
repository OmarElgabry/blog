
public class WorkingState implements State{

	private Microwave curMicrowave;
	WorkingState(Microwave _curMicrowave){
		curMicrowave = _curMicrowave;
	}
	@Override
	public void start() {
		System.out.println("Error: The Microwave is already Working");
	}

	@Override
	public void pause() {
		System.out.println("You have paused the Microwave");
		curMicrowave.setCurState(curMicrowave.getPausedState());
	}

	@Override
	public void stop() {
		System.out.println("You have stopped the Microwave");
		curMicrowave.setCurState(curMicrowave.getWaitingState());
	}
}
