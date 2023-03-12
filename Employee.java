public class Employee // Question 5e
{
	private String name;
	private int hours;
	
	public Employee(String name, int hours)
	{
		this.name = name;
		this.hours = hours;
	}
	
	public double calculateSalary()
	{
		return hours * 20;
	}
	
	public double getHours() // needed to access hours for Professor class
	{
		return hours;
	}
	
	// mutators and accessors go here
}
