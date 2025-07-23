public class Nqueen {
    public static boolean isSafe(char board[][],int row,int col){
        //vertical up
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        //horizontal left
        for(int i=row-1, j=col-1;j>=0&&i>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }

        //horizontal right
        for(int i=row-1,j=col+1;i>=0&&j<board.length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
    public static void nQueen(char board[][],int row){
        if(row==board.length){
            printBoard(board);
            return;
            
        }

        for(int i=0;i<board.length;i++){
            if(isSafe(board,row,i)){
                board[row][i]='Q';
                nQueen(board, row+1);
                board[row][i]='.';
            }
        }
    }

    public static void printBoard(char board[][]){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
        System.out.println("____chess board_____");
    }
    public static void main(String[] args) {
        int n = 5;
        char board[][]= new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]= '.';
            }
        }

        nQueen(board,0);
    }
}
