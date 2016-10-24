
public class Main {

	public static void main(String[] args) {
		
		Admin curAdmin = new Admin ("Alexander", "3jccws4%3@d");
		Data myData = new Data();
		
		curAdmin.performOperation(new Read(myData));
		curAdmin.performOperation(new Delete(myData));
	}

}
