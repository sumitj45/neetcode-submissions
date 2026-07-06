class Solution {
    public boolean exist(char[][] board, String word) {
        int row=board.length;
        int col=board[0].length;

        for(int r=0;r<row;r++){
            for(int c=0;c<col;c++){
                if(backtrack(board,word,r,c,0)){
                return true;
                }
                
            }
        }
        return false;

    }

    private boolean backtrack(char[][] board, String word,int row,int col,int index){
       
        //base case
        if(index==word.length()){
            return true;
        }

        if(row<0 || col <0 || row>=board.length || col>=board[0].length||board[row][col]!=word.charAt(index)){
            return false;
        }

        char temp=board[row][col];
        board[row][col]='#';
         
         boolean found= backtrack(board,word,row+1,col,index+1)||
                        backtrack(board,word,row-1,col,index+1)||
                        backtrack(board,word,row,col+1,index+1)||
                        backtrack(board,word,row,col-1,index+1);

        board[row][col]=temp;

        return found;

    }
}
