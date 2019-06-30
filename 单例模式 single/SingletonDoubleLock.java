package test;

public class Singleton {
	
	private Singleton() {
		
	}

	private volatile static Singleton instance;

	//内层的if判空是针对，前一个线程创建了实例，这时其他线程刚好通过了外层if判空
	
	public static Singleton getInstance() {
		if(instance==null) {
			synchronized (Singleton.class) {
				if(instance==null) {
					instance=new Singleton();
				}
			}
		}
		
		return instance;
	}
}
