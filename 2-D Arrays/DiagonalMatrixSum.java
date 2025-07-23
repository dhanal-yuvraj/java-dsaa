public class DiagonalMatrixSum {
    public static int diagonalSum(int matrix[][]){
        int result=0;
        for(int i=0;i<matrix.length;i++){
            result+=matrix[i][i];

            if(i!=matrix.length-i-1)
            result+=matrix[i][matrix.length-i-1];
        }
        return result;
    }
    public static void main(String[] args) {
        int arr[][] = {{1,2,3,4},
                       {3,4,5,6},
                       {7,8,9,10},
                    {11,12,13,14}};
        int result = diagonalSum(arr);
        System.out.println(result);
    }
}
