package me.chessproject.chessgamev2.backend.creation;


import me.chessproject.chessgamev2.backend.board.cell.Cell;
import me.chessproject.chessgamev2.backend.board.colors.Black;
import me.chessproject.chessgamev2.backend.board.colors.White;
import me.chessproject.chessgamev2.backend.board.pieces.*;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class PiecesCreator {
    private ArrayList<Piece> playerOnePieces = null;
    private ArrayList<Piece> playerTwoPieces = null;
    private final ArrayList<ArrayList<Cell>> cells;
    private final String txtFile = "pieces.txt";

    public PiecesCreator(ArrayList<ArrayList<Cell>> cells){
        this.cells = cells;
    }

    public ArrayList<Piece> getPlayerOnePieces(){
        if(playerOnePieces == null){
            readPieces();
        }
        return playerOnePieces;
    }

    public ArrayList<Piece> getPlayerTwoPieces(){
        if(playerTwoPieces == null){
            readPieces();
        }
        return playerTwoPieces;
    }

    private void readPieces(){
        File file;
        BufferedReader bufReader = null;
        String line;
        file = new File(txtFile);
        playerOnePieces = new ArrayList<Piece>();
        playerTwoPieces = new ArrayList<Piece>();
        try {
            bufReader = new BufferedReader(new FileReader(file));
            int row = 0;
            while((line = bufReader.readLine()) != null){
                for(int column = 0; column < line.length(); column++){
                    if(Character.isUpperCase(line.charAt(column))) {
                        createWhitePiece(row, column, line.charAt(column));
                    }
                    else {
                        createBlackPiece(row, column, line.charAt(column));
                    }
                }
                row++;
            }

        }
        catch(FileNotFoundException e){
            System.out.println("oops the file wasn't found!!");
            return;
        }
        catch(IOException e){
            System.out.println("oops something was wrong while reading the file!!");
            return;
        }

    }
    private void createWhitePiece(int row, int column, char c){
        Cell thisCell = cells.get(row).get(column);
        Piece thisPiece = null;
        switch(c){
            case 'B': thisPiece = new Bishop(thisCell, new White()); break;
            case 'K': thisPiece = new King(thisCell, new White()); break;
            case 'N': thisPiece = new Knight(thisCell, new White()); break;
            case 'P': thisPiece = new Pawn(thisCell, new White()); break;
            case 'Q': thisPiece = new Queen(thisCell, new White()); break;
            case 'R': thisPiece = new Rook(thisCell, new White()); break;
        }
        thisCell.setPiece(thisPiece);
        playerOnePieces.add(thisPiece);
    }
    private void createBlackPiece(int row, int column, char c){
        Cell thisCell = cells.get(row).get(column);
        Piece thisPiece = null;
        switch(c){
            case 'b': thisPiece = new Bishop(thisCell, new Black()); break;
            case 'k': thisPiece = new King(thisCell, new Black()); break;
            case 'n': thisPiece = new Knight(thisCell, new Black()); break;
            case 'p': thisPiece = new Pawn(thisCell, new Black()); break;
            case 'q': thisPiece = new Queen(thisCell, new Black()); break;
            case 'r': thisPiece = new Rook(thisCell, new Black()); break;
        }
        thisCell.setPiece(thisPiece);
        playerTwoPieces.add(thisPiece);
    }
}
