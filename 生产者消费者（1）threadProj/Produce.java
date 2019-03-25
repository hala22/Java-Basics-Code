package threadProj;

public class Produce implements Runnable{
	
	private Queue queue;
	
	public Produce(Queue queue) {
		this.queue=queue;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int i=0;
		
		while(true) {
			queue.setN(i++);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
