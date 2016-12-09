package jigsaw;

import java.util.ArrayList;
import java.util.Arrays;

import jigsaw.PuzzlePiece.PuzzleType;

public abstract class Puzzle {
	protected ArrayList<PuzzlePiece> puzzle;
	private PuzzlePiece[][] display;
	
	
	public Puzzle(){
		this.puzzle = new ArrayList<PuzzlePiece>();
	}
	
	public void makePuzzleOfSize(int n){
		this.display = new PuzzlePiece[n][n];
		for(int i=0 ; i<n ; i++){
			addPuzzlePiece(new PuzzlePiece(PuzzleType.Edge));
		}
	}
	
	public void addPuzzlePiece(PuzzlePiece p){
		this.puzzle.add(p);
	}
	public ArrayList<PuzzlePiece> getPuzzle(){
		return this.puzzle;
	}
	
	public double getPuzzleSize(){
		return Math.sqrt(this.puzzle.size());
	}
	
	public void showPuzzle(){
		if(this.display != null)
			System.out.println(Arrays.toString(this.display));
	}
}
