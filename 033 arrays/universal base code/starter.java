import pkg.*;
public class starter implements InputControl, InputKeyControl 
{
		

        public static void main(String args[])
        {
			Rectangle[] joe = new Rectangle[100];
			for (int i=0;i<joe.length;i++)
			{
				int x=Canvas.rand(500);
				int y=Canvas.rand(500);
				joe[i]=new Rectangle(x,y,50,100);
				joe[i].draw();
			}
		
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
