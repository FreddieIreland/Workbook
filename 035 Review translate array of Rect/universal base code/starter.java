import pkg.*;
public class starter implements InputControl, InputKeyControl 
{
		
static Rectangle[] joe;
        public static void main(String args[])
        {
			joe = new Rectangle[100];
			for (int i=0;i<joe.length;i++)
			{
				Color sue = new Color(Canvas.rand(256),Canvas.rand(256),Canvas.rand(256));
				int x=Canvas.rand(500);
				int y=Canvas.rand(500);
				joe[i]=new Rectangle(x,y,50,100);
				joe[i].fill();
				joe[i].setColor(sue);
			}
		
			// following line is necessary for onMouseClick, don't change
			MouseController mC = new MouseController(Canvas.getInstance(),new starter());
			
			// please leave following line alone, necessary for keyboard input
			KeyController kC = new KeyController(Canvas.getInstance(),new starter());
			
			
		}
		
		public void onMouseClick(double x, double y){
			// and/or here
			for (int i=0;i<joe.length;i++)
			{
				joe[i].translate(5,0);
			}
	
		}
		
		public void keyPress(String s)
		{
			// temp holds the enter character
			
			char done = (char)10;
			String temp = Character.toString(done);
			
		}
}
