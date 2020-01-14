import pkg.*;
public class starter implements InputControl, InputKeyControl 
{
		

        public static void main(String args[])
        {
		
			// following line is necessary for onMouseClick, don't change
			MouseController mC = new MouseController(Canvas.getInstance(),new starter());
			
			// please leave following line alone, necessary for keyboard input
			KeyController kC = new KeyController(Canvas.getInstance(),new starter());
			int num=50;
			int max=0;
			int rob=0;
			int arnold[] = new int[50];
			Rectangle joe[] = new Rectangle[num];
			Text sue[] = new Text[num];
			int count=0;
			for (int i=0;i<joe.length;i++)
			{
				int x=Canvas.rand(500);
				arnold[i]=Canvas.rand(500);
				Color bob = new Color(Canvas.rand(256),Canvas.rand(256),Canvas.rand(256));
				joe[i]=new Rectangle(x,arnold[i],50,100);
				joe[i].fill();
				joe[i].setColor(bob);
				sue[i]=new Text(x+15,arnold[i]+10,""+i);
				sue[i].draw();
				sue[i].grow(12,8);
				System.out.println("arrayList "+i+" y-val: "+arnold[i]);
			}
			while (count<joe.length)
			{
				if (arnold[count]>max)
				{
					max=arnold[count];
					rob=count;
				}
				count=count+1;
			}
			System.out.println(max);
			while (true)
			{
				joe[rob].translate(1,0);
				sue[rob].translate(1,0);
				Canvas.pause(10);
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
