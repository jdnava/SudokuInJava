package com.company.java;

public class CellNode {
    private int cellValue = 0;
    private int[] possibleNumbers = {1,2,3,4,5,6,7,8,9};
    private int[] userPossibleNumbers = {};

    // possibleNumber getter/setter
    public int getUserPossibleNumbers(int index) { return this.userPossibleNumbers[index]; }
    public void setUserPossibleNumbers(int[] userPossibleNumbers) { this.userPossibleNumbers = possibleNumbers; }

    // possibleNumber getter/setter
    public int getPossibleNumbers(int index) { return this.possibleNumbers[index]; }
    public void setPossibleNumbers(int[] possibleNumbers) { this.possibleNumbers = possibleNumbers; }

    // cellValue getter/setter
    public int getCellValue() { return this.cellValue; }
    public void setCellValue(int cellValue) { this.cellValue = cellValue; }
    //
}
