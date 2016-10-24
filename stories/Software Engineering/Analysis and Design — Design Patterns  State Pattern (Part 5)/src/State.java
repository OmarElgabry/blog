
public interface State {
	
	// the user opened the door
	public void start();

	// the door is closed and user pressed start
	public void pause();

	// the user stopped the operations
	public void stop(); 
}
