package br.com.traue.chess.chess;

import br.com.traue.chess.boardgame.BoardException;

public class ChessException extends BoardException {

	private static final long serialVersionUID = 1L;

	public ChessException(String message) {
		super(message);
	}

}
