package threadProj;

public class Bread {
	private int id;
	
	public Bread(int id) {
		this.id=id;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "第"+(id+1)+"个面包";
	}

}
