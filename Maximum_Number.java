import java.util.*;
public class main{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        String s=Integer.toString(n);
        char arr[]=s.toCharArray();
         for(int i=0;i<arr.length;i++)
         {
             if(arr[i]=='6')
             {
                 arr[i]='9';
                 break;
             }
         }
         int num=Integer.parseInt(new String(arr));
         System.out.println(num);
    }
}