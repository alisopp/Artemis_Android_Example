package com.uni.aisopp.artemistutorial;

import android.content.Context;
import android.os.AsyncTask;

import com.uni.aisopp.artemistutorial.artemis.MyWorld;
import com.uni.aisopp.artemistutorial.artemis.archetypes.PlayerCreator;
import com.uni.aisopp.artemistutorial.utils.Vector2;
import com.uni.aisopp.artemistutorial.views.Board;

/**
 *
 * Created by AIsopp on 14.03.2018.
 */

public class MainLoop extends AsyncTask<String,Double,String> {
    private boolean isFinished;
    private boolean isPause;
    private MyWorld world;
    private float lastDelta;
    private PlayerCreator playerCreator;


    public MainLoop(Context context, Board board){
        isFinished = false;
        isPause = false;
        world = MyWorld.createNewWorld(board);
        playerCreator = new PlayerCreator(world, context);
    }


    @Override
    protected String doInBackground(String... strings) {

        while (!isFinished){
            while (isPause){
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            try {
                Thread.sleep(17);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            onProgressUpdate();
        }
        return null;
    }


    public void finish(){
        isFinished = true;
    }

    public void setPause(boolean isPause){
        this.isPause = isPause;
    }

    public void addEntity(){
        playerCreator.createPlayer(new Vector2(75,50));
    }


    @Override
    protected void onProgressUpdate(Double... values) {
        float currentDelta = System.currentTimeMillis() - lastDelta;
        super.onProgressUpdate(values);
        world.setDelta(currentDelta);
        world.process();
        lastDelta = System.currentTimeMillis();
    }
}
