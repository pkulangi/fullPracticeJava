package controlStatements;

public class IfElse {

	public static void main(String[] args)
	{
		//if marks is greater than equal to 35 then you are pass 
		int marks=35;
		if(marks<30)
		{
			System.out.println("you are pass");
			
		}
		else
		{
			System.out.println("you are fail");
			
		}
		
		//if marks is greater than equal to 35 then you are pass else you are fail
		
		int mark=38;
		if(mark>=35)
		{
			System.out.println("you are pass");
			
		}
		else
		{
			System.out.println("you are fail");
			
		}
		
		System.out.println("===============================================");
		
		String signal="Red";
		if(signal=="Red")
		{
			System.out.println("Stop");
			
		}
		else
		{
			System.out.println("Go");
			
		}
		System.out.println("===============================================");
		
		String signals="Green";
		if(signals=="Red")
		{
			System.out.println("you can stop");
			
		}
		else
		{
			System.out.println("you can go");
			
		}
		
		System.out.println("===============================================");
		
		float temp=5;
		if(temp>0)
		{
			System.out.println("Its hot");
			
		}
		else
		{
			System.out.println("Its cool");
			
		}
		
		System.out.println("===============================================");
		
		String day="Sunday";
		if(day=="Sunday")
		{
			System.out.println("Its holiday");
			
		}
		else
		{
			System.out.println("Its Working day");
			
		}
		
		System.out.println("===============================================");
		
		String symbol="+";
		if(symbol=="-")
		{
			System.out.println("Its addition");
		}
		else
		{
			System.out.println("Its substraction");
		}
		
		System.out.println("===============================================");
		
		String laptop="Dell";
		if(laptop=="Dell")
		{
			System.out.println("its a Dell laptop");
		}
		else
		{
			System.out.println("its a Lenovo laptop");
		}
		System.out.println("===============================================");
		
		String lang="Java";
		if(lang=="C++")
		{
			System.out.println("Its a java language");
		}
		else
		{
			System.out.println("Its a C++ language");
		}

	}

}
