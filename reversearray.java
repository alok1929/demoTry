import java.util.*;
public class reversearray														
{
	public static void main()
	{
		System.out.println("enter the number of elements:");
		Scanner ss=new Scanner(System.in);
		int n=ss.nextInt();
		int m[]=new int[n];
		int i;
		System.out.println("enter those elements:");
		for(i=0;i<n;i++)
		{
			m[i]=ss.nextInt();
			}
			int q[]=new int[n];
		for(int j=0;j<n;j++) {
			for (i = n - 1; i >= 0; i--) {
				q[i] = m[j];
			}
		}
		
		System.out.println("the reverse of the array is:");
		for(i=0;i<n;i++)
		{
			System.out.println(q[i]+"\t");
		}	
}
}	
