package jigsaw;

public class PuzzlePiece {
	public enum PuzzleType{
		Edge, NonEdge;
	}
	
	private PuzzleType type;
	
	public PuzzlePiece(PuzzleType type){
		this.type = type;
	}
	
	public PuzzleType getType(){
		return this.type;
	}
}
