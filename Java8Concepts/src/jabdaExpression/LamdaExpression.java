package jabdaExpression;


public class LamdaExpression {

	public static void main(String[] args) {
		
		
		PrintResult i=()->{
			return "hello good morning india";
		};
		
		System.out.println(i.getData());
		
		PrintResult i2=()->"please write a shortcut code";
		System.out.println(i2.getData());
		
//----------------------------------------------------------------------------------------------
		AddNumber addNumber1=(a,b)->{
			return a+b;
		};
		System.out.println("addition of two numbers "+addNumber1.addnum(5, 6));
		
		AddNumber addNumber=(a,b)->a+b;
		System.out.println("add number "+addNumber.addnum(3, 7));
//-----------------------------------------------------------------------------------------------
		
		StringLength stringLength=(a->a.length());
		System.out.println("get length "+stringLength.getlength("navin reddy wel come"));
	}
}
