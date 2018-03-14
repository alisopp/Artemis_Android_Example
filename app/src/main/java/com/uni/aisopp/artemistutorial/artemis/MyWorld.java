package com.uni.aisopp.artemistutorial.artemis;

import com.artemis.World;
import com.artemis.WorldConfiguration;
import com.artemis.WorldConfigurationBuilder;
import com.uni.aisopp.artemistutorial.artemis.systems.MovingSystem;
import com.uni.aisopp.artemistutorial.artemis.systems.RendererSystem;
import com.uni.aisopp.artemistutorial.views.Board;

/**
 *
 * Created by AIsopp on 13.03.2018.
 */

public class MyWorld extends World{


    public static MyWorld createNewWorld(Board board){
        WorldConfiguration configuration = new WorldConfigurationBuilder().with(new RendererSystem(board), new MovingSystem()).build();//dependsOn(MyPlugin.class).
        return new MyWorld(configuration);
    }


    private MyWorld(WorldConfiguration configuration) {
        super(configuration);
    }

}
