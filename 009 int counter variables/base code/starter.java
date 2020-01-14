import pkg.*;

public class starter implements InputControl {

static Rectangle joe = new Rectangle(100,200,60,35);
int bob=5;
int num=0;
String joey="";
static Text click = new Text(50,50,"You have clicked 0 times");
	public static void main(String args[])
        {
			joe.draw();
			joe.fill();
			joe.setColor(Color.GREEN);
			click.draw();
			// following line is necessary for onMouseClick, don't change
			MouseController mC = new MouseController(Canvas.getInstance(),new starter());
			// put your code here:
			
		
			
		}


		public void onMouseClick(double x, double y){
			// and/or here
			joe.translate(bob,0);
			num=num+1;
			click.setText("You have clicked "+num+" times"+joey);
			if (num==10)
			{
				bob=0;
				joey = ", but now it won't move!";
			}

	
		}
}
