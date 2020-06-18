import java.util.*;
public class apoc {
    public static void main(String[] args) {
        System.out.println("enter the numeber of elements:");
        Scanner ss=new Scanner(System.in);
        int n=ss.nextInt();
        int m[]=new int[n];
        System.out.println("enter those elements:");
        for(int i=0;i<n;i++)
        {
            m[i]=ss.nextInt();
        }
        System.out.println("enter the search element:");
        int search=ss.nextInt();
        for(int i=0;i<n;i++)
        {
            if(m[i]==search)
            {
                System.out.println("element found at  " + (i+1) + " position");
                break;
            }
        }

    }
}
