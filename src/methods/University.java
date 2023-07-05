package methods;

public class University {

	public static void main(String[] args)
	{
		//calling static method from same class
		studentInfo();
		
		studentInfo("Prashant",'M', 30, 90.33f);
		studentInfo("Rutambara",'F', 33, 50.55f);
		studentInfo("Pravin",'M', 20, 80);

	}
	
	public static void studentInfo()//method without parameter
	{
	
	//name,gender,roll no,%marks
	
	String studentName="Prasad";
	char gender='M';
	int rollNo=33;
	float marks=99.33f;
	
	System.out.println("Student name is "+studentName);
	System.out.println("Student gender is "+gender);
	System.out.println("Student rollNo is "+rollNo);
	System.out.println("Student marks are "+marks);

}
	
	public static void studentInfo(String name,char gender,int rollNo,float marks)//method with parameter
	{
		System.out.println("=====================================================");
		System.out.println("Student name is "+name);
		System.out.println("Student gender s "+gender);
		System.out.println("Student rollno is "+rollNo);
		System.out.println("Student marks are "+marks);
	}
}
