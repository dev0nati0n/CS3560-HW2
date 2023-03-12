public class Professor extends Employee // Question 5e
{
	private String field;
	
	public Professor(String name, int hours, String field)
	{
		super(name, hours);
		this.field = field;
	}
	
	@Override
	public double calculateSalary()
	{
		return getHours() * 30;
	}
	
	// mutators and accessors go here
}
