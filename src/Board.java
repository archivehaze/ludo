public class Board {

    int[][] board;

    public Board(){
        board=new int[15][15];
    }
    public void createBoard(){
        for(int i=0; i<15; i++){
            for(int j=0; j<15; j++){
                if((i<6 && j<6) || (i>8 && j<6) || (i<6 && j>8) || (i>8 && j>8)){
                    board[i][j]=-1;
                }else{
                    board[i][j]=0;
                }
            }
        }
    }

    public void printBoard(){
        for(int i=0; i<15; i++){
            for(int j=0; j<15; j++){
                System.out.printf(" %d ", board[i][j]);
            }
            System.out.println();
        }
    }

}
