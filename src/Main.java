import java.util.Random;
import Sort.*;

public class Main {
	
	private static int[] array;
	private static SortSelection sortSelection;
	
	public Main() {
				
	}
	
	public void initializing() {
		System.out.println("Source Array:");
		array = getRandomintArray(10);
		sortSelection = new SortSelection(array);
		//printArray();
	}
	
	public void SortingAlgorithms() {
				
		Sorting selection = sortSelection.getSort(TypeSort.SELECTION); 
		Thread selection_thread = new Thread(selection); 
				selection_thread.start();
			
		Sorting insertion = sortSelection.getSort(TypeSort.INSERTION);
		Thread insertion_thread = new Thread(insertion);
				insertion_thread.start();
		
		Sorting bubble = sortSelection.getSort(TypeSort.BUBBLE);
		Thread bubble_thread = new Thread(bubble);
				bubble_thread.start();
				
				
		try {
			selection_thread.join();
			insertion_thread.join();
			bubble_thread.join(); 
		} catch (InterruptedException e) {
			e.getMessage();
		}
			
		
		//проверка (в этом потоке выполняется последовательно)
		System.out.print("\n - - - - - - - - - - Result - - - - - - - - - - \n");
			printArray(checkSequence(selection));
			printArray(checkSequence(insertion));
			printArray(checkSequence(bubble));
//			printArray(selection);
//			printArray(insertion);
//			printArray(bubble);
	}
		
	public static void main(String[] args) {
				
		Thread mainThread = new Thread(new Runnable() {
			@Override
			public void run() {
				Main BasicAlgorithms = new Main();
					 BasicAlgorithms.initializing();
					 BasicAlgorithms.SortingAlgorithms();
			}
		});
			
		mainThread.setName("Main\n");
		mainThread.start();
		System.out.println("Thread: " + mainThread.getName());
	}
	
	
	private int[] getRandomintArray(int n) {
		Random rand = new Random();
		int[] arr = new int[n];
		
		for (int i = 0; i < arr.length; i++) 
			arr[i] = rand.nextInt(n+1);
		return arr;
	}
	
	public static boolean checkSequence(Sorting obj) {
		System.out.print("\nResult: " + obj.getName());
		
		int arr[] = obj.getArray();
		
		for (int i = 0; i < arr.length-1; i++) {
			if(arr[i] > arr[i+1] )
				return false;
		}
		return true;
	}
	
	public void printArray(boolean t ) {
		if(t == true)
			System.out.println(" -> Array sorted correctly!");
		else
			System.err.println(" -> Array not sorted...!");
	}
	

	@SuppressWarnings("unused")
	private void printArray(Sorting obj) {
		System.out.print("\nResult: " + obj.getName());
		printArray(obj.getArray());
	}
	
	@SuppressWarnings("unused")
	private <T> void printArray() {
		printArray(array);
	}
 
	private void printArray(int[] arr) 
	{
		int newStrCount = 0;
		int size = arr.length;
				
		int sizeDeli = size;
		int countDeli = -2;
					
		String[] delimiter = {"%1d ","%2d ","%3d ","%4d ","%5d ","%6d ","%7d ","%8d ","%9d ","%10d "};
				
			while(sizeDeli != 0){
				sizeDeli = sizeDeli/10;
				countDeli++;
			}
					
			for (int i = 0; i < size; i++)
			{
				System.out.printf(delimiter[countDeli], arr[i]);
								
				newStrCount ++;
				if( (size <= 100 && newStrCount  == 25) || (size > 100 && size <= 1000 && newStrCount == 20) || (size > 1000 && newStrCount == 10)) {
					System.out.println();
					newStrCount=0;
				} 
			} 
	}
}




