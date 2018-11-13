package IgorLinder.Algorithms;

import IgorLinder.ArchetypeSort;

public class Selection extends ArchetypeSort {
	
	public Selection(int[] arr, String name ) {
		super(arr, name);
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + ".start -> " + super.nameSort + ": ");
	
		for (int i = 0; i < size; i++) {
			for (int j = i+1; j < size; j++) {
				if(array[i] > array[j])
					swap(i,j);
			}
		}
				
		System.out.println(Thread.currentThread().getName() + ".stop -> " + super.nameSort + ". ");
	}
}
