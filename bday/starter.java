import pkg.*;
public class starter 
{
		

        public static void main(String args[])
        {
			Collect jay = new Collect("bday.txt");
			System.out.println(jay);
			System.out.println(jay.getClosestBday(12,20,2020));
			System.out.println(jay.getTotalDay(3,20,2020));
			
		}
		
		
}
