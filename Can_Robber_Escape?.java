import java.util.*;
public class main{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int odd=0;
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]%2!=0)
            {
                odd+=1;
            }
        }
        if(odd<=2)
        {
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}