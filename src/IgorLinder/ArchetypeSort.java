package IgorLinder;
//��� ���������� ������ ��������� ��� ������� � �������

public abstract class ArchetypeSort implements Sorting{
	
	String nameSort;
	int size;
	int[] array;
	
	public ArchetypeSort(int[] arr, String name) {
		this.nameSort = new String(new StringBuffer(name));
		size = arr.length;
		array =  new int[size];
		
		for (int i = 0; i < size; i++)
			this.array[i] = arr[i];
	}
}
