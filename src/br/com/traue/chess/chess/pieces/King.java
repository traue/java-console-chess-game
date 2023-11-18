package br.com.traue.chess.chess.pieces;

import br.com.traue.chess.boardgame.Board;
import br.com.traue.chess.boardgame.Position;
import br.com.traue.chess.chess.ChessMatch;
import br.com.traue.chess.chess.ChessPiece;
import br.com.traue.chess.chess.Color;

public class King extends ChessPiece {

	private ChessMatch chessMatch;
	
	public King(Board board, Color color, ChessMatch chessMatch) {
		super(board, color);
		this.chessMatch = chessMatch;
	}

	@Override
	public String toString() {
		return "♚"; 
	}

	private boolean canMove(Position position) {
		ChessPiece p = (ChessPiece)getBoard().piece(position);
		return p == null || p.getColor() != getColor();
	}
	
//	private boolean testRookCastling(Position position) {
//		ChessPiece p = (ChessPiece)getBoard().piece(position);
//		return p != null && p instanceof Rook && p.getColor() == getColor() && p.getMoveCount() == 0;
//	}
	
	@Override
	public boolean[][] possibleMoves() {
		boolean[][] moves = new boolean[getBoard().getRows()][getBoard().getColumns()];
		
		Position p = new Position(0, 0);
		
		// above check
		p.setValues(position.getRow() - 1, position.getColumn());
		if (getBoard().positionExists(p) && canMove(p)) {
			moves[p.getRow()][p.getColumn()] = true;
		}

		// below check
		p.setValues(position.getRow() + 1, position.getColumn());
		if (getBoard().positionExists(p) && canMove(p)) {
			moves[p.getRow()][p.getColumn()] = true;
		}

		// left check
		p.setValues(position.getRow(), position.getColumn() - 1);
		if (getBoard().positionExists(p) && canMove(p)) {
			moves[p.getRow()][p.getColumn()] = true;
		}

		// right check
		p.setValues(position.getRow(), position.getColumn() + 1);
		if (getBoard().positionExists(p) && canMove(p)) {
			moves[p.getRow()][p.getColumn()] = true;
		}

		// nw check
		p.setValues(position.getRow() - 1, position.getColumn() - 1);
		if (getBoard().positionExists(p) && canMove(p)) {
			moves[p.getRow()][p.getColumn()] = true;
		}

		// ne check
		p.setValues(position.getRow() - 1, position.getColumn() + 1);
		if (getBoard().positionExists(p) && canMove(p)) {
			moves[p.getRow()][p.getColumn()] = true;
		}

		// sw check
		p.setValues(position.getRow() + 1, position.getColumn() - 1);
		if (getBoard().positionExists(p) && canMove(p)) {
			moves[p.getRow()][p.getColumn()] = true;
		}
		
		// se check
		p.setValues(position.getRow() + 1, position.getColumn() + 1);
		if (getBoard().positionExists(p) && canMove(p)) {
			moves[p.getRow()][p.getColumn()] = true;
		}

		/*
		// #specialmove castling
		if (getMoveCount() == 0 && !chessMatch.getCheck()) {
			// #specialmove castling kingside rook
			Position posT1 = new Position(position.getRow(), position.getColumn() + 3);
			if (testRookCastling(posT1)) {
				Position p1 = new Position(position.getRow(), position.getColumn() + 1);
				Position p2 = new Position(position.getRow(), position.getColumn() + 2);
				if (getBoard().piece(p1) == null && getBoard().piece(p2) == null) {
					moves[position.getRow()][position.getColumn() + 2] = true;
				}
			}
			// #specialmove castling queenside rook
			Position posT2 = new Position(position.getRow(), position.getColumn() - 4);
			if (testRookCastling(posT2)) {
				Position p1 = new Position(position.getRow(), position.getColumn() - 1);
				Position p2 = new Position(position.getRow(), position.getColumn() - 2);
				Position p3 = new Position(position.getRow(), position.getColumn() - 3);
				if (getBoard().piece(p1) == null && getBoard().piece(p2) == null && getBoard().piece(p3) == null) {
					moves[position.getRow()][position.getColumn() - 2] = true;
				}
			}
		}*/
		
		return moves;
	}
}