package controlStatements;

public class ElseIfStudy2 {

	public static void main(String[] args)
	{
		//if vehicle is bus, then its good
		//else if vehicle is train,then its boring
		//else if vehicle is Car,then its good and comfortable
		
		String vehicle="Train";
		if(vehicle=="Bus")
		{
			System.out.println("Its good");
		}
		else if(vehicle=="Train")
		{
			System.out.println("its boring journey");
		}
		else if(vehicle=="Car")
		{
			System.out.println("Its good and comfortable");
			
		}
		else
		{
			System.out.println("provide correct inputs");
		}
		
		

	}

}
