import pkg.*;
public class Car  
{
		private static Rectangle base; 
		private static Rectangle top;
		private static Ellipse w1;
		private static Ellipse w2;
		private static int l=200;
		private static int w=50;
		private static int b=30;
	public Car (double ex, double why)
	{
		base=new Rectangle(ex,why,l,w);
		base.setColor(Color.DARK_GRAY);
		w1=new Ellipse(ex+40,why+30,b,b);
		w1.setColor(Color.BLACK);
		w2=new Ellipse(ex+120,why+30,b,b);
		w2.setColor(Color.BLACK);
		top=new Rectangle(ex+40,why-30,l-90,w);
		top.setColor(Color.DARK_GRAY);
	}
	public void draw()
	{
		base.fill();
		w1.fill();
		w2.fill();
		top.fill();
	}
	public void translate(double ex, double why)
	{
		base.translate(ex,why);
		w1.translate(ex,why);
		w2.translate(ex,why);
		top.translate(ex,why);
		
	}
}
	