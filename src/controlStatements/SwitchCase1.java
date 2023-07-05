package controlStatements;

public class SwitchCase1 {

	public static void main(String[] args)
	{
		//Summer-->its hot
		
		//winter-->its cold
				
		//Rainy-->its Raining
				
		//key--->Variable-->season
		
		String season;
		season="Summer";
		
		switch (season) {
		case "Summer":
		{
			
			System.out.println("Its too hot");
			break;
		}
		case "Winter":
		{
			System.out.println("Its too cold");
			break;
		}
		case "Rainy":
		{
			System.out.println("Its rainy");
			break;
		}
		default:
		{
			System.out.println("please enter valid seasons");
		}
		
		}

	}

}
