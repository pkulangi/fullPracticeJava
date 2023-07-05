package methods;

public class Sample {

	public static void main(String[] args)
	{
		//to call non static method we need to create an object at least once
		
		//how to create an object
		
		//classname object=new classname()
		
		Sample s=new Sample();
		
		//how to call non static methods
		//objectName.methodName
		
		s.test();
		s.display();
		s.run();
		s.gun();
		
		

	}
	
	public void test()
	{
		System.out.println("Non static regular method test - is running");
		
	}
	
	public void display()
	{
		System.out.println("Hi good morning");
	}
	
	public void run()
	{
		System.out.println("run fast boys");
		
	}
	
	public void gun()
	{
		System.out.println("Gun is very hot");
		
	}

}
