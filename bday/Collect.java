import pkg.*;
import java.util.*;
public class Collect
{
	private ArrayList<Student> list;
	private String w;
	private String bday;
	private Student stu;
	private int close;
	private int c;
	public Collect(String file)
	{
		list = new ArrayList<Student>();
		EasyReader names = new EasyReader(file);
		while (!names.eof())
		{
			stu = new Student(names.readWord(),names.readWord(),names.readInt(),names.readInt(),names.readInt());
			list.add(stu);
		}
	}
	public String getClosestBday(int month, int day, int year)
	{
		Student joe[] = new Student[list.size()];
		return joe[c].getBirthday();
	}
	public String toString()
	{
		return list.toString();
	}
		
}
