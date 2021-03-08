package Recursion;

public class FloodFill {
    public static void main(String[] args) {
        int a[][]={
                {1,1,1,1,1,1,1,1},
                {1,1,1,1,1,1,0,0},
                {1,0,0,1,1,0,1,1},
                {1,2,2,2,2,0,1,0},
                {1,1,1,2,2,0,1,0},
                {1,1,1,2,2,2,2,0},
                {1,1,1,1,1,2,1,1},
                {1,1,1,1,1,2,2,1},
        };
       floodfill(a,0,0,3,1);
        printMatrix(a);
    }

     static void floodfill(int[][] a, int r, int c, int newFill, int prevFill) {
        int row=a.length;
        int cols=a[0].length;
        if(r<0||c<0||r>=row||cols<=c) return;
        if(a[r][c]!=prevFill) return;
        a[r][c]=newFill;
        floodfill(a,r-1,c,newFill,prevFill);  //top
        floodfill(a,r+1,c,newFill,prevFill);   //bottom
        floodfill(a,r,c-1,newFill,prevFill);   //left
        floodfill(a,r,c+1,newFill,prevFill);   //right

    }

    private static void printMatrix(int[][] a) {
        int row=a.length;
        int cols=a[0].length;
        for(int i=0;i<row;i++){
            for (int j=0;j<cols;j++){
                System.out.print(a[i][j] +" ");
            }
            System.out.println();
        }
    }
}
