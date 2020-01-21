import pkg.*;
public class Pal 
{
	private Jumbler ww;
	private String w[];
	private int counter=0;
	private int counter2=0;
	private EasyReader henri;
	private EasyReader henri2;
	private String susie="";
	private String bob="";
	private int counter3=0;
	private int counter4=0;
	public Pal(String fname)
	{
		henri = new EasyReader(fname);
		while (!henri.eof())
		{
			henri.readLine();
			counter4++;
		}
		w=new String[counter4];
		henri2 = new EasyReader(fname);
		while (!henri2.eof())
		{
			w[counter]=henri2.readLine();
			counter++;
		}
		ww=new Jumbler(w);
		w=ww.mixedWords(w);
	}
	private void printWords(String[] s)
	{
		
	}
	public boolean isPal(String word) 
	{
			for (int e=0;e<word.length();e++)
			{
				susie=word.substring(word.length()-e-1,word.length()-e);
				bob=bob+susie;
			}
			
			if (bob.equals(word))
			{
				bob="";
				susie="";
				return true;
			}
		bob="";
		susie="";
		return false;
		
	}
	public int howManyPals()
	{
		for (int i=0;i<w.length;i++)
		{
			if (isPal(w[i]))
			{
				counter2++;
			}
		}
		return counter2;
	}	
}

// C:\Users\FIRE1080\Desktop\palindrome part 2 warm up>java -cp .; starter
// please enter a file name: words.txt
// There were 95 palindromes in the file.

// C:\Users\FIRE1080\Desktop\palindrome part 2 warm up>pause
// Press any key to continue . . .
