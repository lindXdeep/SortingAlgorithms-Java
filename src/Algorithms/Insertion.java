package Algorithms;

import Sort.*;

public class Insertion extends ArchetypeSort {

	public Insertion(int[] arr, String name) {
		super(arr, name);
	}

	@Override
	public void run()
	{
		analize.start(super.nameSort);
				
		int i,j,inst;
		for (i = 1; i < size; i++) 							//Проходим последовательно по массиву
		{ 
			analize.cycle();
			
			inst = array[i];								//Каждый текущей элемент будем сравнивать с отсортированной последовательностью
			
			for (j = i-1; j >= 0 && array[j] > inst; j--) 	//Посматриваем от текущего к левому, до тех пор пока просматриваемый > текущего
			{												//Пока это условие выполняемся
				analize.compare();
				
				array[j+1] = array[j];						//Сдвигаем элементы, которые до текущего, в право, пока не дошли до Array[j] < x					
			}
			
			analize.step();
			
			array[j+1] = inst;								//Если Array[j] < x  то место найдено, вставить элемент.
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
