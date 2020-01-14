import pkg.*;

public class starter implements InputKeyControl {
		
		
        public static void main(String args[])
        {
			// please leave following line alone, necessary for keyboard input
			KeyController mC = new KeyController(Canvas.getInstance(),new starter());
			
			// enter code here
		
			
		}
String mary = "r";
		public void keyPress(String s)
		{
			// enter code here
			if(mary.equals(s))
			{
				System.out.println(Canvas.rand(10));
			}
		}

}
