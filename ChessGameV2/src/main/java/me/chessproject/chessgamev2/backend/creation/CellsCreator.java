package me.chessproject.chessgamev2.backend.creation;

import javafx.scene.paint.Color;
import javafx.util.Pair;
import me.chessproject.chessgamev2.backend.board.cell.Cell;
import me.chessproject.chessgamev2.backend.board.colors.Black;
import me.chessproject.chessgamev2.backend.board.colors.White;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class CellsCreator {
    private ArrayList<ArrayList<Cell>> cells = null;
    private final String txtFile = "cells.txt";

    public CellsCreator(){

    }

    public ArrayList<ArrayList<Cell>> getCells(){
        if(cells == null)
            readCells();

        return cells;
    }

    private void readCells(){
        File file;
        BufferedReader bufReader = null;
        String[] line;
        file = new File(txtFile);
        try {
            bufReader = new BufferedReader(new FileReader(file));
            line = Arrays.stream(bufReader.readLine().replaceAll("\\s+$", "").split("x")).toArray(String[]::new);

        }
        catch(FileNotFoundException e){
            System.out.println("oops the file wasn't found!!");
            return;
        }
        catch(IOException e){
            System.out.println("oops something was wrong while reading the file!!");
            return;
        }


        int numRows = Integer.parseInt(line[0]);
        int numColumns = Integer.parseInt(line[1]);
        cells = new ArrayList<ArrayList<Cell>>();
        for(int r = 1; r <= numRows; r++){
            ArrayList<Cell> row = new ArrayList<>();
            for(int c = 1; c <= numColumns; c++){
                if(Math.abs(r - c) % 2 == 0)
                    row.add(new Cell(new Pair<>(r, c), new Black()));
                else
                    row.add(new Cell(new Pair<>(r, c), new White()));
            }
            cells.add(row);
        }
    }
}
