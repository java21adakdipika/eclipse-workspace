package assignments;

public class TicTacToe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] board;
	    char currentPlayer;
	    
	    board = new char[3][3];
	    for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
	    
        currentPlayer = 'X';
        
        

	}

}
