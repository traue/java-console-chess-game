package application;

import br.com.traue.chess.chess.ChessMatch;

public class Main {

	public static void main(String[] args) {

		ChessMatch match = new ChessMatch();
		UI.printBoard(match.getPieces());

	}

}
