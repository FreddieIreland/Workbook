import pkg.*;
public class starter implements InputControl, InputKeyControl 
{
		

        public static void main(String args[])
        {
		
			// following line is necessary for onMouseClick, don't change
			MouseController mC = new MouseController(Canvas.getInstance(),new starter());
			
			// please leave following line alone, necessary for keyboard input
			KeyController kC = new KeyController(Canvas.getInstance(),new starter());
			Rectangle bg = new Rectangle(-50,-50,1000,1000);
			bg.setColor(Color.GREEN);
			bg.fill();
			Car henri = new Car(50.0,90.0);
			henri.draw();
			while (true)
			{
				henri.translate(1,0);
				Canvas.pause(15);
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
