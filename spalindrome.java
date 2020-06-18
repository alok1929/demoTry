import java.util.*;
public class spalindrome
{
	public static void main()
	{
		System.out.println("enter the string");
		Scanner ss=new Scanner(System.in);
		String str=ss.nextLine();
		int len=str.length();
		char ch;String b="";
		for(int i=len-1;i>=0;i--)
		{
			ch=str.charAt(i);
			b=b+ch;
		}
		if(b.equals(str))
		{
			System.out.println("palindrome string");
		}
		else
		{
			System.out.println("not a palindrome");
		}
	}
}