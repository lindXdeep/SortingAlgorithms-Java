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
		for (i = 1; i < size; i++) 							//ѕроходим последовательно по массиву
		{
			inst = array[i];								// аждый текущей элемент будем сравнивать с отсортированной последовательностью
			
			for (j = i-1; j >= 0 && array[j] > inst; j--) 	//ѕосматриваем от текущего к левому, до тех пор пока просматриваемый > текущего
			{												//ѕока это условие выполн€емс€
				array[j+1] = array[j];						//—двигаем элементы, которые до текущего, в право, пока не дошли до Array[j] < x					
			}
			array[j+1] = inst;								//≈сли Array[j] < x  то место найдено, вставить элемент.
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
