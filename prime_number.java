import java.util.*;
public class main{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int f=0;
        for(int i=2;i<(n/2);i++)
        {
            if(n%i==0)
            {
                f=1;
                break;
            }
        }
        if(f==0)
        {
            System.out.println("prime");
        }
        else
        {
            System.out.println("not a prime");
        }
    }
}