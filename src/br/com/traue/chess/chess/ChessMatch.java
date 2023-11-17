package br.com.traue.chess.chess;

import br.com.traue.chess.boardgame.Board;
import br.com.traue.chess.boardgame.Position;
import br.com.traue.chess.chess.pieces.King;
import br.com.traue.chess.chess.pieces.Rook;

public class ChessMatch {

	private Board board;

	public ChessMatch() {
		board = new Board(8, 8);
		initialSetup();
	}

	public ChessPiece[][] getPieces() {
		ChessPiece[][] pieces = new ChessPiece[board.getRows()][board.getColumns()];
		for (int i = 0; i < board.getRows(); i++) {
			for (int j = 0; j < board.getColumns(); j++) {
				pieces[i][j] = (ChessPiece)board.piece(i, j);
			}
		}
		return pieces;
	}
	
	private void initialSetup() {
		board.placePiece(new Rook(board, Color.WHITE), new Position(2, 1));
		board.placePiece(new Rook(board, Color.BLACK), new Position(0, 2));
		board.placePiece(new King(board, Color.WHITE), new Position(0, 6));
	}

}
