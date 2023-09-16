import java.util.*;
public class main{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        double a=Math.sqrt(n);
        if((int) a*a==n)
        {
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}