package me.chessproject.chessgamev2.backend.creation;

import me.chessproject.chessgamev2.backend.board.Board;
import me.chessproject.chessgamev2.backend.board.cell.Cell;
import me.chessproject.chessgamev2.backend.board.pieces.Piece;

import java.util.ArrayList;

public class BoardCreator {
    private final ArrayList<ArrayList<Cell>> cells;
    private final ArrayList<Piece> playerOnePieces;
    private final ArrayList<Piece> playerTwoPieces;

    public BoardCreator(){
        CellsCreator cellsCreator = new CellsCreator();
        cells = cellsCreator.getCells();
        PiecesCreator piecesCreator = new PiecesCreator(cells);
        playerOnePieces = piecesCreator.getPlayerOnePieces();
        playerTwoPieces = piecesCreator.getPlayerTwoPieces();
    }

    public Board getBoard(){
        return new Board(cells, playerOnePieces, playerTwoPieces);
    }
}
