public class Player {

    private int[][] tokenPos;

    public Player(){
        tokenPos = new int[4][2];

        setTokenPos();
    }

    private void setTokenPos(){
        for(int i=0; i<4; i++){
            for(int j=0; j<2; j++){
                tokenPos[i][j]=0;
            }
        }
    }

    public void printTokenPos(){
        for(int i=0; i<4; i++){
            for(int j=0; j<2; j++){
                System.out.print(tokenPos[i][j]);
            }
            System.out.println();
        }
    }

}
