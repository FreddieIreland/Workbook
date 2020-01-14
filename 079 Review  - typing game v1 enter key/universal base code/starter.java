import pkg.*;
public class starter implements InputControl, InputKeyControl 
{
        public static void main(String args[])
        {
		
			// following line is necessary for onMouseClick, don't change
			MouseController mC = new MouseController(Canvas.getInstance(),new starter());
			// please leave following line alone, necessary for keyboard input
			KeyController kC = new KeyController(Canvas.getInstance(),new starter());
			// int x=0;
			// EasyReader joe = new EasyReader();
			// System.out.print("Please enter a sentence: ");
			// String sue = joe.readLine();
			// Text store[] = new Text[sue.length()];
			// int rob[] = new int[sue.length()];
			// for (int i=0;i<sue.length();i++)
			// {
				// store[i]=new Text(0,0,""+sue.substring(i,i+1));
				// rob[i]=store[i].getWidth();
			// }
			// Car aditya = new Car(0,10,"aditya",Color.BLUE);
			// aditya.draw();
			// Text gas = new Text(x,aditya.getHeight()/2,sue);
			// for (int i=0;i<sue.length();i++)
			// {
				// for (int e=0;e<rob[i];e++)
				// {
					// aditya.translate(1,0);
					// Canvas.pause(15);
					// if (e%rob[i]==0)
					// {
						// gas = new Text(x,aditya.getHeight()/2,sue.substring(i,i+1));
						// gas.draw();
						// x+=rob[i];
					// }
				// }
			// }
			
			
		}
		public void onMouseClick(double x, double y){
			// and/or here
	
		}
int c=0;
int x=0;
		public void keyPress(String s)
		{
			Text lets = new Text(x,100,s);
			lets.draw();
			x=x+lets.getWidth();
			// temp holds the enter character
			char done = (char)10;
			String temp = Character.toString(done);
			if (s.equals(temp))
			{
				c++;
				System.out.println("Total Typing Attempts: "+c);
			}
			
		}
}

