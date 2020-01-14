import pkg.*;

public class starter implements InputKeyControl {
		
		
        public static void main(String args[])
        {
			EasyReader joe = new EasyReader();
			System.out.print("Please enter your name: ");
			String bob=joe.readWord();
			EasyReader joey = new EasyReader();
			System.out.print("How many times should your name be printed? ");
			int bobby=joey.readInt();
			for (int i=0;i<bobby;i++)
			{
				System.out.println(bob);
			}
			// please leave following line alone, necessary for keyboard input
			KeyController mC = new KeyController(Canvas.getInstance(),new starter());
			
			// enter code here
			
		}
		public void keyPress(String s)
		{
			// enter code here
			
		}

}
