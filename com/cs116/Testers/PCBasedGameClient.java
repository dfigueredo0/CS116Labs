package com.cs116.Testers;

import com.cs116.Lab6.Games.PCBasedGame;

public class PCBasedGameClient {
    public static void main(String[] args) {
        PCBasedGame pcGame = new PCBasedGame(null, 0, 0, 0); 

        pcGame.setRequiredRAM(1);
        System.out.println(pcGame.getRequiredRAM());

        pcGame.setFileSize(250);
        System.out.println(pcGame.getFileSize());

        pcGame.setRequiredCPU(3);
        System.out.println(pcGame.getRequiredCPU());

        pcGame.setDescription("An online and local party game of teamwork and betrayal for 4-15 players...in space!");


        System.out.println(pcGame); 
    }
}
