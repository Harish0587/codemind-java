import java.util.*;
public class main{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int rev=0,rem=0;
        int temp=n;
        while(n!=0)
        {
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        if(rev==temp)
        {
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}