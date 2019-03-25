package threadProj;

public class Queue {
	
	private int n;
	private boolean flag=true;
	
	
	public Queue() {
		
	}
	
	public synchronized void setN(int num) {
		
		if(!flag) {
			try {
				wait();
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("生产："+num);
		n=num;
		flag=false;
		this.notify();
	}
	
	
	public synchronized int getN() {
		if(flag) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("消费："+n);
		flag=true;
		this.notify();
		return n;
	}
	
	

}
