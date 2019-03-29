package iterator;

public class MyIterator<T> implements Iterator<T> {
	
	private List<T> list=null;
	
	private int index=0;
	
	public MyIterator(List<T> list){
		this.list=list;
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return index<list.size();
	}

	@Override
	public T next() {
		// TODO Auto-generated method stub
		return list.get(index++);
	}

}
