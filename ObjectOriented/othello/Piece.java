package othello;

public class Piece {
	private Color color;
	
	public Piece(Color c){
		this.color = c;
	}
	
	public Color getColor(){
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
}
