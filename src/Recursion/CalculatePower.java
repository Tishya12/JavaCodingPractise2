package Recursion;

import java.util.Scanner;

public class CalculatePower {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b=sc.nextInt();
        int ans=FindPower(a,b);
        System.out.println(ans);
    }

    private static int FindPower(int a, int b) {
        if(b==0) return 1;
        return a*FindPower(a,b-1);
    }
}
