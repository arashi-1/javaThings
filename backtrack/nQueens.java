package backtrack;
public class nQueens {

    public static boolean isSafe(char chess[][], int row, int col){
        //vertical up
        for(int i = row-1; i>=0;i--){
            if(chess[i][col]=='Q'){
                return false;
            }
        }

        //diagonal left up
        for(int i = row-1, j= col-1; i>=0 && j>=0; i--, j--){
            if(chess[i][j]=='Q'){
                return false;
            }
        }

        //diagonal right up
        for(int i = row-1, j= col+1; i>=0 && j<chess.length; i--, j++){
            if(chess[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }

    public static boolean nQueens(char chess[][], int row){
        if(row==chess.length){
            printChess(chess);
            return true;
        }

        for(int j =0; j<chess.length;j++){
            if(isSafe(chess, row, j)){
                chess[row][j]='Q';
                if(nQueens(chess, row+1)){
                    return true;
                }
                chess[row][j]='-'; //backtracking
            }
        }
        return false;
    }

    public static void printChess(char chess[][]){
        for(int i =0;i<chess.length;i++){
            for(int j =0; j<chess.length;j++){
                System.out.print(chess[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int n = 4;
        char chess[][]= new char[n][n];
        for(int i =0; i<n;i++){
            for(int j=0; j<n; j++){
                chess[i][j]= '-';
            }
        }
        if(nQueens(chess, 0)){
            System.out.println("Solution is possible");
        } else{
            System.out.println("Solution is not possible");
        }
    }
}
