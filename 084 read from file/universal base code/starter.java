import pkg.*;
public class starter 
{
	public static void main(String args[])
	{
		EasyReader henri = new EasyReader("moby.txt");
		int counter=0;
		while (!henri.eof())
		{
			String nikitas = henri.readLine();
			for (int i=0;i<nikitas.length()-4;i++)
			{
				String sue = nikitas.toLowerCase().substring(i,i+4);
				if (sue.equals("whal"))
				counter++;
			}
		}
		System.out.print("End of file! The word whale appeared "+counter+" times.");
		
	}	
}
