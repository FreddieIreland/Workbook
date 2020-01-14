import pkg.*;
public class starter implements InputControl, InputKeyControl 
{
		
static Text name = new Text(150,65,"Freddie");
static Rectangle joe = new Rectangle(100,50,200,80);

        public static void main(String args[])
        {
			joe.draw();
			name.draw();
			// following line is necessary for onMouseClick, don't change
			MouseController mC = new MouseController(Canvas.getInstance(),new starter());
			
			// please leave following line alone, necessary for keyboard input
			KeyController kC = new KeyController(Canvas.getInstance(),new starter());
			
			
		}
		
		public void onMouseClick(double x, double y){
			// and/or here
	
		}
String suew = "w";
String suea = "a";
String sues = "s";
String sued = "d";
		public void keyPress(String s)
		{
			// temp holds the enter character
			if (suew.equals(s)) 
			{
				joe.translate(0,-5);
				name.translate(0,-5);
			}
			if (suea.equals(s)) 
			{
				joe.translate(-5,0);
				name.translate(-5,0);
			}
			if (sues.equals(s)) 
			{
				joe.translate(0,5);
				name.translate(0,5);
			}
			if (sued.equals(s)) 
			{
				joe.translate(5,0);
				name.translate(5,0);
			}
			char done = (char)10;
			String temp = Character.toString(done);
			
		}
}
