import java.util.*;
public class main{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n,dp;
        n=sc.nextInt();
        dp=n*(n-3)/2;
        System.out.println(dp);
    }
}