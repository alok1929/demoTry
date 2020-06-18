import java.util.*;
public class bin
{
	public static void main()
	{
		System.out.println("enter all the elements:");
		Scanner ss=new Scanner(System.in);
		int n=ss.nextInt();
		int m[]=new int[n];
		int lo=0,hi=n,mid,search,q=0,i;
		System.out.println("enter those elements:");
		for(i=0;i<n;i++)
		{
			m[i]=ss.nextInt();
		}
		System.out.println("enter the element to be searched:");
		search=ss.nextInt();
		while(lo<hi)
		{
			mid=(lo+hi)/2;
			if(m[mid]<search)
			{
				lo=mid+1;
			}
			else if(m[mid]>search)
			{
				hi=mid-1;
			}
			if(m[mid]==search)
			{
				q++;
				System.out.println("element found at " + (mid+1) + "position");
				break;
			}
		}
	}
}