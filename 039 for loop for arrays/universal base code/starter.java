import pkg.*;
public class starter implements InputControl, InputKeyControl 
{
		

        public static void main(String args[])
        {
		
			// following line is necessary for onMouseClick, don't change
			MouseController mC = new MouseController(Canvas.getInstance(),new starter());
			
			// please leave following line alone, necessary for keyboard input
			KeyController kC = new KeyController(Canvas.getInstance(),new starter());
			Rectangle joe[] = new Rectangle[10];
			for (int i=0;i<joe.length;i++)
			{
				int x=Canvas.rand(500);
				int y=Canvas.rand(500);
				Color bob = new Color(Canvas.rand(256),Canvas.rand(256),Canvas.rand(256));
				joe[i]=new Rectangle(x,y,50,100);
				joe[i].fill();
				joe[i].setColor(bob);
				System.out.println("arrayList "+i+" y-val: "+y);
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
