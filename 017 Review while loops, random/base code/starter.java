import pkg.*;

public class starter implements InputKeyControl {
		
		
        public static void main(String args[])
        {
			int num = Canvas.rand(1000)+1;
			EasyReader bob = new EasyReader();
			System.out.print("Please guess a number between 1-1000: ");
			while (true) 
			{
			int guess = bob.readInt();
			if (guess > num && guess < 1000)
			{
				System.out.print("Too high. Guess again: ");
			}
			if (guess < num && guess > 0)
			{
				System.out.print("Too low. Guess again: ");
			}
			if (guess==num)
			{
				System.out.print("Correct!");
				break;
			}
			if (guess > 1000 || guess < 1)
			{
				System.out.print("Please guess from 1-1000. Guess Again: ");
			}
			}
			// please leave following line alone, necessary for keyboard input
			
			// enter code here
			
		}
		public void keyPress(String s)
		{
			// enter code here
		}

}