package threadProj;

import java.util.LinkedList;

public class Queue {

	LinkedList<Bread> list=new LinkedList<>();
	
	
	public Queue() {
		
	}
	
	public synchronized void produceBread(Bread b) {
		if(list.size()>=5) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		list.add(b);
		System.out.println("生产面包："+b);
		this.notify();
	}
	
	public synchronized void consumerBread() {
		if(list.size()==0) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		Bread b=list.poll();
		System.out.println("消费面包："+b);
		this.notify();
	}

}
