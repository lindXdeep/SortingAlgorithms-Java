package Analize;

public class DataUnit {
	
	private String name;			
	
	private long time;				
	private long usedBytes;			
		
	private int steps;				
	private int cycles;				
	private int compares;			
	private int iterations;			
		
	{
		name = new String();
		time = 0;
		steps = 0;
		cycles = 0;
		compares = 0;
		iterations = 0;
	}
	
	public DataUnit() {
		
	}
	
	public DataUnit(DataUnit unit) {
		this.name = name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	public void setTime(long time) {
		this.time = time;
	}
	public void setSteps(int steps){
		this.steps = steps;
	}
	public void setCycles(int cycles) {
		this.cycles = cycles;
	}
	public void setCompares(int compares) {
		this.compares = compares;
	}
	public void setIterations(int iterations) {
		this.iterations = iterations;
	}
	public void setMemory(long bytes) {
		this.usedBytes = bytes;
	}
		
	public int getSteps(){
		return steps;
	}
	public int getCycles() {
		return cycles;
	}
	public int getCompares() {
		return compares;
	}
	public int getIterations() {
		return iterations;
	}
}



		
//if(stopTime <= 1000)
//	System.out.printf("\tTime: %d ms\n", stopTime);
//else if(stopTime > 1000 && stopTime < 1000*60)
//	System.out.printf("\tTime: %2.2f sec\n", (double)stopTime/1000);
//else if(stopTime > 1000*60)
//	System.out.printf("\tTime: %2.2f min\n", (double)stopTime/1000/60);
//


//if(usedBytes < (1024*1024*1024 ))
//	System.out.printf("\tUsed current memory: %3.2f mb\n", (double) usedBytes/(1024*1024));
//else if(usedBytes > 1024*1024*1024)
//	System.out.printf("\tUsed current memory: % 3.3f gb\n",(double) usedBytes/(1024*1024*1024) );
