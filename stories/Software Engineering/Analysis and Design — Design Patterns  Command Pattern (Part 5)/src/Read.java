
public class Read implements Command {
	private Data db;
	
	Read(Data _db){
		db = _db;
	}
	
	@Override
	public void execute() {
		db.readData();
	}
}
