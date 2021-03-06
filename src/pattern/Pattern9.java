package pattern;

import java.util.Scanner;

public class Pattern9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=1;i<=n;i++) {
            if (i < n) {
                for (int j = 1; j <= n - 1; j++) {
                    if (j == 1)
                        System.out.print("*");
                    else if (i == j)
                        System.out.print("*");
                    else
                        System.out.print(" ");

                }
                System.out.println();
            }
            else{
                for(int j=1;j<=n;j++){
                    System.out.print("*");
                }
            }
        }
    }
    }

