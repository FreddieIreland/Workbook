import pkg.*;
public class Jumbler { 
	private String[] jumble;
	
	public Jumbler(String[] temp)
	{
		jumble=mixedWords(temp);
	}
	
	private String recombine(String word1, String word2)
	{
		String sue = word1.substring(0,word1.length()/2);
		String joe = word2.substring(word2.length()/2);
		String bob = sue+joe;
		return bob;
	}
	
	public String[] mixedWords(String[] words)
	{
		String atemp[] = new String[words.length];
		for (int i=0;i<words.length;i+=2)
		{
			atemp[i]=recombine(words[i],words[i+1]);
			atemp[i+1]=recombine(words[i+1],words[i]);
		}
		return atemp;
	}
	
	public String toString()
	{
		String hi = "";
		for (int i=0;i<jumble.length;i++)
		{
			hi=hi+jumble[i];
		}
		return hi;
	}
}
		
	