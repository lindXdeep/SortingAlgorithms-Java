package Sort;

import Algorithms.*;

public class SortSelection {
	
	private Sorting sorting = null;
	
	private int[] array;
	
	//Registered sorting types
	private TypeSort type_Selection = TypeSort.SELECTION;
	private TypeSort type_Insertion = TypeSort.INSERTION;
	private TypeSort type_Bubble =  TypeSort.BUBBLE;		
	
	public SortSelection(int[] array2) {
		this.array = new int[array2.length];
		for (int i = 0; i < array2.length; i++) 
			this.array[i] = array2[i];
	}	
	
	public Sorting getSort(TypeSort type) {
		
		switch (type)
		{
			case SELECTION: sorting = new Selection(this.array, type_Selection.nameSort());		break;
			case INSERTION: sorting = new Insertion(this.array, type_Insertion.nameSort());		break;
			case BUBBLE: 	sorting = new Bubble(this.array, type_Bubble.nameSort());			break;
			default:
				break;
		}
		
		return sorting;
	}
}
