package com.cs116.Testers;

import com.cs116.Lab6.Games.SportsGame;

public class SportsGameClient {
    public static void main(String[] args) {
        SportsGame sGame = new SportsGame(null, false, false);

        System.out.println(sGame);

        sGame.setGameCanTie(true);
        System.out.println(sGame.getGameCanTie());

        sGame.setTypeOfSport(true);
        System.out.println(sGame.getTeamSport());

        sGame.setDescription("game played between two teams of five players each on a rectangular court");
        System.out.println(sGame.getDescription());

        System.out.println(sGame);
    }
}
