import pkg.*;
public class starter implements InputControl, InputKeyControl 
{
		

        public static void main(String args[])
        {
		Rectangle joe = new Rectangle(100,50,200,80);
		joe.draw();
		Text name = new Text(150,65,"Fredrick III of Bohemia");
		name.draw();
		name.grow(25,15);
		while (true)
		{
			joe.translate(1,0);
			name.translate(1,0);
			Canvas.pause(15);
			if (joe.getX() > 350)
			{
				break;
			}
		}
			// following line is necessary for onMouseClick, don't change
			//MouseController mC = new MouseController(Canvas.getInstance(),new starter());
			
			// please leave following line alone, necessary for keyboard input
			//KeyController kC = new KeyController(Canvas.getInstance(),new starter());
			
			
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
