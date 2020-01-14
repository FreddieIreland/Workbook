import pkg.*;
public class starter implements InputControl, InputKeyControl 
{
		

        public static void main(String args[])
        {
		int joe[] = new int[10];
		Rectangle bob[] = new Rectangle[10];
		int count=0;
		int max=0;
		int rob=0;
		while (count<joe.length)
		{
			int x = Canvas.rand(500);
			Color sue = new Color(Canvas.rand(256),Canvas.rand(256),Canvas.rand(256));
			joe[count]=Canvas.rand(500);
			System.out.println(joe[count]+" "+count);
			bob[count]=new Rectangle(x,joe[count],50,100);
			bob[count].fill();
			bob[count].setColor(sue);
			count=count+1;
		}
		count=0;
		while (count<joe.length)
		{
			if (joe[count] > max)
			{
				max=joe[count];
				rob=count;
			}
			count=count+1;
		}
		System.out.println("The biggest y-value is: "+max);
		System.out.println("This is arrayIndex number: "+rob);
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
