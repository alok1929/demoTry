import java.util.*;
public class merge
{
    public static void main()
    {
        System.out.println("enter the number of elements:");
        Scanner ss=new Scanner (System.in);
        int n=ss.nextInt();
        int m[]=new int[n];
        int i,count=0,j;
        System.out.println("enter those elements:");
        for(i=0;i<n;i++)
        {
            m[i]=ss.nextInt();
        }
        System.out.println("enter another array subscript :");
        int n1=ss.nextInt();
        int b[]=new int[n1];
        
        System.out.println("enter those elements:");
        for(j=0;j<n1;j++)
        {
            m[j]=ss.nextInt();
        }
        
        int c[]=new int[m.length+b.length];
        for(i=0;i<n;i++)
        {
            c[i]=m[i];
            count++;
        }
        for(j=0;j<n1;j++)
        {
            c[count++]=b[j];
        }
        System.out.println("after merging,the elements are:");
        for(i=0;i<c.length;i++)
        {
        System.out.println(c[i] + "\t");
    }

    }
}