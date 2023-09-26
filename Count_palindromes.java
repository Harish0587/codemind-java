import java.util.*;
public class main{
    static int cp(int k)
    {
        int temp=k,s=0;
        while(k!=0){
            int rem=k%10;
            s=s*10+rem;
            k=k/10;
        }
        if(s==temp){
            return 1;   
        }
        else{
            return 0;
        }
        
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
               if(cp(arr[i])==1){
                   c+=1;
               }            
        }
        System.out.println(c);

    }
}