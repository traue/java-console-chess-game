package br.com.traue.chess.chess.pieces;

import br.com.traue.chess.boardgame.Board;
import br.com.traue.chess.chess.ChessPiece;
import br.com.traue.chess.chess.Color;

public class King extends ChessPiece {

	public King(Board board, Color color) {
		super(board, color);
	}

	@Override
	public String toString() {
		return "♚";
	}

}
