import pkg.*;

public class starter implements InputKeyControl {
		
		
        public static void main(String args[])
        {
			Rectangle joe = new Rectangle(50,100,30,65);
			joe.draw();
			while (true)
			{
				joe.translate(1,0);
				Canvas.pause(10);
			}
			// please leave following line alone, necessary for keyboard input
			//KeyController mC = new KeyController(Canvas.getInstance(),new starter());
			
			// enter code here
			
		}
		public void keyPress(String s)
		{
			// enter code here
			
		}

}
