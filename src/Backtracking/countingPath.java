package Backtracking;

public class countingPath {
    public static void main(String[] args) {
        //System.out.println(countPaths(3, 3));
        //Paths("",3,3);
        boolean [][] maze = {
                {true , true ,true},
                {true, false, true},
                {true, true, true},
        } ;
        pathObstacles("", maze , 0,0 );
    }

    static int countPaths(int r, int c) {
        if (r == 1 || c == 1) {
            return 1;
        }
        int left = countPaths(r - 1, c);
        int right = countPaths(r, c - 1);

        return left + right;
    }

    static void Paths(String Path, int r, int c) {
        if (r == 1 && c == 1) {
            System.out.println(Path);
            return;
        }
        if (r > 1) {
            Paths(Path + 'D', r - 1, c);
        }
        if (c > 1) {
            Paths(Path + 'R', r, c - 1);
        }
    }
    // obstacles
    static void pathObstacles(String path , boolean[][] maze , int r , int c)  {
        if (r == maze.length-1 && c== maze[0].length -1) {
            System.out.println(path);
            return;
        }
        if(!maze[r][c]) {
            return;
        }
        if(r< maze.length-1) {
            pathObstacles(path + 'd' , maze, r+1 , c);
        }
        if(c < maze[0].length-1) {
            pathObstacles(path + 'r',maze,r,c+1);
        }
    }
}