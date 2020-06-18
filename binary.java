        import java.util.*;
public class binary 
{
    public static void main()
    {
        System.out.println("enter the number of elements:");
        Scanner ss=new Scanner (System.in);
        int n=ss.nextInt();
        int m[]=new int[n];
        int i,lo=0,hi=n,mid,q=0,search;
        System.out.println("enter those elements:");
        for(i=0;i<n;i++)
        {
            m[i]=ss.nextInt();
        }
        System.out.println("enter the element to search:");
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
                System.out.println("found at " + (mid+1) + "position");
                q++;
                break;
            }
        }
        if(q==0)
        {
            System.out.println("not found");
        }       
    }
}