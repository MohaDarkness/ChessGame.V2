package me.chessproject.chessgamev2.backend.movement.movementrules;

import javafx.util.Pair;

public class QueenMovementRule implements MovementRule{
    @Override
    public boolean checkMovement(Pair<Integer, Integer> currentPosition, Pair<Integer, Integer> newPosition) {
        int x_diff = Math.abs(currentPosition.getKey() - newPosition.getKey());
        int y_diff = Math.abs(currentPosition.getValue() - newPosition.getValue());
        if(x_diff == y_diff)
            return true;
        else if(x_diff == 0 && y_diff > 0)
            return true;
        else return y_diff == 0 && x_diff > 0;
    }
}
