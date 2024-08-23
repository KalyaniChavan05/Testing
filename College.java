class Student
{
	String name ="Kalyani";
}
class College extends Student
{
	
	String course= "BCA-III";

	public static void main(String args[])
	{
		College c1= new College();
		System.out.println("Name of the Student is:"+c1.name);
		System.out.println("Class is:"+c1.course);
	}
}

	