package othello;

import java.util.Arrays;

public class Othello {
	private Board board;
	private int black;
	private int white;
	
	public Othello(Board board){
		this.board = board;
		putStartingPieces();
	}
	
	public void putPieceHere(int row, int col, Piece p) throws Exception{
		if(canPutPieceHere(row, col, p.getColor())){
			board.getBoard()[row][col] = p;
			if(isColorInSameRow(row, p.getColor()))
				fillHorizontal(row,p.getColor());
			if(isColorInSameColumn(col, p.getColor()))
				fillVertical(col,p.getColor());
			
			if(isGameOver())
				System.out.println(whoWon() + "Won!");
		}
		else
			throw new Exception("Can't put " + p.getColor().toString() + " Piece here!");
	}
	
	private String whoWon() {
		return black > white ? "Black" : "White";
	}

	private boolean isGameOver() {
		return true;
		
	}

	public boolean canPutPieceHere(int row, int col, Color c){
		if(isEmpty(row,col) & 
				(isColorInSameRow (row,c)||isColorInSameColumn(col,c)))
			return true;
		else
			return false;
	}
	
	public boolean isEmpty(int row, int col){
		return board.getBoard()[row][col] == null;
	}
	
	public boolean isColorInSameRow(int row, Color c){
		for(int i=0 ; i<board.getSize() ; i++){
			if(board.getBoard()[row][i].getColor() == c)
				return true;
		}
		return false;
	}
	
	public boolean isColorInSameColumn(int col, Color c){
		for(int i=0 ; i<board.getSize() ; i++){
			if(board.getBoard()[i][col].getColor() == c)
				return true;
		}
		return false;
	}
	
	public void fillHorizontal(int row, Color c){
		for(int i=0 ; i<board.getSize() ; i++)
			if(board.getBoard()[row][i] != null){
				board.getBoard()[row][i].setColor(c);
				updateColorCount(c);
			}
	}
	
	public void fillVertical(int col, Color c){
		for(int i=0 ; i<board.getSize() ; i++)
			if(board.getBoard()[i][col] != null){
				board.getBoard()[i][col].setColor(c);
				updateColorCount(c);
			}
	}
	
	
	private void updateColorCount(Color c) {
		if(c == Color.Black)
			this.black++;
		else if(c == Color.White)
			this.white++;
		
	}

	public void resetGame(){
		for(Piece[] row : board.getBoard())
			Arrays.fill(row, null);
		putStartingPieces();
	}
	
	public void putStartingPieces(){
		this.black = 2;
		this.white = 2;
		int size = board.getSize();
		int mid = (size/2)-1;
		
		//middle top left white
		board.getBoard()[mid][mid] = new Piece(Color.White);
		
		//middle top right Black
		board.getBoard()[mid][mid+1] = new Piece(Color.Black);
		
		//middle bottom left white
		board.getBoard()[mid+1][mid] = new Piece(Color.White);
		
		//middle bottom right Black
		board.getBoard()[mid+1][mid+1] = new Piece(Color.Black);
	}
}
