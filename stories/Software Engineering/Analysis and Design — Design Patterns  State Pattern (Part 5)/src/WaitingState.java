
public class WaitingState implements State{
	
	private Microwave curMicrowave;
	WaitingState(Microwave _curMicrowave){
		curMicrowave = _curMicrowave;
	}
	@Override
	public void start() {
		System.out.println("The Microwave has been started .... *** Working *** ");
		curMicrowave.setCurState(curMicrowave.getWorkingState());
	}

	@Override
	public void pause() {
		System.out.println("Error: Please start the Microwave first");
	}

	@Override
	public void stop() {
		System.out.println("Error: The Microwave is already stopped");
	}

}
