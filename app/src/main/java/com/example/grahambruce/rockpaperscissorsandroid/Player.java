package com.example.grahambruce.rockpaperscissorsandroid;

import Behaviours.Move;

/**
 * Created by grahambruce on 04/07/2017.
 */

public class Player {

    private Move move;

    public void setMove(Move move){
        this.move = move;
    }

    public Move getMove() {
        return move;
    }
}
