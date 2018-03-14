package com.uni.aisopp.artemistutorial.artemis.components;

import android.graphics.Bitmap;

import com.artemis.Component;

/**
 *
 * Created by AIsopp on 14.03.2018.
 */

public class SpriteComponent extends Component {
    private Bitmap sprite;


    public Bitmap getSprite() {
        return sprite;
    }

    public void setSprite(Bitmap sprite) {
        this.sprite = sprite;
    }
}
