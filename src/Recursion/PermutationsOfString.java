package Recursion;


//use sets to print unique values
public class PermutationsOfString {
    public static void main(String[] args){
        permutations("abc",0,2); //strimg,intial index,last index
    }

    private static void permutations(String s, int l, int r) {
        if(l==r){
            //if set.contains(s) return else set.add(s)
            System.out.println(s);
            return;
        }
        for(int i=l;i<=r;i++){
            s=interchangeChar(s,l,i);
            permutations(s,l+1,r);
            s=interchangeChar(s,l,i);   //backtracking(making the string same as prev.)
        }
    }

    private static String interchangeChar(String s, int a, int b) {
        char ar[]=s.toCharArray();
        char temp=ar[a];
        ar[a]=ar[b];
        ar[b]=temp;
        return String.valueOf(ar);

    }

}
