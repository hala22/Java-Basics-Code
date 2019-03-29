package iterator;

public interface List<T> {

	public void add(T obj);
	
	public T get(int index);
	
	public int size();
	
	public Iterator<T> iterator();
}
