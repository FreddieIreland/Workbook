import pkg.*;

public class starter implements InputControl {

	
static Rectangle bob = new Rectangle(100,300,80,60);
	public static void main(String args[])
        {
			bob.draw();
			bob.fill();
			bob.setColor(Color.BLUE);
			// following line is necessary for onMouseClick, don't change
			MouseController mC = new MouseController(Canvas.getInstance(),new starter());
			// put your code here:
			
		
			
		}


		public void onMouseClick(double x, double y){
			// and/or here
		bob.translate(10,0);	
	
		}
}
