package IgorLinder.Algorithms;

import IgorLinder.ArchetypeSort;

public class Insertion extends ArchetypeSort {

	public Insertion(int[] arr, String name) {
		super(arr, name);
	}

	@Override
	public void run()
	{
		analize.start(super.nameSort);
				
		int i,j,inst;
		for (i = 1; i < size; i++) 							//�������� ��������������� �� �������
		{
			inst = array[i];								//������ ������� ������� ����� ���������� � ��������������� �������������������
			
			for (j = i-1; j >= 0 && array[j] > inst; j--) 	//������������ �� �������� � ������, �� ��� ��� ���� ��������������� > ��������
			{												//���� ��� ������� �����������
				array[j+1] = array[j];						//�������� ��������, ������� �� ��������, � �����, ���� �� ����� �� Array[j] < x					
			}
			array[j+1] = inst;								//���� Array[j] < x  �� ����� �������, �������� �������.
		}
		
		
		analize.stop();
	}

}


/*
 * 
 * 
 *   4, 1, 7, 3
 * 
 * 
 * 
 */
