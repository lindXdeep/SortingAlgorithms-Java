package IgorLinder.Algorithms;

import IgorLinder.ArchetypeSort;

public class Bubble extends ArchetypeSort{

	public Bubble(int[] arr, String name) {
		super(arr, name); 
	}

	@Override
	public void run() {
		analize.start(super.nameSort);
			
		for (int i = 0; i < array.length; i++)
		{
			
			for (int j = 0; j < array.length-1; j++)
			{
				if(array[j] > array[j+1])
					swap(j, j+1);
			}
		}	
			
		analize.stop();
	}
}
