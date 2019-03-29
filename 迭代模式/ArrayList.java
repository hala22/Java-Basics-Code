package iterator;

public class ArrayList<T> implements List<T> {
	
	private Object[] obj=null;
	private int index=0;
	private int size=0;
	
	public ArrayList() {
		obj=new Object[10];
	}
	
	public ArrayList(int size) {
		if(size<=10)
			obj=new Object[10];
		else
			obj=new Object[size];
	}
	
	@Override
	public void add(T obj) {
		// TODO Auto-generated method stub
		this.obj[index++]=obj;
		size++;
		if(size%10==0) {
			Object[] obj1=new Object[size+10];
			for(int i=0;i<size;i++) {
				obj1[i]=this.obj[i];
			}
			
			this.obj=obj1;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public T get(int index) {
		// TODO Auto-generated method stub
		return (T) this.obj[index];
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return this.size;
	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return new MyIterator<T>(this);
	}

}
