	package src.com.coderscampus.arraylist;

public class CustomArrayList<T> implements CustomList<T> {
	Object[] items = new Object[10];
	int size = 0;
	
	
	
	
	@Override
	public boolean add(T item) {
		
		if(size >= items.length) {
			Object[] items2 = new Object[2 * items.length];
			System.arraycopy(items, 0, items2, 0, items.length);
			items = items2;
			
			}
		
		items[size] = item;
		size++;
		
		return true;
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		
		
		return size;
	
	}

	@Override
	public T get(int index) {
		
		return (T) items[index];
	}
	
	
}

