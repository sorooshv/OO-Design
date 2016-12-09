package mineSweeper;

import java.io.PrintStream;
import java.util.Arrays;

public class Display {
	
	public enum Type{
		Bomb, Number, Empty;
	}
	
	private String[][] actualBoard;
	private String[][] playerBoard;
	private static final char BORDER_KNOT = '+';
    private static final char HORIZONTAL_BORDER = '-';
    private static final char VERTICAL_BORDER = '|';

    
    
	public Display(Board board){
		this.actualBoard = board.getBoard();
		this.playerBoard = new String[board.getRow()][board.getColumn()];
		startPlayerBoard();
	}
	
	
	
	private void startPlayerBoard() {
		for(String[] row : playerBoard){
			Arrays.fill(row, "?");
		}
		
	}



	public void print(){
			
	}
	
	public void refresh(Type t){
		if(t == Type.Bomb){
			System.out.println(Arrays.deepToString(actualBoard));
			System.out.println("You Lost!");
		}
		else if(t == Type.Number){
			System.out.println(Arrays.deepToString(playerBoard));
		}
		else{
			System.out.println(Arrays.deepToString(playerBoard));
		}
			
	}

}
