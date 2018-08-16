package com.company.java;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class SodokuTableSetup {
    private ArrayList<CellNode> sodokuTable = new ArrayList<>();//(Collections.nCopies(81, new CellNode()));

    private void tableFiller() {
        for (int i = 1; i <= 81; i++) {
            CellNode tabelNode = new CellNode();
            this.sodokuTable.add(new CellNode());
        }
    }

    public void randomizeTable() {
        for (CellNode cell : this.sodokuTable) {
            int number = 0;
            while (number == 0) {
                number = (int) (Math.random() * 10);
//                System.out.println("&"+number);
            }
            cell.setCellValue(number);
        }
    }

    public void displaySodokuTable() {
        int cellCount = 1;
        String divider = "-------------------------";
        System.out.println(divider);
        for (int i = 0 ; i < this.sodokuTable.size() ; i++) {
            if ((i)%9 == 0) System.out.print("| ");
            System.out.print(this.sodokuTable.get(i).getCellValue()+" ");
            if ((i+1)%3 == 0)  System.out.print("| ");
            if ((i+1)%9 == 0)  System.out.println(" ");
            if ((i+1)%27 == 0) System.out.println(divider);
        }
    }

//    private boolean evaluate(int row, int col) {
//
//        return evaluateTrue;
//    }
//
//    private boolean evaluateRow(int row) {
//
//        return rowTrue;
//    }
//
//    private boolean evaluateCol(int col) {
//
//        return colTrue;
//    }
//
//    private boolean evaluateSet(int set) {
//
//        return setTrue;
//    }



    public void setTableFiller() {
        this.tableFiller();
    }
    public int getSodokuTableNodeValue(int location) {
        return this.sodokuTable.get(location).getCellValue();
    }
    public void setSodokuTableNodeValue(int location, int value) {
        this.sodokuTable.get(location).setCellValue(value);
    }

}
