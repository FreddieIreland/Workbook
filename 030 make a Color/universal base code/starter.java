import pkg.*;
public class starter implements InputControl, InputKeyControl 
{
		

        public static void main(String args[])
        {
			int r=Canvas.rand(256);
			int g=Canvas.rand(256);
			int b=Canvas.rand(256);
			Color joe = new Color(r,g,b);
			Rectangle sue = new Rectangle(20,20,300,300);
			sue.setColor(joe);
			sue.fill();
			Text val = new Text(150,150,"("+r+","+g+","+b+")");
			val.draw();
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
