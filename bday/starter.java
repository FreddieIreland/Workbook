import pkg.*;
public class starter 
{
		

        public static void main(String args[])
        {
			Collect jay = new Collect("bday.txt");
			System.out.println(jay);
			System.out.println(jay.getClosestBday(2,6,2020));
		}
		
		
}
