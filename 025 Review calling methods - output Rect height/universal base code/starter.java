import pkg.*;
public class starter implements InputControl, InputKeyControl 
{
		

        public static void main(String args[])
        {
			int x = Canvas.rand(250);
			int y = Canvas.rand(250);
			int l = Canvas.rand(250);
			int w = Canvas.rand(250);
			Rectangle joe = new Rectangle(x,y,l,w);
			joe.draw();
			int bob = joe.getHeight();
			System.out.println("The height of the rectangle is: "+bob);
			// following line is necessary for onMouseClick, don't change
			MouseController mC = new MouseController(Canvas.getInstance(),new starter());
			
			// please leave following line alone, necessary for keyboard input
			KeyController kC = new KeyController(Canvas.getInstance(),new starter());
			
			
		}
		
		public void onMouseClick(double x, double y){
			// and/or here
	
		}
		
		public void keyPress(String s)
		{
			// temp holds the enter character
			
			char done = (char)10;
			String temp = Character.toString(done);
			
		}
}
