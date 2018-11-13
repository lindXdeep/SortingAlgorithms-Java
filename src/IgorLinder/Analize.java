package IgorLinder;

public class Analize {
	private String name;
	private long startTime;
	private long stopTime;
		
	private long usedBytes;
		
	private static int sequense = 1;	
		
	public Analize() {
		
	}		
	
	public void start(String name) {
		this.name = name;
		System.out.println("Start: (" + this.name + ")");
		startTime =  System.currentTimeMillis();
	}
	 
	public void stop() {
		stopTime = System.currentTimeMillis() - startTime;
		System.out.println("\nStop: #"+ sequense++ + " (" + this.name + ")");
		
		if(stopTime <= 1000)
			System.out.printf("\tTime: %d ms\n", stopTime);
		else if(stopTime > 1000 && stopTime < 1000*60)
			System.out.printf("\tTime: %2.2f sec\n", (double)stopTime/1000);
		else if(stopTime > 1000*60)
			System.out.printf("\tTime: %2.2f min\n", (double)stopTime/1000/60);
				
		currentMemoryUsed();
		
	}
	
	private void currentMemoryUsed() {
			
		usedBytes = (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory());
					
		if(usedBytes < (1024*1024*1024 ))
			System.out.printf("\tUsed current memory: %3.2f mb\n", (double) usedBytes/(1024*1024));
		else if(usedBytes > 1024*1024*1024)
			System.out.printf("\tUsed current memory: % 3.3f gb\n",(double) usedBytes/(1024*1024*1024) );
	}
}

