package methods;

public class Sample2 {

	public static void main(String[] args)
	{
		//className object=new className()
		
		Sample2 s2=new Sample2();//calling non static method from same class
		s2.m();
		s2.m1();
		
		//to call non static method from another class---> create object of that class
		
		Sample s=new Sample();
		s.test();
		s.display();
		s.run();
		s.gun();
		

	}
	
	public void m()
	{
		System.out.println("Method m non static from sample2");
		
	}
	public void m1()
	{
		System.out.println("Method m1 non static from sample2");
		
	}
	

}
