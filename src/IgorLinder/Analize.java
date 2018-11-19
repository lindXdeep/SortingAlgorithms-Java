package IgorLinder;

public class Analize {
	private String name;			// �������� �������������� ���������
	private long startTime;			// ��������� ����� ������ ���������
			
	private static int sequense = 1;	
		
	private int steps;				// ���������� �����
	private int cycles;				// ���������� ������ � ������ ����
	private int compares;			// ���������� �������� ���������
	private int iterations;			// ����� ��������
		
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
				
		unit.setName(this.name);								// �������� �������������� ���������
		unit.setTime(System.currentTimeMillis() - startTime);	// ����� ����������
		unit.setSteps(this.steps);								// ���������� ��������
		unit.setCycles(this.cycles); 							// ���������� ������ � ����
		unit.setCompares(this.compares);						// ���������� ���������
		unit.setIterations(this.iterations);					// ����� ��������
		unit.setMemory(Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory());
		
		DataResults.getInstance().push(unit); 					// ��������� ������� ���������� � ���� �����������
		
	}	
}