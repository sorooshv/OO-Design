package othello;

public class Board {
	private int size;
	private Piece[][] board;
	
	public Board(int size){
		this.board = new Piece[size][size];
		this.size= size;
	}

	public int getSize() {
		return size;
	}

	public Piece[][] getBoard() {
		return board;
	}
	
	
}
