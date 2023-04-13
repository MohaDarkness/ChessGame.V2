package me.chessproject.chessgamev2.backend.board.pieces;

import javafx.util.Pair;
import me.chessproject.chessgamev2.backend.board.cell.Cell;
import me.chessproject.chessgamev2.backend.board.colors.Color;

public interface Piece {
    public String getType();
    public void setType(String type);
    public Color getColor();
    public Cell getCell();
    public void setCell(Cell cell);
    public Pair<Integer, Integer> getPosition();
    public boolean checkMovePosition(Pair<Integer, Integer> newPosition);
}
