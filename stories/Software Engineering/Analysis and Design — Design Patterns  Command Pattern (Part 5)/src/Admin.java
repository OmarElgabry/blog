
public class Admin {
	private String userName;
	private String password;
	
	Admin(String _userName, String _password){
		userName = _userName;
		password = _password;
	}
	
	public void performOperation(Command command){
		command.execute();
	}
}
