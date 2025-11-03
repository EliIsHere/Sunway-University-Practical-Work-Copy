
public class MainProgram {//UI
	public static void main (String[] args) throws Exception{
		MainProgram mp = new MainProgram();
		mp.retrieveRecords();
	}
	
	public void retrieveRecords() throws Exception{
		Database db = new Database();
		String[] result = db.getAllRecords();
		
		for (String temp:result)
			System.out.println(temp);
	}

}
