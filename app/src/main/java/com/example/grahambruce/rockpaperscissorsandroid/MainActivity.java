package com.example.grahambruce.rockpaperscissorsandroid;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import Behaviours.Move;

public class MainActivity extends AppCompatActivity {

    Button rockButton;
    Button paperButton;
    Button scissorsButton;
    Button lizardButton;
    Button spockButton;
    Player player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rockButton = (Button) findViewById(R.id.rock_button);
        paperButton = (Button) findViewById(R.id.paper_button);
        scissorsButton = (Button) findViewById(R.id.scissors_button);
        lizardButton = (Button) findViewById(R.id.Lizard_button);
        spockButton = (Button) findViewById(R.id.spock_button);
        player = new Player();
    }

    public void onMoveClicked(View button) {

        Intent intent = new Intent(this, ResultActivity.class);
        if (button == rockButton) {
            player.setMove(Move.ROCK);
        } else if (button == paperButton) {
            player.setMove(Move.PAPER);
        } else if (button == scissorsButton) {
            player.setMove(Move.SCISSORS);
        }else if (button == lizardButton){
            player.setMove(Move.LIZARD);
        }else if (button == spockButton){
            player.setMove(Move.SPOCK);
        }
        intent.putExtra("move", player.getMove().getType());
        this.startActivity(intent);
    }
}
