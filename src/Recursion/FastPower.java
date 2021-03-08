package Recursion;

import java.util.Scanner;

public class FastPower {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b=sc.nextInt();
        int ans=FindPower(a,b);
        System.out.println(ans);
    }

    private static int FindPower(int a, int b) {
       if(b%2==0) return fastPower(a,b);
       else
       {int ans=fastPower(a,b);
       return a*ans*ans;}
    }

    private static int  fastPower(int a, int b) {
        if(b==0) return 1;
        return a*fastPower(a,b-1);
    }


}
