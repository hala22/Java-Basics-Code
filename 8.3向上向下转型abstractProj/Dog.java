package abstractProj;

public class Dog extends Animal{
	
	private String furColor;
	
	public Dog(String name,String furColor) {
		super(name);
		this.furColor=furColor;
	}
	
	

	public String getFurColor() {
		return furColor;
	}



	public void setFurColor(String furColor) {
		this.furColor = furColor;
	}



	@Override
	public void enjoy() {
		// TODO Auto-generated method stub
		System.out.println("小狗开心汪汪汪～");
	}
}
