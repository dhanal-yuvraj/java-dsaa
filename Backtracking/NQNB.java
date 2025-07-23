class NQNB{

    public static boolean isSafe(char board[][], int row ,int col){
        //vertical up
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        //diagonal left
        for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        //diagonal right
        for(int i=row-1,j=col+1;i>=0&&j<board.length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }

    public static void Nqueen(char board[][], int row){
        if(row==board.length){
            PrintBoard(board);
            return;
        }

        for(int i=0;i<board.length;i++){
            if(isSafe(board,row,i)){

                board[row][i] = 'Q';
                Nqueen(board, row+1);
                board[row][i] = 'X';
            }
        }
         
    }

    public static void PrintBoard(char board[][]){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
        System.out.println("____________");
    }
    public static void main(String[] args) {
        int n = 4;
        char board[][] = new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j] = 'X';
            }
        }

        Nqueen(board,0);
    }
}