import pkg.*;
public class starter implements InputControl, InputKeyControl 
{
		

        public static void main(String args[])
        {
		
			// following line is necessary for onMouseClick, don't change
			MouseController mC = new MouseController(Canvas.getInstance(),new starter());
			
			// please leave following line alone, necessary for keyboard input
			KeyController kC = new KeyController(Canvas.getInstance(),new starter());
			EasyReader sue = new EasyReader();
			System.out.print("Enter a word RIGHT NOW: ");
			String sue_in=sue.readWord();
			Rectangle joe = new Rectangle(200,200,100,200);
			joe.draw();
			Text fake = new Text(0,0,sue_in);
			int gw=fake.getWidth();
			int gh=fake.getHeight();
			Text real = new Text((joe.getX()*2+joe.getWidth())/2-(gw/2),(joe.getY()*2+joe.getHeight())/2-gh,sue_in);
			real.draw();
			
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
