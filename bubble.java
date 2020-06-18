import java.util.*;
public class bubble
{
    public static void main()
    {
        System.out.println("enter the no. of elements:");
        Scanner ss=new Scanner (System.in);
        int n=ss.nextInt();
        int m[]=new int[n];
        int i,j,tmp=0;
        System.out.println("enter those elements:");
        for(i=0;i<n;i++)
        {
            m[i]=ss.nextInt();
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<n-i-1;j++)
            {
                if(m[j]>m[j+1])
                {
                   tmp=m[j];
                   m[j]=m[j+1];
                   m[j+1]=tmp;
                }
            }
        }
        System.out.println("the new order is:");
        for(i=0;i<n;i++)
        {
            System.out.println(m[i] + "\t");
        }
    }
}
        
 