package methods;

public class Multiplication {

	public static void main(String[] args)
	{
		Multiplication m=new Multiplication();
		m.mul();
		m.mul();
		
		m.mul(4, 5);
		m.mul(10, 30);
		
	}
	
	public void mul()//method without parameter
	{
		int a=10;
		int b=20;
		int mul=a*b;
		System.out.println("Multiplication of a & b is "+mul);
		
	}
	
	public void mul(int a,int b)
	{
		int mul=a*b;
		
		System.out.println("Multiplication is "+mul);
	}

}
