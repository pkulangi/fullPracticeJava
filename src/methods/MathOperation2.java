package methods;

public class MathOperation2 {

	public static void main(String[] args)
	{
		MathOperation2 mo2=new MathOperation2();
		mo2.addition();
		mo2.substraction();
		multiplication();
		division();
		
		
	}
	
	public void addition()
	{
		int a=10;
		int b=20;
		int c=30;
		int sum=a+b+c;
		
		System.out.println("Addition of a,b & c "+sum);
		
	}
	public static void multiplication()
	{
		int p=10;
		int q=20;
		int mul=p*q;
		
		System.out.println("Multiplication of p &q is "+mul);
		
	}
	public void substraction()
	{
		int d=20;
		int e=10;
		int sub=d-e;
		
		System.out.println("Substraction of d & e "+sub);
		
	}
	
	public static void division()
	{
		int s=10;
		int r=5;
		int div=s/r;
		
		System.out.println("Division of s & r is "+div);
	}

}
