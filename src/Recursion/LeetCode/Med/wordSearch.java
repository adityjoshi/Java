package Recursion.LeetCode.Med;

public class wordSearch {
    public static void main(String[] args) {
       char [][] board = { {'A','D','I','T'},
                           {'A','Y','N','A'},
                           {'A','H','A','P'}

       } ;
       String word = "TANYA";
        System.out.println(exist(board,word));
    }

   static boolean exist(char[][] board, String word) {
         for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (findWord(board, word, i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }
    static boolean findWord(char [][] board, String word, int i, int j , int count) {
        if(count == word.length()) {
            return true ;
        }
        if(i<0 || j<0 || i>=board.length || j>=board[0].length || board[i][j]!=word.charAt(count))
            return false ;
        char temp = board[i][j];
        board[i][j]=' ' ;

        boolean found = findWord(board,word,i+1,j,count+1) || findWord(board,word,i,j+1,count+1) || findWord(board,word,i-1,j,count+1) || findWord(board,word,i,j-1,count+1) ;
        board[i][j] = temp ;
        return found ;
    }
}
