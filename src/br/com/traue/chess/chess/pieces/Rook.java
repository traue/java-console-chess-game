package br.com.traue.chess.chess.pieces;

import br.com.traue.chess.boardgame.Board;
import br.com.traue.chess.chess.ChessPiece;
import br.com.traue.chess.chess.Color;

public class Rook extends ChessPiece {

	public Rook(Board board, Color color) {
		super(board, color);
	}

	@Override
	public String toString() {
		return "♜";
	}

}
