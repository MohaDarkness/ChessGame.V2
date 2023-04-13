package me.chessproject.chessgamev2.backend.board;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        ArrayList<Integer> arr = new ArrayList<Integer>();
//        arr.add(1);
//        arr.add(2);
//        arr.add(3);
//        changeArray(arr);
//        System.out.println(arr.get(0));
//
//
//        testClass test1 = new testClass(arr);
//        testClass test2 = new testClass(arr);
//        test1.changeFirst(9);
//        System.out.println(test1.getArray());
//        System.out.println(test2.getArray());

        testNum num1 = new testNum(1);
        testNum num2 = new testNum(2);
        testNum num3 = new testNum(3);
        testNum num4 = new testNum(4);
        ArrayList<testNum> array1 = new ArrayList<>();
        ArrayList<testNum> array2 = new ArrayList<>();
        array1.add(num1); array2.add(num1);
        array1.add(num2); array2.add(num2);
        array1.add(num3); array2.add(num3);
        array1.add(num4); array2.add(num4);
        anotherTest anotherTest = new anotherTest(array1);
        anotherTest.changeFirst(9);
        System.out.println(array1.get(0).getNumber());
        testNum newNumber = array1.get(0);
        newNumber.changeNumber(99);
        System.out.println("-----\n" + newNumber.getNumber() + "\n" + array1.get(0).getNumber());


    }
    public static void changeArray(ArrayList<Integer> arr){
        arr.set(0, 9);
    }
}
