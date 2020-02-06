import pkg.*;
public class Student
{
	private String fname;
	private String lname;
	private int month;
	private int day;
	private int year;
	public Student(String a, String b, int c, int d, int e)
	{
		fname=a;
		lname=b;
		month=c;
		day=d;
		year=e;
	}
	public int getMonth()
	{
		return month;
	}
	public int getDay()
	{
		return day;
	}
	public int getYear()
	{
		return year;
	}
	public String getName()
	{
		return fname+" "+lname;
	}
	public String getBirthday()
	{
		return month+"/"+day+"/"+year;
	}
	public String toString()
	{
		return getName()+" "+getBirthday();
	}
		
}
