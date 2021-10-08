public class TicTacToe {

    private CellValue[][] board;
    private Player[] players= new Player[2];
    private GameStatus gameStatus=GameStatus.DRAWN;

    public TicTacToe() {
        board =new CellValue[3][3];
        for (int i = 0; i < players.length; i++) {
            players[i]= new Player(i+1);
        }
        for (int row = 0; row < board.length; row++) {
            for (int column = 0; column < board[row].length; column++) {
                board[row][column] = CellValue.EMPTY;
            }
        }
    }


    public CellValue[][] getBoard() {
        return board;
    }

    public CellValue[][] displayBoard() {
        for (int row = 0; row < board.length; row++) {
            System.out.print("-".repeat(25));
            System.out.println();
            for (int column = 0; column < board[row].length; column++) {
                if(board[row][column]==CellValue.EMPTY) System.out.printf("%s  \t%s  ", "|", " ");
                else System.out.printf("%s   %s  ", "|", board[row][column]);
            }
            System.out.println();
        }
        System.out.print("-".repeat(25));
        return board;
    }


    public Player[] getPlayers() {
        return players;
    }


    public GameStatus gameStatus() {
        return gameStatus;
    }

    public void checkForWinner() {
        if (board[0][0]==board[0][1]&&board[0][0]==board[0][2] && board[0][1]!=CellValue.EMPTY){
            gameStatus=GameStatus.WON;
        }
        else if (board[1][0]==board[1][1]&&board[1][0]==board[1][2]&&board[1][1]!=CellValue.EMPTY){
            gameStatus=GameStatus.WON;
        }
        else if (board[2][0]==board[2][1]&&board[2][0]==board[2][2]&&board[2][0]!=CellValue.EMPTY){
            gameStatus=GameStatus.WON;
        }
        else if(board[0][0]==board[1][0]&&board[0][0]==board[2][0] && board[1][0]!=CellValue.EMPTY){
            gameStatus=GameStatus.WON;
        }
        else if(board[0][1]==board[1][1]&&board[0][1]==board[2][1] && board[1][1]!=CellValue.EMPTY){
            gameStatus=GameStatus.WON;
        }
        else if(board[0][2]==board[1][2]&&board[0][2]==board[2][2] && board[1][2]!=CellValue.EMPTY){
            gameStatus=GameStatus.WON;
        }
        else if(board[0][0]==board[1][1]&&board[0][0]==board[2][2]&&board[1][1]!=CellValue.EMPTY){
            gameStatus=GameStatus.WON;
        }
        else if(board[0][2]==board[1][1]&&board[0][2]==board[2][0]&&board[1][1]!=CellValue.EMPTY){
            gameStatus=GameStatus.WON;
        }
//        else{
//            gameStatus = GameStatus.DRAWN;
//        }
    }
}
