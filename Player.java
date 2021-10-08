public class Player{

    private int id;

    public Player(int id) {
        this.id = id;
    }

    public int idForPlayer(){
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        return this.getClass() == obj.getClass();
    }

    public void move(int cell, CellValue[][] board) {

        if (cell == 1 && this.idForPlayer()==1) {
            if(board[0][0]== CellValue.EMPTY)
            board[0][0]=CellValue.X;
        }
        if (cell == 2 && this.idForPlayer()==1) {
            if(board[0][1]== CellValue.EMPTY)
            board[0][1]=CellValue.X;
        }
        if (cell == 3 && this.idForPlayer()==1) {
            if(board[0][2]== CellValue.EMPTY)
            board[0][2]=CellValue.X;
        }
        if (cell == 4 && this.idForPlayer()==1) {
            if(board[1][0]== CellValue.EMPTY)
            board[1][0]=CellValue.X;
        }
        if (cell == 5 && this.idForPlayer()==1) {
            if(board[1][1]== CellValue.EMPTY)
            board[1][1]=CellValue.X;
        }
        if (cell == 6 && this.idForPlayer()==1) {
            if(board[1][2]== CellValue.EMPTY)
            board[1][2]=CellValue.X;
        }
        if (cell == 7 && this.idForPlayer()==1) {
            if(board[2][0]== CellValue.EMPTY)
            board[2][0]=CellValue.X;
        }
        if (cell == 8 && this.idForPlayer()==1) {
            if(board[2][1]== CellValue.EMPTY)
            board[2][1]=CellValue.X;
        }
        if (cell == 9 && this.idForPlayer()==1) {
            if(board[2][2]== CellValue.EMPTY)
            board[2][2]=CellValue.X;
        }

        if (cell == 1 && this.idForPlayer()==2) {
            if(board[0][0]== CellValue.EMPTY)
            board[0][0]=CellValue.O;
        }
        if (cell == 2 && this.idForPlayer()==2) {
            if(board[0][1]== CellValue.EMPTY)
            board[0][1]=CellValue.O;
        }
        if (cell == 3 && this.idForPlayer()==2) {
            if(board[0][2]== CellValue.EMPTY)
            board[0][2]=CellValue.O;
        }
        if (cell == 4 && this.idForPlayer()==2) {
            if(board[1][0]== CellValue.EMPTY)
            board[1][0]=CellValue.O;
        }
        if (cell == 5 && this.idForPlayer()==2) {
            if(board[1][1]== CellValue.EMPTY)
            board[1][1]=CellValue.O;
        }
        if (cell == 6 && this.idForPlayer()==2) {
            if(board[1][2]== CellValue.EMPTY)
            board[1][2]=CellValue.O;
        }
        if (cell == 7 && this.idForPlayer()==2) {
            if(board[2][0]== CellValue.EMPTY)
            board[2][0]=CellValue.O;
        }
         if (cell == 8 && this.idForPlayer()==2) {
             if(board[2][1]== CellValue.EMPTY)
            board[2][1]=CellValue.O;
        }
        if (cell == 9 && this.idForPlayer()==2) {
            if(board[2][2]== CellValue.EMPTY)
            board[2][2]=CellValue.O;
        }
    }

}
