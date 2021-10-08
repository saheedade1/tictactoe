import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicTacToeTest {
    TicTacToe ticTacToe;
    @BeforeEach
    void setUp() {
        ticTacToe = new TicTacToe();
    }

    @Test

    void ticTacToeHasABoard() {
        CellValue [][] board = new CellValue[3][3];
        for (int row = 0; row < board.length; row++) {
            for (int column = 0; column < board[row].length; column++) {
                board[row][column] = CellValue.EMPTY;
            }
        }
        Assertions.assertArrayEquals(board, ticTacToe.getBoard());
    }

    @Test
    void boardCanBeDisplayed() {
        CellValue [][] board = new CellValue[3][3];
        for (int row = 0; row < board.length; row++) {
            for (int column = 0; column < board[row].length; column++) {
                board[row][column] = CellValue.EMPTY;
            }
        }

        Assertions.assertArrayEquals(board,ticTacToe.displayBoard());
    }

    @Test
    void testThatTheConstructorShouldInitializeTheBoardElementsToEMPTY() {
       CellValue[][] board = ticTacToe.getBoard();
        for (CellValue[] row:board) {
            for (CellValue column:row) {
                Assertions.assertEquals(CellValue.EMPTY, column);
            }
        }
    }

    @Test
    void testThatTheGameOnlyAllowsTwoPlayers() {
        Assertions.assertEquals(2, ticTacToe.getPlayers().length);
    }

    @Test
    void testThatPlayersAreCreated() {
        Player player = new Player(1);
        for (int i = 0; i < ticTacToe.getPlayers().length; i++) {
            Player newPlayer = ticTacToe.getPlayers()[i];
            Assertions.assertTrue(newPlayer.equals(player));
        }

    }

    @Test
    void testThatPlayerOneCanPlay() {
        Player playerOne= ticTacToe.getPlayers()[0];
        CellValue[][] board = ticTacToe.getBoard();
        playerOne.move(5, board);
        Assertions.assertEquals(CellValue.X, ticTacToe.getBoard()[1][1]);
    }

    @Test
    void testThatPlayerTwoCanPlay() {
        Player playerTwo= ticTacToe.getPlayers()[1];
        CellValue[][] board = ticTacToe.getBoard();
        playerTwo.move(5, board);
        Assertions.assertEquals(CellValue.O, ticTacToe.getBoard()[1][1]);
    }

    @Test
    void testThatPlayerOneCanplayInAnyCell() {

        Player playerOne= ticTacToe.getPlayers()[0];

        CellValue[][] board = ticTacToe.getBoard();

        playerOne.move(1, board);
        playerOne.move(2, board);
        playerOne.move(3, board);
        playerOne.move(4, board);
        playerOne.move(5, board);
        playerOne.move(6, board);
        playerOne.move(7, board);
        playerOne.move(8, board);
        playerOne.move(9, board);

        Assertions.assertEquals(CellValue.X, ticTacToe.getBoard()[0][0]);
        Assertions.assertEquals(CellValue.X, ticTacToe.getBoard()[0][1]);
        Assertions.assertEquals(CellValue.X, ticTacToe.getBoard()[0][2]);
        Assertions.assertEquals(CellValue.X, ticTacToe.getBoard()[1][0]);
        Assertions.assertEquals(CellValue.X, ticTacToe.getBoard()[1][1]);
        Assertions.assertEquals(CellValue.X, ticTacToe.getBoard()[1][2]);
        Assertions.assertEquals(CellValue.X, ticTacToe.getBoard()[2][0]);
        Assertions.assertEquals(CellValue.X, ticTacToe.getBoard()[2][1]);
        Assertions.assertEquals(CellValue.X, ticTacToe.getBoard()[2][2]);
    ticTacToe.displayBoard();

    }
    @Test
    void testThatPlayerTwoCanplayInAnyCell() {

        Player playerTwo = ticTacToe.getPlayers()[1];

        CellValue[][] board = ticTacToe.getBoard();

        playerTwo.move(1, board);
        playerTwo.move(2, board);
        playerTwo.move(3, board);
        playerTwo.move(4, board);
        playerTwo.move(5, board);
        playerTwo.move(6, board);
        playerTwo.move(7, board);
        playerTwo.move(8, board);
        playerTwo.move(9, board);

        Assertions.assertEquals(CellValue.O, ticTacToe.getBoard()[0][0]);
        Assertions.assertEquals(CellValue.O, ticTacToe.getBoard()[0][1]);
        Assertions.assertEquals(CellValue.O, ticTacToe.getBoard()[0][2]);
        Assertions.assertEquals(CellValue.O, ticTacToe.getBoard()[1][0]);
        Assertions.assertEquals(CellValue.O, ticTacToe.getBoard()[1][1]);
        Assertions.assertEquals(CellValue.O, ticTacToe.getBoard()[1][2]);
        Assertions.assertEquals(CellValue.O, ticTacToe.getBoard()[2][0]);
        Assertions.assertEquals(CellValue.O, ticTacToe.getBoard()[2][1]);
        Assertions.assertEquals(CellValue.O, ticTacToe.getBoard()[2][2]);
        ticTacToe.displayBoard();

    }

    @Test
    void thatPlayerCanOnlyPlayIntoAnEmptyCell() {
     Player playerOne = ticTacToe.getPlayers()[0];
     CellValue[][] board = ticTacToe.getBoard();
     Assertions.assertEquals(CellValue.EMPTY,board[0][1]);
     playerOne.move(2,board);
     Assertions.assertEquals(CellValue.X,board[0][1]);
     Player playerTwo = ticTacToe.getPlayers()[1];
     playerTwo.move(2,board);
     Assertions.assertEquals(CellValue.X,board[0][1]);
     playerTwo.move(5,board);
     Assertions.assertEquals(CellValue.O,board[1][1]);
      playerOne.move(5,board);
      Assertions.assertEquals(CellValue.O,board[1][1]);
      ticTacToe.displayBoard();

    }

    @Test
    void testThaTheGameCanProduceAWinnerAtCell123() {
        Player playerOne = ticTacToe.getPlayers()[0];
        CellValue[][] board = ticTacToe.getBoard();
        playerOne.move(1, board);
        playerOne.move(2, board);
        playerOne.move(3, board);
        Assertions.assertEquals(GameStatus.WON, ticTacToe.gameStatus());
    }

    @Test
    void testThaTheGameCanProduceAWinnerAtCell456() {
        Player playerOne = ticTacToe.getPlayers()[0];
        Player playerTwo = ticTacToe.getPlayers()[1];
        CellValue[][] board = ticTacToe.getBoard();
        playerOne.move(1, board);
        playerTwo.move(6, board);
        playerOne.move(8, board);
        playerOne.move(7,board);
        playerTwo.move(9,board);
        playerTwo.move(7,board);
        playerTwo.move(8,board);
        playerTwo.move(5,board);
        playerTwo.move(4,board);
        ticTacToe.displayBoard();
        Assertions.assertEquals(GameStatus.WON, ticTacToe.gameStatus());
    }
    @Test
    void testThaTheGameCanProduceAWinnerAtCell789() {
        Player playerOne = ticTacToe.getPlayers()[0];
        Player playerTwo = ticTacToe.getPlayers()[1];
        CellValue[][] board = ticTacToe.getBoard();
        playerOne.move(1, board);
        playerTwo.move(6, board);
        playerTwo.move(2, board);
        playerOne.move(3,board);
        playerTwo.move(9,board);
        playerTwo.move(7,board);
        playerTwo.move(8,board);
        playerTwo.move(9,board);
        playerTwo.move(4,board);
        ticTacToe.displayBoard();
        Assertions.assertEquals(GameStatus.WON, ticTacToe.gameStatus());
    }

    @Test
    void testThaTheGameCanProduceAWinnerAtCell147() {
        Player playerOne = ticTacToe.getPlayers()[0];
        CellValue[][] board = ticTacToe.getBoard();
        playerOne.move(1, board);
        playerOne.move(4, board);
        playerOne.move(7, board);
        Assertions.assertEquals(GameStatus.WON, ticTacToe.gameStatus());
        ticTacToe.displayBoard();
    }
    @Test
    void testThaTheGameCanProduceAWinnerAtCell258() {
        Player playerOne = ticTacToe.getPlayers()[0];
        Player playerTwo = ticTacToe.getPlayers()[1];
        CellValue[][] board = ticTacToe.getBoard();
        playerOne.move(2, board);
        playerOne.move(5, board);
        playerOne.move(8, board);
        playerTwo.move(9,board);
        playerTwo.move(7,board);
        playerTwo.move(3,board);
        playerTwo.move(9,board);
        playerTwo.move(4,board);
        ticTacToe.displayBoard();
        Assertions.assertEquals(GameStatus.WON, ticTacToe.gameStatus());
    }
    @Test
    void testThaTheGameCanProduceAWinnerAtCell369() {
        Player playerOne = ticTacToe.getPlayers()[0];
        Player playerTwo = ticTacToe.getPlayers()[1];
        CellValue[][] board = ticTacToe.getBoard();
        playerOne.move(3, board);
        playerOne.move(6, board);
        playerOne.move(9, board);
        playerTwo.move(8,board);
        playerTwo.move(7,board);
        playerTwo.move(2,board);
        playerOne.move(5,board);
        playerTwo.move(4,board);
        ticTacToe.displayBoard();
        Assertions.assertEquals(GameStatus.WON, ticTacToe.gameStatus());
    }
    @Test
    void testThaTheGameCanProduceAWinnerAtCell159() {
        Player playerOne = ticTacToe.getPlayers()[0];
        Player playerTwo = ticTacToe.getPlayers()[1];
        CellValue[][] board = ticTacToe.getBoard();
        playerOne.move(3, board);
        playerOne.move(5, board);
        playerOne.move(7, board);
        playerOne.move(2, board);
        playerOne.move(6, board);
        playerTwo.move(9, board);
        playerTwo.move(1, board);
        playerTwo.move(8, board);
        playerTwo.move(4, board);
        Assertions.assertEquals(GameStatus.WON, ticTacToe.gameStatus());
        ticTacToe.displayBoard();
    }
    @Test
    void testThaTheGameCanProduceAWinnerAtCell357() {
        Player playerOne = ticTacToe.getPlayers()[0];
        Player playerTwo = ticTacToe.getPlayers()[1];
        CellValue[][] board = ticTacToe.getBoard();
        playerOne.move(3, board);
        playerOne.move(5, board);
        playerOne.move(7, board);
        playerTwo.move(9, board);
        playerTwo.move(1, board);
        playerTwo.move(8, board);
        playerTwo.move(4, board);
        Assertions.assertEquals(GameStatus.WON, ticTacToe.gameStatus());
        ticTacToe.displayBoard();
    }

    @Test
    void testThatTheGameChecksForWinnerAfterEachPlay() {
        CellValue[][] board = ticTacToe.getBoard();
        Player playerOne = ticTacToe.getPlayers()[0];
        Player playerTwo = ticTacToe.getPlayers()[1];
        playerOne.move(9,board);
        ticTacToe.checkForWinner();
        playerTwo.move(5,board);
        ticTacToe.checkForWinner();
        playerOne.move(4,board);
        ticTacToe.checkForWinner();
        playerTwo.move(8,board);
        ticTacToe.checkForWinner();
        playerOne.move(7,board);
        ticTacToe.checkForWinner();
        playerTwo.move(6,board);
        ticTacToe.checkForWinner();
        playerOne.move(3,board);
        ticTacToe.checkForWinner();
        playerTwo.move(2,board);
        ticTacToe.checkForWinner();
        ticTacToe.displayBoard();
        Assertions.assertEquals(GameStatus.WON, ticTacToe.gameStatus());
    }

}