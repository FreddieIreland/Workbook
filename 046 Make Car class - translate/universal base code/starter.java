import pkg.*;
public class starter implements InputControl, InputKeyControl 
{
		
static Car henri;
static Car joey[];
static happyFace me;
static Text begin;
static Text victory;
static Rectangle begin2;
static int louis=0;
        public static void main(String args[])
        {
			// following line is necessary for onMouseClick, don't change
			MouseController mC = new MouseController(Canvas.getInstance(),new starter());
			
			// please leave following line alone, necessary for keyboard input
			KeyController kC = new KeyController(Canvas.getInstance(),new starter());
			Rectangle bg = new Rectangle(-50,-50,3000,3000);
			bg.setColor(Color.GRAY);
			bg.fill();
			makeRoads(5);
			me = new happyFace(250,500);
			me.fill();
			begin2 = new Rectangle(-50,-50,3000,3000);
			begin2.setColor(Color.GREEN);
			begin2.fill();
			begin = new Text(235,200,"Press the g key to play!");
			begin.draw();
			begin.grow(75,30);
			victory = new Text(255,210,"You win!");
			victory.grow(75,30);
			String henri[] = {"henri","freddie","aditya","rowan","hochan","edward","ethan","tobey","rohan","peter","nikitas"};
			joey = new Car[10];
			int bob=1;
			for (int ii=0;ii<joey.length;ii++)
			{
				Color rand = new Color(Canvas.rand(256),Canvas.rand(256),Canvas.rand(256));
				joey[ii]=new Car((Canvas.rand(1000)*-1)-100,Canvas.rand(5)*125+7.5,henri[ii],rand);
				joey[ii].draw();
			}
			while (bob==1)
			{
				for (int i=0;i<joey.length;i++)
				{
					if (bob==1){
					joey[i].translate(joey[i].getStep(),0);
					joey[i].drive();
					joey[i].bound();
					Canvas.pause(1);
					if (me.crash(joey[i]))
					{
						bob=2;
					}
					if (me.win())
					{
						victory.draw();
						bob=2;
						louis=2;
					}
					}
				}
			
			}
		}
		public static void makeRoads(int j)
		{
			double y=0.0;
			int xy=75;
			for (int i=0;i<j;i++)
			{
				Line joe = new Line(0,y,2000,y);
				joe.draw();
				for (int k=0;k<j;k++)
				{
					Rectangle bob = new Rectangle(xy,y+125-65,20,10);
					bob.setColor(Color.YELLOW);
					bob.fill();
					xy=xy+100;
				}
				xy=75;
				y=y+125;
			}
		}
		
		
		public void onMouseClick(double x, double y){
			// and/or here
	
		}
int ss=1;
int ht=7;
		public void keyPress(String s)
		{
			
			if (s.equals("g"))
			{
				ss=2;
				begin.setText("");
				begin2.translate(1000,0);
				louis=1;
				//henri.setStep(1);
				//joey[i].setStep(1);
			}
			if (louis==1)
			{
			if (s.equals("h"))
			{
				ss=0;
				//henri.setStep(0);
				//joey[i].setStep(0);
			}
			if (s.equals("u"))
			{
				ss++;
				//henri.setStep(ss);
				//joey[i].setStep(ss);
			}
			if (s.equals("i"))
			{
				ss=ss-1;
				//henri.setStep(ss);
				//joey[i].setStep(ss);
			}
			if (s.equals("w"))
			{
				me.translate(0,-ht);
			}
			if (s.equals("a"))
			{
				me.translate(-ht,0);
			}
			if (s.equals("s"))
			{
				me.translate(0,ht);
			}
			if (s.equals("d"))
			{
				me.translate(ht,0);
			}
			
				for (int i=0;i<joey.length;i++)
				{
					joey[i].setStep(ss);
				}
			}
			char done = (char)10;
			String temp = Character.toString(done);
			
		}
}
