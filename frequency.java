import java.util.*;
public class frequency
{
	public static void main()
	{
		System.out.println("enter the string");
		Scanner ss=new Scanner (System.in);
		String str=ss.nextLine();
		int num=0,lo=0,up=0,sp=0;
		int len=str.length();
		for(int i=0;i<len;i++)
		{
			char ch=str.charAt(i);
			if(Character.isDigit(ch))
			{
				num++;
			}
			if(Character.isLowerCase(ch))
			{
				lo++;
			}
			if(Character.isUpperCase(ch))
			{
				up++;
			}
			if(ch=='!' || ch=='@' || ch=='#' || ch=='$' ||ch=='%'||ch=='^'||ch=='&'||ch=='*'||ch=='('||ch==')')
			{
				sp++;
			}
		}
		System.out.println("number of digits:" + num);
		System.out.println("number of lowercases:" + lo);
		System.out.println("number of uppercases:" + up);
		System.out.println("number of special Characters:" + sp);
	}
}