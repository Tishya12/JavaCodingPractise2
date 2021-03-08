package Recursion;

//find all path in n*m grid
public class FindPath {
    public static void main(String[] args) {
        int ans = path(2, 2);
       System.out.print(ans);
    }
   static int path(int n,int m){
       System.out.println(n +" "+m);
if(n==1 ||m==1) return 1;

return path(n,m-1)+path(n-1,m);
    }
}
