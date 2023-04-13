package me.chessproject.chessgamev2.backend.movement.movementrules;

import javafx.util.Pair;

public interface MovementRule {
    public boolean checkMovement(Pair<Integer, Integer> currentPosition, Pair<Integer, Integer> newPosition);
}
