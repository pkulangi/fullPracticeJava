package controlStatements;

public class Ifstudy {

	public static void main(String[] args)
	{
		//If-->It is used when we want to test a condition
		
		int marks=60;
		if(marks>=60)
		{
			System.out.println("you are pass");
		}
		System.out.println("=================================================");
		
		int mark=35;
		if(mark<30);
		{
			System.out.println("you are fail");
		}
		System.out.println("===================================================");
		
		String signal="Green";
		if(signal!="red")
		{
			System.out.println("you can go");
		}
		System.out.println("===================================================");
		
		String signals="red";
		if(signals=="red")
		{
			System.out.println("Stop");
			
		}
		
		System.out.println("===================================================");
		
		char gender='M';
		if(gender=='M')
		{
			System.out.println("M means male");
			
		}
		System.out.println("===================================================");
		char genderr='F';
		if(genderr!='M')
		{
			System.out.println("you are female");
		}
		

	}

}
