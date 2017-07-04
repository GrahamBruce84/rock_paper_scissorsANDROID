package com.example.grahambruce.rockpaperscissorsandroid;

/**
 * Created by grahambruce on 04/07/2017.
 */

public class Game {

    private String winner;
//    private ScoreTracker tracker;

    public Game(String playerMove, String computerMove) {
        this.winner = displayWinner(compareMoves(playerMove, computerMove));
//        this.tracker = tracker;
    }


    public int compareMoves(String playerMove, String computerMove) {
        if (playerMove.equals(computerMove)) {
            return 0;
        }
        switch (playerMove) {
            case "Rock":
                return (computerMove.equals("Scissors") || (computerMove.equals("Lizard")) ? 1 : -1);
            case "Paper":
                return (computerMove.equals("Rock") || (computerMove.equals("Spock")) ? 1 : -1);
            case "Scissors":
                return (computerMove.equals("Paper") || (computerMove.equals("Lizard")) ? 1 : -1);
            case "Lizard":
                return (computerMove.equals("Spock") || (computerMove.equals("Paper")) ? 1 : -1);
            case "Spock":
                return (computerMove.equals("Rock") || (computerMove.equals("Scissors")) ? 1 : -1);
            default:
                return 0;
        }
    }

    public String displayWinner(int result) {
        switch (result) {
            case 0:
//                this.tracker.setDraw();
                return "It's a draw!";
            case 1:
//                this.tracker.playerWin();
                return "Player wins!";
            case -1:
//                this.tracker.ComputerWin();
                return "Computer wins!";
        }
        return null;
    }

    public String getWinner() {
        return this.winner;
    }


}
