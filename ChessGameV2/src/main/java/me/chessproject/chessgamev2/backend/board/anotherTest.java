package me.chessproject.chessgamev2.backend.board;

import java.util.ArrayList;

public class anotherTest {
    private ArrayList<testNum> arr;
    public anotherTest(ArrayList<testNum> arr){
        this.arr = arr;
    }
    public void changeFirst(int num){
        testNum newNum = new testNum(num);
        arr.set(0, newNum);
        System.out.print("This is arr inside \"anotherTest\": ");
        for(testNum number : arr){
            System.out.print(number.getNumber() + " ");
        }
        System.out.println("");
    }
}
