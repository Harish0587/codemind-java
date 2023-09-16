import java.util.*;
public class main{
    static int even(int n)
    {
        if(n%2==0)
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
        System.out.println(even(n));
    }
}