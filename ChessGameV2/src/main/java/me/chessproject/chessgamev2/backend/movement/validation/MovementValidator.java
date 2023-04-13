package me.chessproject.chessgamev2.backend.movement.validation;

import javafx.util.Pair;
import me.chessproject.chessgamev2.backend.board.cell.Cell;
import me.chessproject.chessgamev2.backend.board.pieces.Piece;

import java.util.ArrayList;

public class MovementValidator {
    private ArrayList<ArrayList<Cell>> cells;
    private ValidationsChain validationChain;

    public MovementValidator(ArrayList<ArrayList<Cell>> cells, ArrayList<Piece> playerOnePieces, ArrayList<Piece> playerTwoPieces) {
        this.cells = cells;
        validationChain = new ValidationsChain(cells, playerOnePieces, playerTwoPieces);
    }

    public boolean isValidMove(Pair<Integer, Integer> pos1, Pair<Integer, Integer> pos2){
        return validationChain.isValid(pos1, pos2);
    }

    public ArrayList<ArrayList<Boolean>> getValidPositions(Pair<Integer, Integer> pos){
        ArrayList<ArrayList<Boolean>> validPositions = new ArrayList<>();
        for(int row = 0; row < cells.size(); row++){
            validPositions.add(new ArrayList<>());
            for(int col = 0; col < validPositions.get(0).size(); col++){
                validPositions.get(row).add(isValidMove(pos, new Pair<>(row, col)));
            }
        }
        return validPositions;
    }
}
