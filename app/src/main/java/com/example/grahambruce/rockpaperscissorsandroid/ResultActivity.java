package com.example.grahambruce.rockpaperscissorsandroid;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    TextView playerView;
    TextView computerView;
    TextView winnerView;
    Computer computer;
    Game game;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        playerView = (TextView)findViewById(R.id.player_view);
        computerView = (TextView)findViewById(R.id.computer_view);
        winnerView = (TextView)findViewById(R.id.winner_view);
        computer = new Computer();


        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        String playerMove = extras.getString("move");
        game = new Game(playerMove, computer.getMoveString());
        playerView.setText("You Played: " + playerMove);
        computerView.setText("Computer Played: " + computer.getMoveString());
        winnerView.setText(game.getWinner());
    }

    public void backToStartButtonClicked(View button){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}

