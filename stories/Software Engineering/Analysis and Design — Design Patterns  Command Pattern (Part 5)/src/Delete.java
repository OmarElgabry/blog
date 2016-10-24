
public class Delete implements Command {
	private Data db;
	
	Delete(Data _db){
		db = _db;
	}
	
	@Override
	public void execute() {
		db.deleteData();
	}
}
