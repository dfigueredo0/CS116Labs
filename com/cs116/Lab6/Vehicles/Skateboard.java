package com.cs116.Lab6.Vehicles;

public class Skateboard extends Vehicle {
    private double myBoardLength ;
    
    public Skateboard() {
        myBoardLength = 0;
    }
    
    public Skateboard(double boardLength) {
        setBoardLength(boardLength);
    }
    
    public double getBoardLength() {
        return myBoardLength;
    }
    
    public void setBoardLength(double boardLength) {
        myBoardLength = boardLength;
    }
}
