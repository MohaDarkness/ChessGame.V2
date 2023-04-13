package me.chessproject.chessgamev2.backend.board.pieces;

import javafx.util.Pair;
import me.chessproject.chessgamev2.backend.board.cell.Cell;
import me.chessproject.chessgamev2.backend.board.colors.Color;
import me.chessproject.chessgamev2.backend.movement.movementrules.MovementRule;
import me.chessproject.chessgamev2.backend.movement.movementrules.RookMovementRule;

public class Rook implements Piece{
    String type = "rook";
    MovementRule movementRule = new RookMovementRule();
    Cell cell;
    Color color;

    public Rook(Cell cell, Color color){
        this.cell = cell;
        this.color = color;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public Cell getCell() {
        return cell;
    }

    @Override
    public void setCell(Cell cell) {
        this.cell = cell;
    }

    @Override
    public Pair<Integer, Integer> getPosition() {
        return cell.getPosition();
    }

    @Override
    public boolean checkMovePosition(Pair<Integer, Integer> newPosition) {
        return movementRule.checkMovement(getPosition(), newPosition);
    }
}
