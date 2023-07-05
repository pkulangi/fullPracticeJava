package methods;

public class MathOperation1 {

	public static void main(String[] args)
	{
		//create object of class to call non static method
		//className object=new ClassName()
		
		MathOperation1 mo1=new MathOperation1();
		mo1.addition();
		substraction();
		

	}
	
	public void addition()
	{
	
	int a;
	int b;
	int sum;
	
	a=10;
	b=20;
	sum=a+b;
	
	System.out.println("addition of a & b is "+sum);
	
	}
	
	public static void substraction()
	{
		int p=100;
		int q=80;
		int sub=p-q;
		
		System.out.println("Substraction of p & q is "+sub);
		
	}
}


