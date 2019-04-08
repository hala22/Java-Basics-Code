package abstractProj;

public class Cat extends Animal {
	
	private String eyeColor;
	
	public Cat(String name,String eyeColor) {
		super(name);
		this.eyeColor=eyeColor;
	}
	
	

	public String getEyeColor() {
		return eyeColor;
	}



	public void setEyeColor(String eyeColor) {
		this.eyeColor = eyeColor;
	}



	@Override
	public void enjoy() {
		// TODO Auto-generated method stub
		System.out.println("小猫开心喵喵喵～");
	}

}
