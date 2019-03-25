package single;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hungry one=Hungry.getInstance();
		Hungry two=Hungry.getInstance();
		
		System.out.println(one);
		System.out.println(two);
		
		Lazy three=Lazy.getInstance();
		Lazy four=Lazy.getInstance();
		
		System.out.println(three);
		System.out.println(four);
	}

}
