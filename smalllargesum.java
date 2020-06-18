import java.util.*;
public class smalllargesum
{
	public static void main()
	{
		System.out.println("enter the Number of elements:");
		Scanner ss=new Scanner(System.in);
		int n=ss.nextInt();
		int m[]=new int[n];
		int i,j,small,pos,tmp=0,sum=0;
		System.out.println("enter those elements:");
		for(i=0;i<n;i++)
		{
			m[i]=ss.nextInt();
			sum=sum+m[i];
		}
		for(i=0;i<n;i++)
		{
			small=m[i];
			pos=i;
			for(j=i+1;j<n;j++)
			{
				if(m[j]<small)
				{
					small=m[j];
					pos=j;
				}
			}
			tmp=m[i];
			m[i]=m[pos];
			m[pos]=tmp;
		}
		System.out.println("the smallest element is:" + (m[0]));
		System.out.println("the largest element is:" + (m[n-1]));
		System.out.println("the sum of all elements:" + sum);
	}
}