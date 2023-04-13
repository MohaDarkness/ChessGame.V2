package me.chessproject.chessgamev2.backend;

import me.chessproject.chessgamev2.backend.board.Board;
import me.chessproject.chessgamev2.backend.creation.BoardCreator;

public class GameModerator {
    private Board board = null;

    public GameModerator(){

    }

    public void createBoard(){
        BoardCreator boardCreator = new BoardCreator();
        board = boardCreator.getBoard();
    }

}
