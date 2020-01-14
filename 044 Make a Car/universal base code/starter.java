import pkg.*;
public class starter implements InputControl, InputKeyControl 
{
		
        public static void main(String args[])
        {
			Rectangle bg = new Rectangle(-200,-200,5000,5000);
			bg.fill();
			bg.setColor(Color.GREEN);
			// following line is necessary for onMouseClick, don't change
			MouseController mC = new MouseController(Canvas.getInstance(),new starter());
			
			// please leave following line alone, necessary for keyboard input
			KeyController kC = new KeyController(Canvas.getInstance(),new starter());
			EasyReader xVal = new EasyReader();
			System.out.print("x value: ");
			int xx = xVal.readInt();
			int po=xx;
			EasyReader yVal = new EasyReader();
			System.out.print("y val: ");
			int y3 = yVal.readInt();
			int[] joe = new int[26];
			int c=0;
			for (xx=xx;xx<(joe.length*10)+po;xx=xx+10)
			{
				joe[c]=xx;
				c=c+1;
			}
			xx=po;
			int y4=y3+10;
			int y5=y4+10;
			int y6=y5+10;
			int y7=y6+10;
			int y8=y7+10;
			int y9=y8+10;
			int y10=y9+10;
			int y11=y10+10;
			int y12=y11+10;
			int y13=y12+10;
			int y14=y13+10;
			yellow(joe[10],y3);
			cyan(joe[11],y3);
			yellow(joe[9],y4);
			red(joe[10],y4);
			blue(joe[11],y4);
			cyan(joe[12],y4);
			for (joe[6]=joe[6];joe[6]<150+xx;joe[6]=joe[6]+10)
			{
				black(joe[6],y5);
			}
			joe[6]=60+xx;
			black(joe[5],y6);
			white(joe[6],y6);
			for (joe[7]=joe[7];joe[7]<100+xx;joe[7]=joe[7]+10)
			{
				dark_gray(joe[7],y6);
			}
			joe[7]=70+xx;
			white(joe[10],y6);
			for (joe[11]=joe[11];joe[11]<140+xx;joe[11]=joe[11]+10)
			{
				dark_gray(joe[11],y6);
			}
			joe[11]=110+xx;
			white(joe[14],y6);
			black(joe[15],y6);
			black(joe[4],y7);
			white(joe[5],y7);
			for (joe[6]=joe[6];joe[6]<100+xx;joe[6]=joe[6]+10)
			{
				dark_gray(joe[6],y7);
			}
			joe[6]=60+xx;
			white(joe[10],y7);
			for (joe[11]=joe[11];joe[11]<150+xx;joe[11]=joe[11]+10)
			{
				dark_gray(joe[11],y7);
			}
			joe[11]=110+xx;
			white(joe[15],y7);
			black(joe[16],y7);
			black(joe[3],y8);
			white(joe[4],y8);
			white(joe[5],y8);
			for (joe[6]=joe[6];joe[6]<100+xx;joe[6]=joe[6]+10)
			{
				dark_gray(joe[6],y8);
			}
			joe[6]=60+xx;
			white(joe[10],y8);
			for (joe[11]=joe[11];joe[11]<160+xx;joe[11]=joe[11]+10)
			{
				dark_gray(joe[11],y8);
			}
			joe[11]=110+xx;
			white(joe[16],y8);
			for (joe[17]=joe[17];joe[17]<200+xx;joe[17]=joe[17]+10)
			{
				black(joe[17],y8);
			}
			joe[17]=170+xx;
			for (joe[1]=joe[1];joe[1]<40+xx;joe[1]=joe[1]+10)
			{
				black(joe[1],y9);
			}
			joe[1]=10+xx;
			for (joe[4]=joe[4];joe[4]<170+xx;joe[4]=joe[4]+10)
			{
				white(joe[4],y9);
			}
			joe[4]=40+xx;
			black(joe[17],y9);
			dark_gray(joe[18],y9);
			dark_gray(joe[19],y9);
			for (joe[20]=joe[20];joe[20]<240+xx;joe[20]=joe[20]+10)
			{
				black(joe[20],y9);
			}
			joe[20]=200+xx;
			black(joe[0],y10);
			dark_gray(joe[1],y10);
			dark_gray(joe[2],y10);
			black(joe[3],y10);
			black(joe[4],y10);
			for (joe[5]=joe[5];joe[5]<170+xx;joe[5]=joe[5]+10)
			{
				white(joe[5],y10);
			}
			joe[5]=50+xx;
			black(joe[17],y10);
			dark_gray(joe[18],y10);
			dark_gray(joe[19],y10);
			black(joe[20],y10);
			black(joe[21],y10);
			dark_gray(joe[22],y10);
			dark_gray(joe[23],y10);
			black(joe[24],y10);
			yellow(joe[25],y10);
			red(joe[0],y11);
			dark_gray(joe[1],y11);
			black(joe[2],y11);
			gray(joe[3],y11);
			gray(joe[4],y11);
			black(joe[5],y11);
			for (joe[6]=joe[6];joe[6]<180+xx;joe[6]=joe[6]+10)
			{
				dark_gray(joe[6],y11);
			}
			joe[6]=60+xx;
			black(joe[17],y11);
			dark_gray(joe[18],y11);
			black(joe[19],y11);
			gray(joe[20],y11);
			gray(joe[21],y11);
			black(joe[22],y11);
			dark_gray(joe[23],y11);
			dark_gray(joe[24],y11);
			red(joe[25],y11);
			black(joe[0],y12);
			black(joe[1],y12);
			for (joe[2]=joe[2];joe[2]<60+xx;joe[2]=joe[2]+10)
			{
				gray(joe[2],y12);
			}
			joe[2]=20+xx;
			for (joe[6]=joe[6];joe[6]<190+xx;joe[6]=joe[6]+10)
			{
				black(joe[6],y12);
			}
			for (joe[19]=joe[19];joe[19]<230+xx;joe[19]=joe[19]+10)
			{
				gray(joe[19],y12);
			}
			joe[19]=190+xx;
			for (joe[23]=joe[23];joe[23]<260+xx;joe[23]=joe[23]+10)
			{
				black(joe[23],y12);
			}
			for (joe[2]=joe[2];joe[2]<60+xx;joe[2]=joe[2]+10)
			{
				gray(joe[2],y13);
			}
			for (joe[19]=joe[19];joe[19]<230+xx;joe[19]=joe[19]+10)
			{
				gray(joe[19],y13);
			}
			for (joe[3]=joe[3];joe[3]<50+xx;joe[3]=joe[3]+10)
			{
				gray(joe[3],y14);
			}
			for (joe[20]=joe[20];joe[20]<220+xx;joe[20]=joe[20]+10)
			{
				gray(joe[20],y14);
			}
			//white.translate(5,0);
			
				
		}
		public static void black(int x, int y) {
			Rectangle black = new Rectangle(x,y,10,10);
			black.fill();
		}
		public static void white(int x, int y) {
			Rectangle white = new Rectangle(x,y,10,10);
			white.fill();
			white.setColor(Color.WHITE);
		}
		public static void blue(int x, int y) {
			Rectangle blue = new Rectangle(x,y,10,10);
			blue.fill();
			blue.setColor(Color.BLUE);
		}
		public static void red(int x, int y) {
			Rectangle red = new Rectangle(x,y,10,10);
			red.fill();
			red.setColor(Color.RED);
		}
		public static void yellow(int x, int y) {
			Rectangle yellow = new Rectangle(x,y,10,10);
			yellow.fill();
			yellow.setColor(Color.YELLOW);
		}
		public static void gray(int x, int y) {
			Rectangle gray = new Rectangle(x,y,10,10);
			gray.fill();
			gray.setColor(Color.GRAY);
		}
		public static void dark_gray(int x, int y) {
			Rectangle dark_gray = new Rectangle(x,y,10,10);
			dark_gray.fill();
			dark_gray.setColor(Color.DARK_GRAY);
		}
		public static void cyan(int x, int y) {
			Rectangle cyan = new Rectangle(x,y,10,10);
			cyan.fill();
			cyan.setColor(Color.CYAN);
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
