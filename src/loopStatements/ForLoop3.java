package loopStatements;

public class ForLoop3 {

	public static void main(String[] args)
	{
		// i want to print table of 2 in incremental order
		//start-->2  end-->20 update by 2
		
		for(int i=2;i<=20;i=i+2)
		{
			System.out.println(i);
		}
		
		// i want to print table of 2 in decremental order
		//start-->20  end-->2  update by -2
		
		for(int i=20;i>=2;i=i-2)
		{
			System.out.println(i);
		}

	}

}
