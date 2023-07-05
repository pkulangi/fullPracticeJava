package controlStatements;

public class NestedIfElse2 {

	public static void main(String[] args)
	{
		//if ATM pin is correct,then enter Rupees
		
				//if Rupees is enter,then withdraw successful
								
				//else incorrect password
								
				//else incorrect username
				
				String pin="1234";
				String rupees="5000";
				
				if(pin=="1234")
				{
					System.out.println("Enter rupees");
					
					if(rupees=="5000")
					{
						System.out.println("Withdraw successful");
					}
					else
					{
						System.out.println("not withdrawl");
					}
				}
				else
				{
					System.out.println("incorrect pin");
					
				}

	}

}
