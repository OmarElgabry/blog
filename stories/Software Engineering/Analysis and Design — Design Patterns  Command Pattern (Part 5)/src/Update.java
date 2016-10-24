
public class Update implements Command{
	private Data db;
	
	Update(Data _db){
		db = _db;
	}
	
	@Override
	public void execute() {
		db.updateData();
	}

}
