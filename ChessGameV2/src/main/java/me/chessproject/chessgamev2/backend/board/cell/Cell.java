package me.chessproject.chessgamev2.backend.board.cell;

import javafx.util.Pair;
import me.chessproject.chessgamev2.backend.board.colors.Color;
import me.chessproject.chessgamev2.backend.board.pieces.Piece;

public class Cell {
    private final Pair<Integer, Integer> position;
    private final Color color;
    private Piece residentPiece = null;


    public Cell(Pair<Integer, Integer> position, Color color){
        this.position = position;
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public Pair<Integer, Integer> getPosition(){
        return position;
    }

    public boolean isEmpty(){
        return residentPiece == null;
    }
    public void makeEmpty(){
        residentPiece = null;
    }
    public void setPiece(Piece piece){
        residentPiece = piece;
    }

    public Piece getPiece(){
        return residentPiece;
    }

}
