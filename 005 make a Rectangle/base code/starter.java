import pkg.*;

public class starter implements InputControl {

	

	public static void main(String args[])
        {
			Rectangle gang = new Rectangle(100,200,65,55);
			gang.draw();
			// following line is necessary for onMouseClick, don't change
			MouseController mC = new MouseController(Canvas.getInstance(),new starter());
			// put your code here:
			
		
			
		}


		public void onMouseClick(double x, double y){
			// and/or here
			
	
		}
}
