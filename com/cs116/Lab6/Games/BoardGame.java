package com.cs116.Lab6.Games;

public class BoardGame extends Game {
    private int players;
    private boolean tie;

    public BoardGame(String description, int players, boolean tie) {
        super(description);
        setPlayers(players);
        setGameCanTie(tie);
    }

    public int getPlayers() {
        return players;
    }

    public boolean getGameCanTie() {
        return tie;
    }

    public void setGameCanTie(boolean tie) {
        this.tie = tie;
    }

    public void setPlayers(int players) {
        this.players = players;
    }
    
    private String canGameEndInTie() {
        if(tie) 
            return "yes";
        else
            return "no";
    }

    public String toString() {
        return "Description: " + getDescription() + "\nPlayers: " + players + "\nCan the Game end in a tie: " + canGameEndInTie();
    }
}
