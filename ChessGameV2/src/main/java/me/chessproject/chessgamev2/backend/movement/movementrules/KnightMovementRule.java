package me.chessproject.chessgamev2.backend.movement.movementrules;

import javafx.util.Pair;

public class KnightMovementRule implements MovementRule{
    @Override
    public boolean checkMovement(Pair<Integer, Integer> currentPosition, Pair<Integer, Integer> newPosition) {
        int x_diff = Math.abs(currentPosition.getKey() - newPosition.getKey());
        int y_diff = Math.abs(currentPosition.getValue() - newPosition.getValue());
        int max = Math.max(x_diff, y_diff);
        int min = Math.min(x_diff, y_diff);

        return max == 2 && min == 1;
    }
}
