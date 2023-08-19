import java.util.*;
public class main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int r1,r2,r3;
            r1=sc.nextInt();
            r2=sc.nextInt();
            r3=sc.nextInt();
            if(r1>r2+r3){
                System.out.println("YES");
            }
            else if(r2>r1+r3){
                System.out.println("YES");
                
            }
            else if(r3>r1+r2)
            {
                System.out.println("YES");
                
            }
            else
            {
                System.out.println("NO");
            }
        }
    }
}