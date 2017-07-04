package com.example.grahambruce.rockpaperscissorsandroid;

/**
 * Created by grahambruce on 04/07/2017.
 */

public class ScoreTracker {

    int playerScore;
    int computerScore;
    int drawScore;

    public ScoreTracker(){
        this.playerScore = 0;
        this.computerScore = 0;
        this.drawScore = 0;
    }

    public int getPlayerScore() {
        return playerScore;
    }

    public int getComputerScore() {
        return computerScore;
    }

    public int getDrawScore() {
        return drawScore;
    }

    public void playerWin() {
        this.playerScore ++;
    }

    public void ComputerWin() {
        this.computerScore ++;
    }

    public void setDraw() {
        this.drawScore ++;
    }


}
