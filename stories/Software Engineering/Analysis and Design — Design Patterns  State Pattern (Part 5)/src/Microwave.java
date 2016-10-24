
public class Microwave {
	
	private State WaitingState;
	private State WorkingState;
	private State PausedState;
	
	private State curState;
	
	Microwave(){
		WaitingState = new WaitingState(this);
		WorkingState = new WorkingState(this);
		PausedState = new PausedState(this);
		
		curState = WaitingState;
	}
	
	public void start(){
		curState.start();
	}
	public void pause(){
		curState.pause();
	}
	public void stop(){
		curState.stop();
	}
	
	// Getters and Setters
	
	public State getCurState() {
		return curState;
	}

	public void setCurState(State curState) {
		this.curState = curState;
	}
	public State getWaitingState() {
		return WaitingState;
	}

	public void setWaitingState(State waitingState) {
		WaitingState = waitingState;
	}

	public State getWorkingState() {
		return WorkingState;
	}

	public void setWorkingState(State workingState) {
		WorkingState = workingState;
	}

	public State getPausedState() {
		return PausedState;
	}

	public void setPausedState(State pausedState) {
		PausedState = pausedState;
	}


}
