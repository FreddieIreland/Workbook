import pkg.*;

public class starter implements InputKeyControl {
		
        public static void main(String args[])
        {
			Rectangle joe = new Rectangle(100,50,200,80);
			joe.draw();
			Text name = new Text(150,65,"Freddie");
			name.draw();
			name.grow(25,15);
			// please leave following line alone, necessary for keyboard input
			KeyController mC = new KeyController(Canvas.getInstance(),new starter());
			
			// enter code here
			
		}
		public void keyPress(String s)
		{
			// enter code here
			
		}

}
