package br.com.traue.chess.application;

import java.util.InputMismatchException;
import java.util.Scanner;

import br.com.traue.chess.chess.ChessException;
import br.com.traue.chess.chess.ChessMatch;
import br.com.traue.chess.chess.ChessPiece;
import br.com.traue.chess.chess.ChessPosition;

public class Main {

	public static void main(String[] args) {

		// tests
		Scanner sc = new Scanner(System.in);
		ChessMatch match = new ChessMatch();

		while (true) {
			try {
				UI.clearScreen();
				UI.printBoard(match.getPieces());
				System.err.println();
				System.out.print("Source: ");
				ChessPosition source = UI.readChessPosition(sc);
				
				boolean[][] possibleMoves = match.possibelMoves(source);
				UI.clearScreen();
				UI.printBoard(match.getPieces(), possibleMoves);
				System.out.println();
				System.out.print("Target: ");
				ChessPosition target = UI.readChessPosition(sc);

				ChessPiece capChessPiece = match.performChessMove(source, target);
			} catch (ChessException e) {
				System.out.println(e.getMessage());
				sc.nextLine();
			} catch (InputMismatchException e) {
				System.out.println(e.getMessage());
				sc.nextLine();
			}

		}

	}

}
