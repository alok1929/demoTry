import java.util.*;
public class duck
{
	public static void main()
	{
		System.out.println("enter a num:");
		Scanner ss=new Scanner(System.in);
		String nstr=ss.nextLine();
		int len=nstr.length();
		int chi=0;
		for(int i=0;i<len;i++)
		{
			char ch=nstr.charAt(i);
			if(ch=='0')
			{
				chi++;
			}
		}		
		char f=nstr.charAt(0);
		if(chi>0 && f!='0')
		{
			System.out.println("duck number");
		}
		else
		{
			System.out.println("not a duck number");
		}

	}
}
