package Recursion.string;

import java.util.ArrayList;

// count the number of paths to reach the final destination where u can only move left and right
public class countingPath {
    public static void main(String[] args) {
         System.out.println(count(3,3));
         path("" , 3 ,3 );
        System.out.println( pathDiagonal("" , 3 ,3 ));
        boolean [][] board = {
                {true,true,true},
                {true,false,true},
                {true,true,true}
        };
    pathObstacle("" , board ,0,0);
    }
    static int count(int row , int col) {
        if(row == 1 || col == 1 ) {
            return 1 ;
        }
        int left = count(row -1 , col) ;
        int right = count(row , col-1);
        return right + left ;
    }
    static void path(String p , int r , int c){
        if(r == 1 & c == 1) {
            System.out.println(p);
            return ;
        }
        if(r>1) {
            path(p + 'D' , r-1 , c);
        }
        if(c>1) {
            path(p+'R',r,c-1);
        }
    }
    // also adding diagonal path to the matrix
    static ArrayList<String> pathDiagonal(String p , int r , int c){
        if(r == 1 & c == 1) {
           ArrayList<String> list = new ArrayList<>() ;
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if(r>1&&c>1) {
            list.addAll(pathDiagonal(p + 'D' , r-1 , c-1));
        }
        if(r>1) {
            list.addAll(pathDiagonal(p + 'H' , r-1 , c));
        }

        if(c>1) {
            list.addAll(pathDiagonal(p+'V',r,c-1));
        }
        return list;
    }
    // path with obstacles at (1,1)
    static void pathObstacle(String p ,boolean[][] maze , int r , int c){
        if(r == maze.length - 1 & c == maze[0].length-1) {
            System.out.println(p);
            return ;
        }
        if(!maze[r][c]) {
            return ;
        }
        if(r < maze.length-1) {
            pathObstacle(p + 'D' ,maze, r+1 , c);
        }
        if(c < maze[0].length-1) {
            pathObstacle(p+'R',maze,r,c+ 1);
        }
    }

}
