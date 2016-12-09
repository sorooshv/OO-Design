package mineSweeper;

import java.util.Arrays;
import java.util.Random;

import mineSweeper.Display.Type;

public class Minesweeper {
	public enum Difficulty{
		Easy(3), Medium(6), Hard(12);
		
		private int val;
		
		private Difficulty(int val){
			this.val = val;
		}
		
		public int getValue(){
			return val;
		}
	}
	
	private Board board;
	private Difficulty difficulty;
	private Display display;
	
	public Minesweeper(int row, int col, Difficulty d){
		this.board= new Board(row,col);
		this.difficulty = d;
		assembleGame();
		this.display = new Display(board);
	}
	
	public void click(int row, int col){
		if(isBomb(row,col))
			display.refresh(Type.Bomb);
		else if(isNumber(row,col))
			display.refresh(Type.Number);
		else
			display.refresh(Type.Empty);
	}
	
	public void changeDifficulty(Difficulty d){
		this.difficulty = d;
	}
	
	public void resetGame(){
		Arrays.fill(board.getBoard(), null);
		assembleGame();
	}
	
	private void assembleGame() {
		addBombs();
		for(int i=0 ; i<board.getRow() ; i++){
			for(int j=0 ; j<board.getColumn() ; j++){
				if(board.getValue(i, j) == null){
					String count = getCountSurrounding(i,j);
					board.setValue(i, j, count); 
				}
					
			}
		}
	}
	
	private boolean isBomb(int row, int col){
		if(row < 0 || row >= board.getRow())
			return false;
		if(col < 0 || col >= board.getColumn())
			return false;
		if(board.getValue(row, col) == "*")
			return true;
		else	
			return false;
	}
	
	private String getCountSurrounding(int row, int col) {
		int result = 0;
		
		//top
		result += isBomb(row-1,col)? 1 : 0;
		
		//top-left
		result += isBomb(row-1,col-1)? 1 : 0;
		
		//top-right
		result += isBomb(row-1,col+1)? 1 : 0;
		
		//right
		result += isBomb(row,col+1)? 1 : 0;
		
		//left
		result += isBomb(row,col-1)? 1 : 0;
		
		//bottom-left
		result += isBomb(row+1,col-1)? 1 : 0;
		
		//bottom-left
		result += isBomb(row+1,col)? 1 : 0;
				
		//bottom-left
		result += isBomb(row+1,col+1)? 1 : 0;
		
		return result == 0 ? " " : Integer.toString(result);
	}

	private void addBombs() {
		int count = difficulty.getValue();
		Random rand = new Random();
		while(count > 0){
			int randRow = rand.nextInt(board.getRow());
			int randCol = rand.nextInt(board.getColumn());
			if(board.getValue(randRow, randCol) == null){
				board.setValue(randRow, randCol, "*");
				count--;
			}
		
		}
	}
	private boolean isNumber(int row, int col){
		String s = board.getValue(row, col);
		try { 
	        Integer.parseInt(s); 
	    } catch(NumberFormatException e) { 
	        return false; 
	    } catch(NullPointerException e) {
	        return false;
	    }
	    // only got here if we didn't return false
	    return true;
	}
	
	private String[][] playerTable(int row, int col){
		String[][] result = new String [row][col];
		for(String[] r : result){
			Arrays.fill(r, "?");
		}
		return result;
	}
}
