package mineSweeper;

public class Board {
	private int row;
	private int column;
	private String[][] board;
	
	public Board(int row, int col){
		this.board = new String[row][col];
		this.row = row;
		this.column = col;
	}
	
	public String getValue(int row, int col){
		return board[row][col];
	}
	
	public void setValue(int row, int col, String s){
		board[row][col] = s;
	}
	
	public String[][] getBoard(){
		return board;
	}

	public int getRow() {
		return row;
	}

	public int getColumn() {
		return column;
	}
}
