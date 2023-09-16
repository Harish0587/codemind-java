import java.util.*;
public class main{
    static String sqn(int n)
    {
        int f=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if((i*i)+(j*j)==n)
                {
                    f=1;
                }
            }
        }
        if(f==1)
        {
            return "True";
        }
        else
        {
            return "False";
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(sqn(n));
    }
}