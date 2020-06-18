import java.util.*;
public class numofwords
{
	public static void main()
	{
		System.out.println("enter the string:");
		Scanner ss=new Scanner (System.in);
		String str=ss.nextLine();
		int len=str.length();
		int sp=0;
		for(int i=0;i<len;i++)
	{
			char ch=str.charAt(i);
		
		if(Character.isSpace(ch))
		{
			sp++;

		}
	}
	System.out.println("number of words:" + (sp+1));

	}
}