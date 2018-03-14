package com.uni.aisopp.artemistutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.uni.aisopp.artemistutorial.views.GameView;

import java.util.concurrent.Executors;

public class MainActivity extends AppCompatActivity {

    private MainLoop loop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        GameView gameView = findViewById(R.id.game_view);
        loop = new MainLoop(this, gameView);
        loop.executeOnExecutor(Executors.newSingleThreadExecutor());
    }

    @Override
    protected void onResume() {
        super.onResume();
        loop.addEntity();
    }

    @Override
    protected void onPause() {
        super.onPause();
        loop.setPause(true);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        loop.finish();
    }
}
