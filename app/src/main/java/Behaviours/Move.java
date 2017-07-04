package Behaviours;

/**
 * Created by grahambruce on 22/06/2017.
 */

public enum Move {
    ROCK("Rock"),
    PAPER("Paper"),
    SCISSORS("Scissors"),
    LIZARD("Lizard"),
    SPOCK("Spock");


    private String type;

    Move(String type){
        this.type = type;
    }

    public String getType(){
        return this.type;
    }
}


