package me.chessproject.chessgamev2.backend.movement;

import javafx.util.Pair;
import me.chessproject.chessgamev2.backend.board.cell.Cell;
import me.chessproject.chessgamev2.backend.board.pieces.Piece;

import java.util.ArrayList;

public class MoveMaker {
    private final ArrayList<ArrayList<Cell>> cells;
    private final ArrayList<Piece> playerOnePieces;
    private final ArrayList<Piece> playerTwoPieces;

    public MoveMaker(ArrayList<ArrayList<Cell>> cells, ArrayList<Piece> playerOnePieces, ArrayList<Piece> playerTwoPieces){
        this.cells = cells;
        this.playerOnePieces = playerOnePieces;
        this.playerTwoPieces = playerTwoPieces;
    }

    public void move(Pair<Integer, Integer> pos1, Pair<Integer, Integer> pos2 ){ //(row, column)
        Cell sourceCell = cells.get(pos1.getKey()).get(pos1.getValue());
        Piece sourcePiece = sourceCell.getPiece();
        Cell destinationCell = cells.get(pos2.getKey()).get(pos2.getValue());
        Piece destinationPiece;
        if(destinationCell.isEmpty()){
            sourcePiece.setCell(destinationCell);
            destinationCell.setPiece(sourcePiece);
            sourceCell.makeEmpty();
        }
        else{
            destinationPiece = destinationCell.getPiece();
            sourcePiece.setCell(destinationCell);
            destinationCell.setPiece(sourcePiece);
            sourceCell.makeEmpty();
            makeDead(destinationPiece);
        }
    }
    private void makeDead(Piece deadPiece){
        boolean isWhite = deadPiece.getColor().getColorName().equals("white");
        if(isWhite)
            playerOnePieces.remove(deadPiece);
        else
            playerTwoPieces.remove(deadPiece);
    }


}
