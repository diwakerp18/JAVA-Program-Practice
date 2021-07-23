package com.company;

public class Box {
    private int length, breadth, height;
    public void setDimenssion(int l, int b, int h){
        length = l;
        breadth = b;
        height = h;
    }
    public void showDimension(){
        System.out.println("Length : "+length);
        System.out.println("Breadth : "+breadth);
        System.out.println("Height : "+height);
    }
    public static void main(String[] args){
        Box smallBox = new Box();
        smallBox.setDimenssion(10,12,13);
        smallBox.showDimension();
    }
}
