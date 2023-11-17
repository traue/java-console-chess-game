package application;

import java.util.Scanner;

import br.com.traue.chess.chess.ChessMatch;
import br.com.traue.chess.chess.ChessPiece;
import br.com.traue.chess.chess.ChessPosition;

public class Main {

	public static void main(String[] args) {

		//tests
		Scanner sc = new Scanner(System.in);
		ChessMatch match = new ChessMatch();
		
		while(true) {
			UI.printBoard(match.getPieces());
			System.err.println();
			System.out.print("Source: ");
			ChessPosition source = UI.readChessPosition(sc);
			
			System.out.println();
			System.out.print("Target: ");
			ChessPosition target = UI.readChessPosition(sc);
			
			ChessPiece capChessPiece = match.performChessMove(source, target);
		}
		
		

	}

}
