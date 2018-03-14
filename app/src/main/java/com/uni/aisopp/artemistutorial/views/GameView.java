package com.uni.aisopp.artemistutorial.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

import com.uni.aisopp.artemistutorial.utils.Vector2;
import com.uni.aisopp.artemistutorial.views.Board;

/**
 * Created by AIsopp on 14.03.2018.
 *
 */

public class GameView extends SurfaceView implements  Board{

    //These objects will be used for drawing
    private Paint paint;
    private SurfaceHolder surfaceHolder;

    public GameView(Context context) {
        super(context);
        init();
    }

    public GameView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    private void init(){
        //initializing drawing objects
        surfaceHolder = getHolder();
        paint = new Paint();
    }

    @Override
    public void render(Bitmap bitmap, Vector2 vector2) {
        if (surfaceHolder.getSurface().isValid()) {
            //locking the canvas
            Canvas canvas = surfaceHolder.lockCanvas();
            //drawing a background color for canvas
            canvas.drawColor(Color.BLACK);
            //Drawing the player
            canvas.drawBitmap(
                    bitmap,
                    vector2.getX(),
                    vector2.getY(),
                    paint);
            //Unlocking the canvas
            surfaceHolder.unlockCanvasAndPost(canvas);
        }
    }
}
