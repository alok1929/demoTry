import java.util.*;
public class linear
{
    public static void main()
    {
        System.out.println("enter the number of elements:");
        Scanner ss=new Scanner(System.in);
        int n=ss.nextInt();
        int m[]=new int[n];
        int i,tmp=0,search;
        System.out.println("enter those elements");
        for(i=0;i<n;i++)
        {
            m[i]=ss.nextInt();
        }
        System.out.println("enter the search element:");
        search=ss.nextInt();
        for(i=0;i<n;i++)
        {
            if(m[i]==search)
            {
                System.out.println("element found at"+ (i+1) + "position");
                tmp++;
                break;
            }
        }
        if(tmp==0)
        {
            System.out.println("element not found");
        }
    }
}
            