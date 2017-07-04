package com.example.grahambruce.rockpaperscissorsandroid;

import java.util.Random;

import Behaviours.Move;

/**
 * Created by grahambruce on 04/07/2017.
 */

public class Computer {

    private Move move;

    public Computer() {
        setMoveRandom();
    }

    public void setMoveRandom() {
        Move[] moves = Move.values();
        Random random = new Random();
        int index = random.nextInt(moves.length);
        setMove(moves[index]);

    }

    public Move getMove() {
        return this.move;
    }

    public void setMove(Move move) {
        this.move = move;
    }

    public String getMoveString(){
        return this.move.getType();
    }
}

