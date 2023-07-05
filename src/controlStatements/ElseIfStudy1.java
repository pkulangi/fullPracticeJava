package controlStatements;

public class ElseIfStudy1 {

	public static void main(String[] args)
	{
		//if signal is red then Stop
		//else if signal is yellow then wait
		//else if signal is green then go
		
		String signal="Green";
		if(signal=="Red")
		{
			System.out.println("please Stop");
			
		}
		else if(signal=="Yellow")
		{
			System.out.println("please Wait");
		}
		else if(signal=="Green")
		{
			System.out.println("Please Go");                                   
		}
		else
		{
			System.out.println("provide correct inputs");
		}
		

	}

}
