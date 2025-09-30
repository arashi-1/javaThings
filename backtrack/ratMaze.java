package backtrack;
public class ratMaze {
    public static void ratMaze(int maze[][], int i, int j,int er, int ec, String path, boolean isvisited[][]){
        if(i==maze.length-1 && j==maze[0].length-1){
            System.out.println(path);
            return;
        }
        if(i<0 || j<0 || i>=maze.length || j>=maze[0].length || maze[i][j]==0){
            return;
        }
        if(isvisited[i][j]==true){
            return;
        }
        isvisited[i][j]=true;
        ratMaze(maze, i+1, j, er, ec, path+'D', isvisited);
        ratMaze(maze, i, j+1, er, ec, path+'R', isvisited);
        ratMaze(maze, i-1, j, er, ec, path+'U', isvisited);
        ratMaze(maze, i, j-1, er, ec, path+'L', isvisited);
        isvisited[i][j]=false;
        return;

    }

    public static void main(String args[]){
        int row = 4, col =4;
        int maze[][]={
             { 1, 1, 1, 1 },
             { 0, 1, 0, 1 },
             { 1, 1, 1, 1 },
             { 1, 0, 1, 1 }
        };
        boolean isvisited [][] = new boolean[row][col]; 
        ratMaze(maze, 0,0,row-1,col-1,"", isvisited);

    }
}
