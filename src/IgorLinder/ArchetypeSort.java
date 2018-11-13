package IgorLinder;
//При добавлении нового алгоритма тут ничегон е трогаем

public abstract class ArchetypeSort implements Sorting{
	
	protected String nameSort;
	protected int size;
	protected int[] array;
	
	public ArchetypeSort(int[] arr, String name) {
		this.nameSort = new String(new StringBuffer(name));
		size = arr.length;
		array =  new int[size];
		
		for (int i = 0; i < size; i++)
			this.array[i] = arr[i];
	}
	
	public void swap(int a, int b) {
		int temp = array[a];
		array[a] =  array[b];
		array[b] = temp;
	}

	@Override
	public int[] getArray() {
		return this.array;
	}
	
	@Override
	public String getName() {
		return nameSort;
	}
}
