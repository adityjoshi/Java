package Backtracking;

import java.util.Arrays;

public class AllPaths {
    public static void main(String[] args) {
    boolean[][] matrix = {
            {true,true,true},
            {true,true,true},
            {true,true,true}
    };
    int[][]path = new int [matrix.length][matrix[0].length];
    AllPath("",matrix,0,0);
   // AllPathsPrint("",matrix,0,0,path,0);
    }

    static void AllPath(String p , boolean[][] maze , int r , int c){
        if(r == maze.length - 1 & c == maze[0].length-1) {
            System.out.println(p);
            return ;
        }
        if(!maze[r][c]) {
            return ;
        }
        maze[r][c] = false ;
        if(r < maze.length-1) {
            AllPath(p + 'D' ,maze, r+1 , c);
        }
        if(c < maze[0].length-1) {
            AllPath(p+'R',maze,r,c+ 1);
        }
        if(r > 0) {
            AllPath(p+'U' ,maze,r-1,c);
        }
        if(c>0){
            AllPath(p+'L' ,maze,r,c-1);
        }
        maze[r][c]=true;
    }
    static void AllPathsPrint(String p , boolean[][] maze , int r , int c,int[][]path,int step){
        if(r == maze.length - 1 & c == maze[0].length-1) { path[r][c]=step;
            for(int [] arr : path) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return ;
        }
        if(!maze[r][c]) {
            return ;
        }
        maze[r][c] = false ;
        path[r][c]=step;
        if(r < maze.length-1) {
            AllPathsPrint(p + 'D' ,maze, r+1 , c , path , step+1);
        }
        if(c < maze[0].length-1) {
            AllPathsPrint(p+'R',maze,r,c+ 1,path,step+1);
        }
        if(r > 0) {
            AllPathsPrint(p+'U' ,maze,r-1,c,path,step+1);
        }
        if(c>0){
            AllPathsPrint(p+'L' ,maze,r,c-1,path ,step+1);
        }
        maze[r][c]=true;
        path[r][c]=0;
    }
}
