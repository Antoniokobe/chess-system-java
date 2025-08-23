package boardgame;

public abstract class Piece {
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
			this.board = board;
			position = null;
			
	}

	protected Board getBoard() {
		return board;
	}

	
	/* O hook method é uma parte fundamental do Padrão Template Method, 
	onde uma classe abstrata define o esqueleto de um algoritmo e, 
	através dos ganchos, permite que as subclasses substituam etapas
    específicas desse algoritmo.*/
	
	public abstract boolean[][] possibleMoves();
		
	public boolean possibleMove(Position position) {
		return possibleMoves()[position.getRow()][position.getColumn()];
		
	}
	
	public boolean isThereAnyPossibleMove() {
		boolean [][] mat =possibleMoves();
		for(int i=0; i<mat.length;i++) {
			for(int j=0; j<mat.length;j++) {
				if (mat[i][j]) {
					return true;
				}
			}
		}
		return false;
		
	}
	
	
	

}
