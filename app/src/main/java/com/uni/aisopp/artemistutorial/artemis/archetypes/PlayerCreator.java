package com.uni.aisopp.artemistutorial.artemis.archetypes;

import android.content.Context;
import android.graphics.BitmapFactory;

import com.artemis.Archetype;
import com.artemis.ArchetypeBuilder;
import com.artemis.Entity;
import com.uni.aisopp.artemistutorial.artemis.MyWorld;
import com.uni.aisopp.artemistutorial.R;
import com.uni.aisopp.artemistutorial.artemis.components.PositionComponent;
import com.uni.aisopp.artemistutorial.artemis.components.SpriteComponent;
import com.uni.aisopp.artemistutorial.utils.Vector2;

/**
 * Created by AIsopp on 14.03.2018.
 *
 */

public class PlayerCreator {

    private Archetype archetype;
    private MyWorld world;
    private Context context;

    public PlayerCreator(MyWorld world, Context context){
        this.world = world;
        ArchetypeBuilder builder = new ArchetypeBuilder().add(SpriteComponent.class).add(PositionComponent.class);
        archetype = builder.build(world);
        this.context = context;
    }

    public Entity createPlayer( Vector2 position) {
        Entity player = world.createEntity(archetype);
        player.getComponent(SpriteComponent.class).setSprite(BitmapFactory.decodeResource(context.getResources(), R.drawable.player));
        player.getComponent(PositionComponent.class).setPos(position);
        return player;
    }
}
