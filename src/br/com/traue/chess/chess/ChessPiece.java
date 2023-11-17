package br.com.traue.chess.chess;

import br.com.traue.chess.boardgame.Board;
import br.com.traue.chess.boardgame.Piece;

public class ChessPiece extends Piece {
	
	private Color color;

	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}
	
}
