package Recursion;

import java.util.Scanner;

public class SumofNnaturalNumber {
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int ans=FindSum(n);
        System.out.println(ans);
}

    private static int FindSum(int n) {
            if(n==0) return 0;
        return n+FindSum(n-1);
    }
}
