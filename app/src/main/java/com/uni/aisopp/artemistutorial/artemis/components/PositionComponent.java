package com.uni.aisopp.artemistutorial.artemis.components;

import com.artemis.Component;
import com.uni.aisopp.artemistutorial.utils.Vector2;

/**
 * Created by AIsop on 14.03.2018.
 */

public class PositionComponent extends Component{
    private Vector2 pos;

    public Vector2 getPos() {
        return pos;
    }

    public void setPos(Vector2 pos) {
        this.pos = pos;
    }
}
