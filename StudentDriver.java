public class StudentDriver // Question 1b
{
	public static void main(String args[])
	{
		// creating student objects
		Student student1 = new Student("John", "CS", 3.5);
		Student student2 = new Student();
		
		// updating student2 fields
		student2.setName("Mary Ann");
		student2.setMajor("CE");
		student2.setGpa(3.3);
		
		// printing toString() for both objects
		System.out.println(student1);
		System.out.println(student2);
	}
}
