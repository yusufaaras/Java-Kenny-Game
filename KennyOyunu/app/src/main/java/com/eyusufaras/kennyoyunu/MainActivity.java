package com.eyusufaras.kennyoyunu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView scoreText;
    TextView timeText;
    int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        timeText=(TextView) findViewById(R.id.timeText);
        scoreText=(TextView) findViewById(R.id.scoreText);

        score=0;

    }
    public void increaseScore(View view){           //bir görünüm tarafından çağrılacağını belirtir.

        score++;
        scoreText.setText("score: "+score);
    }
}