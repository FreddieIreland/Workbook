import pkg.*;
public class starter implements InputControl, InputKeyControl 
{
		

        public static void main(String args[])
        {
		int y=Canvas.rand(5);
		System.out.print("The rectangle is on road #"+(y+1));
		int y2=100;
		Rectangle joe = new Rectangle(0,(y*100)+5,50,90);
		joe.draw();
		joe.setColor(Color.YELLOW);
		joe.fill();
		Text name = new Text(5,(y*100)+5,"Aditya");
		name.draw();
		for (int i=0;i<5;i++)
		{
			Line road = new Line(0,y2,1000,y2);
			road.draw();
			y2=y2+100;
		}
		while (true)
		{
			joe.translate(1,0);
			name.translate(1,0);
			Canvas.pause(3);
			if (joe.getX() > 650)
			{
				joe.translate(-715,0);
				name.translate(-715,0);
			}
		}
			// following line is necessary for onMouseClick, don't change
			//MouseController mC = new MouseController(Canvas.getInstance(),new starter());
			
			// please leave following line alone, necessary for keyboard input
			//KeyController kC = new KeyController(Canvas.getInstance(),new starter());
			
			
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
