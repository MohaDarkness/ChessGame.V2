package me.chessproject.chessgamev2.backend.board;

import java.util.ArrayList;

public class testClass {
    private ArrayList<Integer> array;

    public testClass(ArrayList<Integer> array){
        this.array = array;
    }

    public ArrayList<Integer> getArray() {
        return array;
    }

    public void changeFirst(int n){
        array.set(0, n);
    }
}
