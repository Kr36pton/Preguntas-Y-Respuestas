package com.company;

public class Round {
    private int roundNumber;
    private int roundPoints;
    private boolean roundAnswer;
    private boolean roundStarter;

    public Round(){}

    public Round(int roundNumber, int roundPoints, boolean roundAnswer) {
        this.roundNumber = roundNumber;
        this.roundPoints = roundPoints;
        this.roundAnswer = roundAnswer;
        this.roundStarter = roundStarter;
    }

    public int getRoundNumber() {
        return roundNumber;
    }

    public void setRoundNumber(int roundNumber) {
        this.roundNumber = roundNumber;
    }

    public int getRoundPoints() {
        return roundPoints;
    }

    public void setRoundPoints(int roundPoints) {
        this.roundPoints = roundPoints;
    }

    public boolean isRoundAnswer() {
        return roundAnswer;
    }

    public void setRoundAnswer(boolean roundAnswer) {
        this.roundAnswer = roundAnswer;
    }

    public boolean isRoundStarter() { return roundStarter; }

    public void setRoundStarter(boolean roundStarter) { this.roundStarter = roundStarter; }


    public void gameStart(){
        if(roundStarter){
            System.out.println("EMPIEZA EL JUEGO");
        }
    }
}

