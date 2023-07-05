package constructor;

public class MathOperation {
	
	int a;
	int b;
	int c;
	int sum;
	
	//user defined without parameter
	
	public MathOperation()
	{
		//use constructor to initialize variable
		
		a=10;
		b=20;
		
	}
	
	public MathOperation(int x)
	{
		a=x;
	}
	
	public MathOperation(int x,int y)
	{
		a=x;
		b=y;
		
	}
	
	public MathOperation(int x,int y,int z)
	{
		a=x;
		b=y;
		c=z;
	}

	public static void main(String[] args)
	{
		MathOperation mo=new MathOperation();
		mo.addition();
		
		MathOperation mo1=new MathOperation(50);
		mo1.addition();
		
		MathOperation mo2=new MathOperation(30, 30);
		mo2.addition();
		
		MathOperation mo3=new MathOperation(100, 20, 300);
		mo3.addition();
	}
	
	public void addition()
	{
		sum=a+b+c;
		System.out.println("Addition is "+sum);
	}

}
