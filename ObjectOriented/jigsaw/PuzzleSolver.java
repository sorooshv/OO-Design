package jigsaw;

import java.util.ArrayList;

public class PuzzleSolver {
	private int[][] filler;
	
	public PuzzleSolver(Puzzle puzzle){
		int n = (int) puzzle.getPuzzleSize();
		this.filler = new int[n][n];
		solve(puzzle);
	}
	
	public void solve(Puzzle puzzle){
		solve(puzzle.getPuzzle());
	}
	
	private void solve(ArrayList<PuzzlePiece> puzzle){
		
	}
	
	private int[][] getFiller(){
		return this.filler;
	}
	
	private void setFilled(int row, int col){
		getFiller()[row][col] = 1;
	}
	
}
