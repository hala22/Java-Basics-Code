package threadProj;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue queue=new Queue();
		
		new Thread(new Produce(queue)).start();
		new Thread(new Consumer(queue)).start();
		
		
	}

}
