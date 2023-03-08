package com.cs116.Lab6.Vehicles;

public class VehiclesClient {
    public static void main(String[] args) {
        Bicycle trek74 = new Bicycle ();
        trek74.setGearCount(27);
        System.out.println(trek74.getGearCount());
        trek74.setBrand("Trek");
        trek74.setModel("7.4 FX");
        System.out.println(trek74);

        Skateboard board = new Skateboard();
        board.setBoardLength(31.5);
        System.out.println(board.getBoardLength());
        board.setBrand("Ally");
        board.setModel("Rocket");
        System.out.println(board);
    }
}
