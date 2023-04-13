package me.chessproject.chessgamev2.backend.movement.movementrules;

import javafx.util.Pair;
import me.chessproject.chessgamev2.backend.board.colors.Color;

public class PawnMovementRule implements MovementRule{
    Color color;
    public PawnMovementRule(Color color){
        this.color = color;
    }
    @Override
    public boolean checkMovement(Pair<Integer, Integer> currentPosition, Pair<Integer, Integer> newPosition) {
        boolean isWhite = color.getColorName().equals("white");
        boolean isFirstMove = isWhite && currentPosition.getValue() == 2 || !isWhite && currentPosition.getValue() == 7;

        int x_diff = Math.abs(newPosition.getKey() - currentPosition.getKey());
        int y_diff = newPosition.getValue() - currentPosition.getValue();
        y_diff *= isWhite? 1 : -1;

        if(x_diff == 0 && isFirstMove)
            return y_diff == 1 || y_diff == 2;
        else if(x_diff == 0)
            return y_diff == 1;
        return y_diff == 1 && x_diff == 1;
    }
}
