import pkg.*;
public class starter implements InputControl, InputKeyControl 
{
		

        public static void main(String args[])
        {
		
			// following line is necessary for onMouseClick, don't change
			MouseController mC = new MouseController(Canvas.getInstance(),new starter());
			
			// please leave following line alone, necessary for keyboard input
			KeyController kC = new KeyController(Canvas.getInstance(),new starter());
			double joe[] = new double[7];
			double min=10;
			double max=0;
			double total=0;
			System.out.println("Athlete's Scores:");
			for (int i=0;i<7;i++)
			{
				joe[i]=Math.random()*10;
				System.out.println("#"+(i+1)+" "+joe[i]);
				if (joe[i] > max)
				{
					max=joe[i];
				}
				if (joe[i] < min)
				{
					min=joe[i];
				}
			}
			System.out.println("\n"+"Highest Score: "+max+" "+"Lowest Score: "+min);
			System.out.println("\n"+"New Scores: ");
			for (int i=0;i<7;i++)
			{
				if (joe[i] < max && joe[i] > min)
				{
					System.out.println("#"+(i+1)+" "+joe[i]);
					total=total+joe[i];
					
				}					
			}
			System.out.println("\n"+"Final Score: "+total/5);
			
			
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

// C:\Users\Freddie\Desktop\AP Comp Science\HW #9 - Olympics\universal base code>java -cp .; starter
// Key Started
// Athlete's Scores:
// #1 3.2927023333455963
// #2 9.858400757235726
// #3 7.76422968502413
// #4 9.633949776653369
// #5 3.7181090610281666
// #6 6.333877291950883
// #7 9.418383507009333

// Highest Score: 9.858400757235726 Lowest Score: 3.2927023333455963

// New Scores:
// #3 7.76422968502413
// #4 9.633949776653369
// #5 3.7181090610281666
// #6 6.333877291950883
// #7 9.418383507009333

// Final Score: 7.373709864333176
