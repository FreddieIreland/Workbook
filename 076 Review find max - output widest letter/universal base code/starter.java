import pkg.*;
public class starter implements InputControl, InputKeyControl 
{
		

        public static void main(String args[])
        {
		
			// following line is necessary for onMouseClick, don't change
			MouseController mC = new MouseController(Canvas.getInstance(),new starter());
			// please leave following line alone, necessary for keyboard input
			KeyController kC = new KeyController(Canvas.getInstance(),new starter());
			int max=0;
			String high="";
			EasyReader joe = new EasyReader();
			System.out.print("Please enter a word: ");
			String sue = joe.readWord();
			Text store[] = new Text[sue.length()];
			for (int i=0;i<sue.length();i++)
			{
				store[i]=new Text(0,0,""+sue.substring(i,i+1));
			}
			for (int i=0;i<sue.length();i++)
			{
				int rob = store[i].getWidth();
				if (rob > max)
				{
					max=rob;
					high=sue.substring(i,i+1);
				}
				System.out.println(sue.substring(i,i+1)+" "+rob);
			}	
			System.out.print("The widest letter is "+high+" and its width is "+max+".");
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

// C:\Users\FIRE1080\Desktop\workbook\076 Review find max - output widest letter\universal base code>java -cp .; starter
// Key Started
// Please enter a word: laundromat
// l 3
// a 7
// u 7
// n 7
// d 7
// r 5
// o 7
// m 11
// a 7
// t 4
// The widest letter is m and its width is 11.
