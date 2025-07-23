public class StairCaseMatrix {

    public static boolean stairCase(int matrix[][],int key){
        int row=0;
        int col=matrix[0].length-1;
        while(row<matrix.length && col>=0){
            if(key==matrix[row][col]){
                System.out.println("The key was found at ("+ row +","+col+")");
                return true;
            }
            else if (key<matrix[row][col]) {
                col--;
            } else {
                row++;
            }
        }
        System.out.println("Key was not found");
        return false;
    }
    public static void main(String[] args) {
         int arr[][] = {{1,2,3,4},
                       {3,4,5,6},
                       {7,8,9,10},
                    {11,12,13,14}};

        int key = 11;
        stairCase(arr, key);
    }
}
