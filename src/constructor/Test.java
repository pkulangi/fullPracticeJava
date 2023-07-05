package constructor;

public class Test {
	
	int a=5;
	int b=6;
	int sum;
	
	public Test()
	{
		a=10;
		b=20;
	}
	public Test(int m)
	{
		a=m;
	}
	public Test(int p,int q)
	{
		a=p;
	    b=q;
	}
	

	public static void main(String[] args)
	{
		Test t=new Test();
		t.addition();
		
		Test t1=new Test(40, 50);
		t1.addition();
	

	}
	
	public void addition()
	{
		sum=a+b;
		
		System.out.println("Addition is "+sum);
	}

}
