package com.company.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // pick size of sodoku below
        int countOfSodoku = 9;

        // Create base vector
        Vector baseArray = new Vector();
        for (int i = 1; i <= countOfSodoku; i++) {
            baseArray.add(i);
        }
        // Create Base Row vector
        Vector baseRowArray = new Vector();
        baseRowArray.addAll(baseArray);
        // Create Base Column Vector
        Vector baseColArray = new Vector();
        baseColArray.addAll(baseArray);
        // Create Base Set Vector
        Vector baseSetArray = new Vector();
        baseSetArray.addAll(baseArray);
        //test Creations
        System.out.println("baseArray =    "+baseArray);
        System.out.println("baseRowArray = "+baseRowArray);
        System.out.println("baseColArray = "+baseColArray);
        System.out.println("baseSetArray = "+baseSetArray);


//        // Create CellNode
//        CellNode testNode = new CellNode();
//        // Test CellNode Creation
//        Scanner input = new Scanner(System.in);
//        System.out.print("input number: ");
//        int cellNodeTestNumber = input.nextInt();
//        testNode.setCellValue(cellNodeTestNumber);
//        System.out.println("test get/set CellNode(will equal the number input = "+testNode.getCellValue());



        // Create SodokuTable
        SodokuTableSetup testTable = new SodokuTableSetup();
        // Test Table Creation
        testTable.setTableFiller();
        testTable.displaySodokuTable();
        testTable.randomizeTable();
        testTable.displaySodokuTable();








    }
}
