import java.util.*;
public class main{
    static int palin(int n)
    {
        int rem=0;
        int rev=0;
        int temp=n;
        while(temp!=0)
        {
            rem=temp%10;
            rev=rev*10+rem;
            temp=temp/10;
        }
        if(n==rev)
        {
            return 2;
        }
        else
        {
            return 1;
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(palin(n));
    }
}