import java.util.*;
public class sel
{
	public static void main()
	{
		System.out.println("enter the number of elements:");
		Scanner ss=new Scanner (System.in);
		int n=ss.nextInt();
		int m[]=new int[n];
		int small,pos,i,j,tmp=0;
		System.out.println("enter those elements:");
		for(i=0;i<n;i++)
		{
			m[i]=ss.nextInt();
		}
		for(i=0;i<n;i++)
		{
			small=m[i];
			pos=i;
		for(j=i+1;j<n;j++)
		{
			if(m[j]>small)
			{
				small=m[j];
				pos=j;
			}
		}
		tmp=m[i];
		m[i]=m[pos];
		m[pos]=tmp;
	}
	System.out.println("the new array in descending order is as follows:");
	for(i=0;i<n;i++)
	{
		System.out.println(m[i] + "\t");
	}
	}
}