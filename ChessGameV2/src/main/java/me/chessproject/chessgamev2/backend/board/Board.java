package me.chessproject.chessgamev2.backend.board;

import javafx.util.Pair;
import me.chessproject.chessgamev2.backend.board.cell.Cell;
import me.chessproject.chessgamev2.backend.board.pieces.Piece;
import me.chessproject.chessgamev2.backend.movement.MoveMaker;

import java.util.ArrayList;

public class Board {
    private final MoveMaker moveMaker;
    private final ArrayList<ArrayList<Cell>> cells;
    private ArrayList<Piece> playerOnePieces;
    private ArrayList<Piece> playerTwoPieces;

    public Board(ArrayList<ArrayList<Cell>> cells, ArrayList<Piece> playerOnePieces, ArrayList<Piece> playerTwoPieces){
        this.cells = cells;
        this.playerOnePieces = playerOnePieces;
        this.playerTwoPieces = playerTwoPieces;
        moveMaker = new MoveMaker(cells, playerOnePieces, playerTwoPieces);
    }

    public void movePiece(Pair<Integer, Integer> pos1, Pair<Integer, Integer> pos2){
        moveMaker.move(pos1, pos2);
    }

    public boolean isCheckMate(){
        return false;
    }

    public ArrayList<Pair<Integer, Integer>> getValidPositions(String pos){
        return new ArrayList<Pair<Integer, Integer>>();
    }

    private boolean isValidMove(String pos1, String pos2){
        return false;
    }


}
