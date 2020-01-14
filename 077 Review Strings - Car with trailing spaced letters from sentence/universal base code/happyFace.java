import pkg.*;
public class happyFace
{
	private Ellipse face;
	private Ellipse border;
	private Ellipse eye1;
	private Ellipse eye2;
	private Ellipse dot1;
	private Ellipse dot2;
	private Line nose1;
	private Line nose2;
	private Ellipse mouth;
	private Rectangle cover;
	private Line eyebrow1;
	private Line eyebrow2;
	private Car c;
	private Text end;
	public happyFace(double xx, double yy)
	{
		face = new Ellipse(xx,yy,100,100);
		face.setColor(Color.YELLOW);
		border = new Ellipse(xx,yy,100,100);
		eye1 = new Ellipse(xx+25,yy+25,15,15);
		eye1.setColor(Color.WHITE);
		eye2 = new Ellipse(xx+60,yy+25,15,15);
		eye2.setColor(Color.WHITE);
		dot1 = new Ellipse(xx+28,yy+27,10,10);
		dot1.setColor(Color.BLACK);
		dot2 = new Ellipse(xx+63,yy+27,10,10);
		dot2.setColor(Color.BLACK);
		nose1 = new Line(xx+50,yy+40,xx+35,yy+55);
		nose2 = new Line(xx+35,yy+55,xx+55,yy+55);
		mouth = new Ellipse(xx+33,yy+57,30,25);
		cover = new Rectangle(xx+30,yy+57,35,15);
		cover.setColor(Color.YELLOW);
		eyebrow1 = new Line(xx+27,yy+22,xx+38,yy+22);
		eyebrow2 = new Line(xx+62,yy+22,xx+73,yy+22);
		end = new Text(270,210,"Game over!");
		end.grow(50,20);
		
	}
	public void fill()
	{
		face.fill();
		border.draw();
		eye1.fill();
		eye2.fill();
		dot1.fill();
		dot2.fill();
		nose1.draw();
		nose2.draw();
		mouth.draw();
		cover.fill();
		eyebrow1.draw();
		eyebrow2.draw();
		
	}
	public void translate(double xx, double yy)
	{
		face.translate(xx,yy);
		border.translate(xx,yy);
		eye1.translate(xx,yy);
		eye2.translate(xx,yy);
		dot1.translate(xx,yy);
		dot2.translate(xx,yy);
		nose1.translate(xx,yy);
		nose2.translate(xx,yy);
		mouth.translate(xx,yy);
		cover.translate(xx,yy);
		eyebrow1.translate(xx,yy);
		eyebrow2.translate(xx,yy);
	}
	public int getX()
	{
		return face.getX();
	}
	public int getY()
	{
		return face.getY();
	}
	public int getWidth()
	{
		return face.getWidth();
	}
	public int getHeight()
	{
		return face.getHeight();
	}
	public boolean win()
	{
		if (face.getY() < 10)
		{
			return true;
		}
		return false;
	}
	public boolean crash (Car c)
	{
		if (face.contains(c.getBoundBox()))
		{
			System.out.println("Crash! Game over!");
			end.draw();
			return true;
		}
		return false;
	}
}