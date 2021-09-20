package com.company;

public class Numbers extends Main
{
    private int firstNum;
    private double secondNum, sum, average;
    private String firstToBin, secondToHex;

    public Numbers(int firstNum, double secondNum) {
        firstNum = 0;
        secondNum = 0;        
    }

    public void setFirstNum(int firstn) {
        this.firstNum = firstn;
    }
    
    public void setSecondNum(double secondn) {
        this.secondNum = secondn;
    }
    
    public int getFirstNum() {
        return firstNum;
    }
    
    public double getSecondNum() {
        return secondNum;
    }
    
    public double sum(int firstn, double secondn) {
        this.sum = firstn + secondn;
        return sum;
    }
    
    public double average(int firstn, double secondn) {
        this.average = (firstn + secondn) / 2;
        return average;
    }
    
    public String convertToBinary(int firstn) {
        firstToBin = Integer.toBinaryString(firstn);
        return firstToBin;
    }
    
    public String convertToHexa(double secondn) {
        int secondnInt = (int) secondn;
        
        secondToHex = Integer.toHexString(secondnInt);
        return secondToHex;
    }
}
