public class SearchInAMatrixG {
    public static int matSearch(int mat[][], int N, int M, int X)
    {
        int i=0,j=M-1;
        while(i<N && j>=0){
            if(mat[i][j]==X){
                return 1;
            }
                if(mat[i][j]>X)j--;
                else i++;
        }
                    
        return 0;            // your code here
    } 
}
