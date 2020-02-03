import pkg.*;
public class CVMath
{
	
	public int adarsh;
	public CVMath()
	{
	}
	public static int findMiddle(int num1, int num2, int num3)
	{
		int bob = Math.max(Math.max(Math.min(num1,num2),Math.min(num2,num3)),Math.min(num1,num3));
		return bob; 
	}
	public static double sqrt(double num4)
	{
		double guess = 1;
		while (true)
		{
			double bobby = guess;
			guess = (num4/guess + guess)/2;
			if (Math.abs(guess-bobby) < .0000001)
			{
				break;
			}
		}
		return guess;
		
	}
	public static void magicSqu(int num)
	{
		long counter=0;
		long sum=0;
		long temp=1;
		while (counter<num)
		{
			sum=sum+temp;
			double d = Math.sqrt(sum);
			long i = (long)(Math.sqrt(sum));
			if (i==d)
			{
				System.out.println(i*i);
				counter++;
			}
			temp++;
		}
	}
}