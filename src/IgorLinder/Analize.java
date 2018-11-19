package IgorLinder;

public class Analize {
	private String name;			// Название анализируемого алгоритма
	private long startTime;			// начальное время работы алгоритма
			
	private static int sequense = 1;	
		
	private int steps;				// Количество шагов
	private int cycles;				// Количество циклов в каждом шаге
	private int compares;			// Количество операций сравнения
	private int iterations;			// Всего итераций
		
	{
		steps = 0;
		cycles = 0;
		compares = 0;
		iterations = 0;
	}
	
	DataUnit unit = new DataUnit();
	
	public void step() {
		this.steps++; 
		this.iterations++;
	}
	public void cycle() {
		this.cycles++; 
		this.iterations++;
	}
	public void compare() {
		this.compares++; 
		this.iterations++;
	}
		
	public void start(String name) {
		this.name = name;
		System.out.println("Start: (" + this.name + ")");
		startTime =  System.currentTimeMillis();
	}
	 
	public void stop() {
		System.out.println("\nStop: #"+ sequense++ + " (" + this.name + ")");
				
		unit.setName(this.name);								// Название анализируемого алгоритма
		unit.setTime(System.currentTimeMillis() - startTime);	// Время выполнения
		unit.setSteps(this.steps);								// количество проходов
		unit.setCycles(this.cycles); 							// количество циклов в шаге
		unit.setCompares(this.compares);						// количество сравнений
		unit.setIterations(this.iterations);					// всего итераций
		unit.setMemory(Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory());
		
		DataResults.getInstance().push(unit); 					// Результат анализа закидываем в стек результатов
		
	}	
}