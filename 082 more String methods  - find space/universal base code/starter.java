import pkg.*;
public class starter
{
        public static void main(String args[])
        {
			EasyReader joe = new EasyReader();
			System.out.print("Please enter a first and last name: ");
			String bob = joe.readLine();
			int sue = bob.indexOf(" ");
			String sally = "";
			for (int i=0;i<bob.length()-sue-1;i++)
			{
				sally=sally+bob.substring(i+sue+1,i+sue+2);
			}
			System.out.print("Their last name is: "+sally);
		}
}

// C:\Users\FIRE1080\Desktop\workbook\082 more String methods  - find space\universal base code>java -cp .; starter
// Please enter a first and last name: Aditya Bose
// Their last name is: Bose
// C:\Users\FIRE1080\Desktop\workbook\082 more String methods  - find space\universal base code>pause
// Press any key to continue . . .