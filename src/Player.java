public class Player {

    private int[] tokenPos;

    public Player(){
        tokenPos = new int[4];
        setTokenPos();
    }

    private void setTokenPos(){
        // token position is a number between 1 and 59.
        for(int i=0; i<4; i++){
            tokenPos[i]=0;
        }
    }

    public void updateTokenPos(int token, int pos){
        // update coordinates of token
        tokenPos[token]+=pos;
    }

    public int getTokenPos(int i){
        return tokenPos[i];
    }

}
