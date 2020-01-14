import pkg.*;
public class starter implements InputControl, InputKeyControl 
{
		
static String check;
static int why;
static int bob;
static String sue;
        public static void main(String args[])
        {
		
			// following line is necessary for onMouseClick, don't change
			MouseController mC = new MouseController(Canvas.getInstance(),new starter());
			// please leave following line alone, necessary for keyboard input
			KeyController kC = new KeyController(Canvas.getInstance(),new starter());
			int x=0;
			int counter=0;
			check="";
			why=100;
			bob=0;
			int ran = (int)(Math.random())*100;
			EasyReader joe = new EasyReader("henri2.txt");
			String susie[] = new String[1000];
			while (!joe.eof())
			{
				susie[counter] = joe.readLine();
				counter++;
			}
			sue = new String(susie[Canvas.rand(counter)]);
			Text store[] = new Text[sue.length()];
			int rob[] = new int[sue.length()];
			for (int i=0;i<sue.length();i++)
			{
				store[i]=new Text(0,0,""+sue.substring(i,i+1));
				rob[i]=store[i].getWidth();
			}
			Car aditya = new Car(0,10,"aditya",Color.BLUE);
			aditya.draw();
			Text gas = new Text(x,aditya.getHeight()/2,sue);
			for (int i=0;i<sue.length();i++)
			{
				for (int e=0;e<rob[i];e++)
				{
					aditya.translate(1,0);
					Canvas.pause(10);
					if (e%rob[i]==0)
					{
						gas = new Text(x,aditya.getHeight()/2,sue.substring(i,i+1));
						gas.draw();
						x+=rob[i];
					}
				}
			}
			
		}
		public void onMouseClick(double x, double y){
			// and/or here
	
		}
int xx=0;
int yy=120;		
		public void keyPress(String s)
		{
			check=check+s;
			Text lets = new Text(xx,yy,s);
			lets.draw();
			xx=xx+lets.getWidth();
			// temp holds the enter character
			
			char done = (char)10;
			String temp = Character.toString(done);
			if (s.equals(temp))
			{
				evaluateInput(sue,check);
				yy=yy+15;
				xx=0;
			}
			
		}
			public static int indexError(String key, String type)
		{
			int counterbob=-1;
			for (int i=0;i<key.length();i++)
			{
				counterbob++;
				if (!key.substring(i,i+1).equals(type.substring(i,i+1)))
					break;
			}
			return counterbob;
		}
		public static Text evaluateInput(String ans, String user)
		{
			int ex=300;
			Text joseph = new Text(ex,why,"");
			joseph.draw();
			for (int i=0;i<ans.length();i++)
			{
				if (ans.substring(i,i+1).equals(user.substring(i,i+1)))
				{
					bob=0;
					joseph.setText("Congratulations! You typed this sentence correctly!");
				}
				else
				{
					bob=1;
					joseph.setText("Sorry, you typed this sentence incorrectly!");
					break;
				}
			}
			if (bob==1)
			{
				System.out.println("The first index error is: "+indexError(sue,check));
			}
			else if (bob==0)
				System.out.println("You had no errors!");
		why=why+15;
		check="";
		return joseph;
		}
}

