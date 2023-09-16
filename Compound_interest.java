import java.util.*;
public class main{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int p,r,t;
        p=sc.nextInt();
        r=sc.nextInt();
        t=sc.nextInt();
        double ci=p*(Math.pow(1+r/(100*1.0),t));
        System.out.printf("%.2f",ci);
        
        
    }
}