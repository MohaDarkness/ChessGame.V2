package me.chessproject.chessgamev2.backend.movement.validation;

import javafx.util.Pair;
import me.chessproject.chessgamev2.backend.board.cell.Cell;
import me.chessproject.chessgamev2.backend.board.pieces.Piece;

import java.util.ArrayList;

public class ValidationsChain {
    private ArrayList<ArrayList<Cell>> cells;
    private ArrayList<Piece> playerOnePieces;
    private ArrayList<Piece> playerTwoPieces;

    public ValidationsChain(ArrayList<ArrayList<Cell>> cells, ArrayList<Piece> playerOnePieces, ArrayList<Piece> playerTwoPieces) {
        this.cells = cells;
        this.playerOnePieces = playerOnePieces;
        this.playerTwoPieces = playerTwoPieces;
    }

    public boolean isValid(Pair<Integer, Integer> pos1, Pair<Integer, Integer> pos2){
        return true;
    }
}
