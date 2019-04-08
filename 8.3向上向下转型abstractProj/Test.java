package abstractProj;

public class Test {
	
	
	public static void main(String[] args) {
		Cat c=new Cat("花花","蓝眼");
		Dog d=new Dog("二哈","黑白毛");
		
		Lady one=new Lady("Lucy",c);
		Lady two=new Lady("Mary",d);
		
		one.play();
		two.play();
	}
	
	

}
