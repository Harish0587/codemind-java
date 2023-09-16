import java.util.*;
public class main{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int max=-1;
        while(n>0)
        {
            int dig=n%10;
            if(dig>max)
            {
                max=dig;
            }
            n=n/10;
        }
        System.out.println(max);
    }
}