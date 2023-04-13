package me.chessproject.chessgamev2.backend.movement.movementrules;

import javafx.util.Pair;

public class RookMovementRule implements MovementRule{
    @Override
    public boolean checkMovement(Pair<Integer, Integer> currentPosition, Pair<Integer, Integer> newPosition) {
        int x_diff = Math.abs(currentPosition.getKey() - newPosition.getKey());
        int y_diff = Math.abs(currentPosition.getValue() - newPosition.getValue());

        return x_diff - y_diff != 0 && (x_diff + y_diff == x_diff || x_diff + y_diff == y_diff);
    }
}
