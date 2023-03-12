public class Student // Question 1a
{
	// variables
	private String name;
	private String major;
	private double gpa;
	
	// constructors
	
	public Student()
	{
		name = "";
		major = "";
		gpa = 0.0;
	}
	
	public Student(String name, String major)
	{
		this.name = name;
		this.major = major;
		gpa = 0.0;
	}
	
	public Student(String name, String major, double gpa)
	{
		this.name = name;
		this.major = major;
		this.gpa = gpa;
	}
	
	// mutators and accessors
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getMajor()
	{
		return major;
	}
	
	public void setMajor(String major)
	{
		this.major = major;
	}
	
	public double getGpa()
	{
		return gpa;
	}
	
	public void setGpa(double gpa)
	{
		this.gpa = gpa;
	}
	
	// overriding toString() and equals()
	
	@Override
	public String toString()
	{
		return "Name: " + name + ", Major: " + major + ", GPA: " + gpa;
	}
	
	public boolean equals(Student student)
	{
		if (this.name.equals(student.name) && this.major.equals(student.major) &&
			this.gpa == student.gpa)
			return true;
		else
			return false;
	}
}
