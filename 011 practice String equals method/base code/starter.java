import pkg.*;

public class starter implements InputKeyControl {
		
		static Rectangle joe = new Rectangle(100,250,100,80);
        public static void main(String args[])
        {
			joe.draw();
			// please leave following line alone, necessary for keyboard input
			KeyController mC = new KeyController(Canvas.getInstance(),new starter());
			
			// enter code here
			
		}
String sue = "d";
String mary = "a";
		public void keyPress(String s)
		{
			if (sue.equals(s)) 
			{
				joe.translate(5,0);
			}
			if (mary.equals(s)) 
			{
				joe.translate(-5,0);
			}
			// enter code here
			// note, s is the String representation of the key pressed
		}

}
