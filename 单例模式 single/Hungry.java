package single;

public class Hungry {
	
	
	private  Hungry(){
		
	}
	
	private static Hungry instance=new Hungry();
	
	public static Hungry getInstance() {
		return instance;
	}

}
