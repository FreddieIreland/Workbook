import pkg.*;
public class starter implements InputControl, InputKeyControl 
{
		
static int bob;
static Rectangle sue[]; 
        public static void main(String args[])
        {
		
			// following line is necessary for onMouseClick, don't change
			MouseController mC = new MouseController(Canvas.getInstance(),new starter());
			
			// please leave following line alone, necessary for keyboard input
			KeyController kC = new KeyController(Canvas.getInstance(),new starter());
			EasyReader joe = new EasyReader();
			System.out.print("How many boxes do you want? ");
			bob=joe.readInt();
			sue = new Rectangle[bob];
			makeBoxes(bob);

		}
		public static void makeBoxes(int alf) {
			for (int i=0;i<alf;i++)
			{
				Color col = new Color(Canvas.rand(256),Canvas.rand(256),Canvas.rand(256));
				sue[i]=new Rectangle(Canvas.rand(500),Canvas.rand(500),50,100);
				sue[i].fill();
				sue[i].setColor(col);
			}
				
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
