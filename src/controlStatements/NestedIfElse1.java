package controlStatements;

public class NestedIfElse1 {

	public static void main(String[] args)
	{
		//if username is correct then enter a password
		//if password is correct then login success
		//else incorrect password
		//else incorrect user name
		
		String UN="pkulangi";
		String PWD="2001@prasad";
		
		if(UN=="pkulangi")
		{
			System.out.println("please enter password");
			
			if(PWD=="2001@prasad")
			{
				System.out.println("login successful");
			}
			else
			{
				System.out.println("incorrect password");
			}
		}
		else
		{
			System.out.println("incorrect username");
		}

	}

}
