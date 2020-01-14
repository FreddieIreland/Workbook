import pkg.*;
public class starter implements InputControl, InputKeyControl 
{
		

        public static void main(String args[])
        {
		Rectangle[] joe = new Rectangle[5];
		Text[] bob = new Text[5];
		String[] uu = {"Bob","Joe","Aditya","Henri","Fred"};
		int uuu=0;
		for (int i=0;i<joe.length;i++)
		{
			int x=Canvas.rand(250);
			int y=Canvas.rand(500);
			Color col = new Color(Canvas.rand(256),Canvas.rand(256),Canvas.rand(256));
			System.out.println("The height of "+uu[uuu]+" is: "+y);
			joe[i]=new Rectangle(x,y,50,100);
			joe[i].fill();
			joe[i].setColor(col);
			bob[i]=new Text(x,y,uu[uuu]);
			bob[i].draw();
			uuu=uuu+1;
		}
		
			// following line is necessary for onMouseClick, don't change
			MouseController mC = new MouseController(Canvas.getInstance(),new starter());
			
			// please leave following line alone, necessary for keyboard input
			KeyController kC = new KeyController(Canvas.getInstance(),new starter());
		while (true)
		{
			for (int d=0;d<joe.length;d++)
			{
				joe[d].translate(1,0);
				bob[d].translate(1,0);
				Canvas.pause(1);
				if (joe[d].getX() > 700)
				{
					joe[d].translate(-745,0);
					bob[d].translate(-745,0);
				}
			}
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
