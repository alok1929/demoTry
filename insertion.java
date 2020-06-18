import java.util.*;
public class insertion
{
	public static void main()
	{
		System.out.println("enter the number of elements:");
		Scanner ss=new Scanner (System.in);
		int n=ss.nextInt();
		int m[]=new int[n+1];
		int i,pos,x;
		System.out.println("enter those elements:");
		for(i=0;i<n;i++)
		{
			m[i]=ss.nextInt();
		}
		System.out.println("enter position of the element");
	pos=ss.nextInt();
	System.out.println("enter the element you want to insert:");
	x=ss.nextInt();
		
		
		for(i=(n-1);i>=(pos-1);i--)
		{
			m[i+1]=m[i];
		}
		m[pos-1]=x;
		System.out.println("after insertion:");
		for(i=0;i<n;i++)
		{
			System.out.print(m[i] + ",");
		}
		System.out.print(m[n]);
	}
}