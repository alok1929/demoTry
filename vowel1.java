import java.util.*;
public class vowel1
{
	public static void main()
	{
		System.out.println("enter string:");
		Scanner ss=new Scanner(System.in);
		String st=ss.nextLine();
		String str=st.toLowerCase();
		int len=str.length();
		for(int i=0;i<len;i++)
		{
			char ch=str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				int new0=ch+1;
				char n=(char)new0;
				System.out.print(n);
			}
			else
			{
			    System.out.print(ch);
			
		}
		
	}
}
}