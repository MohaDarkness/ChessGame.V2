package me.chessproject.chessgamev2.backend.creation;

import me.chessproject.chessgamev2.backend.board.cell.Cell;
import me.chessproject.chessgamev2.backend.board.pieces.Piece;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        CellsCreator cellsCreator = new CellsCreator();
        ArrayList<ArrayList<Cell>> cells = cellsCreator.getCells();
        PiecesCreator piecesCreator = new PiecesCreator(cells);
        ArrayList<Piece> whitePieces = piecesCreator.getPlayerOnePieces();
        ArrayList<Piece> blackPieces = piecesCreator.getPlayerTwoPieces();
        printCells(cells);
    }
    private static void printCells(ArrayList<ArrayList<Cell>> cells){
        for (ArrayList<Cell> cellsRow : cells) {
            for (Cell thisCell : cellsRow) {
                try {
                    System.out.print(thisCell.getColor().getColorName().charAt(0) + "(" +
                            thisCell.getPiece().getType().charAt(0) + ")(" +
                            thisCell.getPiece().getColor().getColorName().charAt(0) + ")("+
                            thisCell.getPosition().getKey() + ", " + thisCell.getPosition().getValue() + ")\t\t");
                } catch (NullPointerException e) {
                    System.out.print(thisCell.getColor().getColorName().charAt(0) + "(.)(.)(" +
                            thisCell.getPosition().getKey() + ", " + thisCell.getPosition().getValue() + ")\t\t");
                }

//                System.out.print(cells.get(i).get(j).getPosition().getKey() + " ");
            }
            System.out.println("");
        }
    }
}
