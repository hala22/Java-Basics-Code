package threadProj;

public class Consumer implements Runnable {
	
	private Queue queue;
	
	public Consumer (Queue queue) {
		this.queue=queue;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		while(true) {
			
			queue.getN();
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
