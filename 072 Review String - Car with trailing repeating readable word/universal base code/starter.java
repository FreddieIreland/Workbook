import pkg.*;
public class starter implements InputControl, InputKeyControl 
{
		

        public static void main(String args[])
        {
		
			// following line is necessary for onMouseClick, don't change
			MouseController mC = new MouseController(Canvas.getInstance(),new starter());
			
			// please leave following line alone, necessary for keyboard input
			KeyController kC = new KeyController(Canvas.getInstance(),new starter());
			EasyReader joe = new EasyReader();
			int x=0;
			int counter=0;
			System.out.print("Please enter a word: ");
			String sue = joe.readWord();
			Car aditya = new Car(0,10,"aditya",Color.BLUE);
			aditya.draw();
			Text gas = new Text(x,aditya.getHeight()/2,sue);
			int len = gas.getWidth();
			System.out.print(len);
			while (true)
			{
				aditya.translate(1,0);
				Canvas.pause(15);
				if (counter%len==0)
				{
					gas = new Text(x,aditya.getHeight()/2,sue);
					gas.draw();
					x+=len;
				}
				counter++;
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
