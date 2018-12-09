package Algorithms;

import Sort.*;

public class Selection extends ArchetypeSort {
	
	public Selection(int[] arr, String name ) {
		super(arr, name);
	}

	@Override
	public void run() {
		analize.start(super.nameSort);
	
		for (int i = 0; i < size-1; i++)			//Итерации
		{											
			analize.step();
			for (int j = i+1; j < size; j++)		//Диапазон просматриваемых значений сокращается с каждой итерации
			{										
				analize.cycle();
				if(array[i] > array[j])
					swap(i,j);
			}
		}
				
		analize.stop();
	}
}
