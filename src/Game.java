public class Game {

    Player[] players;
    Board board;
    boolean end;
    int pCount;
    Dice die;

    public Game(int pCount){
        // initialise players
        this.pCount = pCount;
        players = new Player[pCount];
        for(int i=0; i<pCount; i++){
            players[pCount] = new Player();
        }

        board = new Board();
        die = new Dice();
        end=false;
    }

    public void startGame(){
        // set up game
        board.createBoard();
    }

    public void playGame(){
        // play game
        while(!end){
            for(int i=0; i<pCount; i++){
                int roll = die.roll();
                if(checkMove(players[pCount], roll)){
                    int token = chooseToken();
                    move(players[pCount], roll, token);
                }
            }
        }
    }

    private boolean checkMove(Player p, int roll){
        // check if player has movable pieces
        for(int i=0; i<4; i++){
            // if a token is not at home and can be moved
            if(p.getTokenPos(i)!=0 && p.getTokenPos(i)+roll<59){
                return true;
            }
        }

        // if player has no movable pieces, then check if roll is 6
        return roll == 6;
    }

    private void move(Player p, int roll, int token){
        p.updateTokenPos(token,roll);
    }

    private int chooseToken(){
        // TODO : player needs to choose which token to move
        return 1;
    }

}
