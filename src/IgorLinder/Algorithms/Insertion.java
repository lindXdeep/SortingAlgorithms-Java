package IgorLinder.Algorithms;

import IgorLinder.ArchetypeSort;

public class Insertion extends ArchetypeSort {

	public Insertion(int[] arr, String name) {
		super(arr, name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run()
	{
		System.out.println(Thread.currentThread().getName() + ".start -> " + super.nameSort + ": ");
		
		
		for (int i = 1; i < size; i++) 
		{
			int inst = array[i];
			for (int j = i-1; j >= 0 && array[j] > inst; j--) 
			{
				array[j+1] = array[j];
				array[j] = inst;				
			}
		}
		
		System.out.println(Thread.currentThread().getName() + ".stop -> " + super.nameSort + ". ");
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
