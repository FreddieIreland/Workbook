import pkg.*;
public class Student
{
	private String fname;
	private String lname;
	private int month;
	private int day;
	private int year;
	private int bob=0;
	private int mday[]={31,29,31,30,31,30,31,31,30,31,30,31};
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
	// public int getTotalDay(int d, int m)
	// {
		// for (int i=0;i<month-1;i++)
		// {
			// bob=getDay()+mday[i];
		// }
		// return bob;
	// }
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
