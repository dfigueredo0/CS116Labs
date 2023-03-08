package com.cs116.Lab6.Games;

public class SportsGame extends Game{
    private boolean teamSport;
    private boolean tie;

    public SportsGame(String description, boolean teamSport, boolean tie) {
        super(description);
        setTypeOfSport(teamSport);
        setGameCanTie(tie);
    }

    public boolean getTeamSport() {
        return teamSport;
    }

    public boolean getGameCanTie() {
        return tie;
    }

    public void setTypeOfSport(boolean teamSport) {
        this.teamSport = teamSport;
    }

    public void setGameCanTie(boolean tie) {
        this.tie = tie;
    }

    private String isIndividual() {
        if(!(teamSport)) 
            return "yes";
        else
            return "no";
    }

    private String canGameEndInTie() {
        if(tie) 
            return "yes";
        else
            return "no";
    }

    public String toString() {
        return "Description: " + getDescription() + "\nIs the Game a team sport: " + isIndividual() + "\nCan the game end in a tie: " + canGameEndInTie();
    }
    
}
