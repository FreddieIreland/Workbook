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
	private int month;
	private int day;
	private int year;
	private int days;
	private int index;
	private int counter=0;
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
	public Student getClosestBday(int m, int d, int y)
	{
		days=0;
		month=m;
		day=d;
		while (true)
		{
			if (list.get(counter).getMonth() < month)
			{
				list.remove(counter);
			}
			else
			{
				if (list.get(counter).getMonth() >= month)
				{
					System.out.print(list.get(counter));
					break;
				}
			}
		}
		return list.get(0);
	}
	public String toString()
	{
		return list.toString();
	}
		
}
