package single;

public class Lazy {

	private Lazy() {
		
	}
	
	private static Lazy instance=null;
	
	public static Lazy getInstance() {
		if(instance==null) {
			instance=new Lazy();
		}
		
		return instance;
	}
}
