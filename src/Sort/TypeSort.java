package IgorLinder;

public enum TypeSort{
	SELECTION {
		public String nameSort() {
			return "Selection Sorting"; 
		}
	},
		
	INSERTION {
		public String nameSort() {
			return "Insertion Sorting"; 
		}
	},
	
	BUBBLE {
		public String nameSort() {
			return "Bubble Sorting"; 
		}
	};
	
	public abstract String nameSort();
}
