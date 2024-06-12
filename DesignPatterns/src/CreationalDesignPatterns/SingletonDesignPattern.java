package CreationalDesignPatterns;

public class SingletonDesignPattern {
	private static SingletonDesignPattern singleton;
	
	
	private SingletonDesignPattern() {
		
	}
	
	public static SingletonDesignPattern getDesignPattern() {
		
		if(singleton==null) {
			singleton=new SingletonDesignPattern();
		}
		
		return singleton;
		
		
	}
	
	public void display() {
		System.out.println("hi india");
	}

}

class Show{
	public static void main(String[] args) {
		
		SingletonDesignPattern Pattern=SingletonDesignPattern.getDesignPattern();
		Pattern.display();
		
	}
}
