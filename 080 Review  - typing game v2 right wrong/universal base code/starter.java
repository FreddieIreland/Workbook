import pkg.*;
public class starter implements InputControl, InputKeyControl 
{
	static String sentence;
	static Text uzer;
	static String check;
	static int why;
        public static void main(String args[])
        {
		
			// following line is necessary for onMouseClick, don't change
			MouseController mC = new MouseController(Canvas.getInstance(),new starter());
			// please leave following line alone, necessary for keyboard input
			KeyController kC = new KeyController(Canvas.getInstance(),new starter());
			sentence = "i like beaches and donuts.";
			System.out.print("Your sentence: "+sentence);
			check="";
			why=100;
		}
		public void onMouseClick(double x, double y){
			// and/or here
	
		}
int c=0;
int x=25;
int yy=100;
		public void keyPress(String s)
		{
			check=check+s;
			Text lets = new Text(x,yy,s);
			lets.draw();
			x=x+lets.getWidth();
			//uzer.setText(check);
			// temp holds the enter character
			char done = (char)10;
			String temp = Character.toString(done);
			if (s.equals(temp))
			{
				evaluateInput(sentence,check);
				yy=yy+15;
				x=25;
			}
			
		}
		public static Text evaluateInput(String ans, String user)
		{
			int ex=250;
			Text joe = new Text(ex,why,"");
			joe.draw();
			for (int i=0;i<ans.length();i++)
			{
				if (ans.substring(i,i+1).equals(user.substring(i,i+1)))
				{
					joe.setText("Congratulations! You typed this sentence correctly!");
				}
				else
				{
					joe.setText("Sorry, you typed this sentence incorrectly!");
					break;
				}
			}
		why=why+15;
		check="";
		return joe;
		}
}

