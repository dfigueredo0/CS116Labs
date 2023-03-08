package com.cs116.Testers;

import com.cs116.Lab6.Games.BoardGame;

public class BoardGameClient {
    public static void main(String[] args) {
        BoardGame bGame = new BoardGame(null, 0, false);

        System.out.println(bGame);

        bGame.setGameCanTie(true);
        System.out.println(bGame.getGameCanTie());

        bGame.setPlayers(2);
        System.out.println(bGame.getPlayers());

        bGame.setDescription("two players display one of three symbols: a rock, paper, or scissors. A rock beats scissors, scissors beat paper by cutting it, and paper beats rock by covering it.");
        System.out.println(bGame.getDescription());

        System.out.println(bGame);
    }
}
