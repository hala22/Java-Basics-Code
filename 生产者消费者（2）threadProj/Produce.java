package threadProj;

public class Produce implements Runnable{
	
	private Queue queue;
	
	public Produce(Queue queue) {
		this.queue=queue;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i=0;i<20;i++) {
			queue.produceBread(new Bread(i));
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	

}
