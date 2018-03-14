package com.uni.aisopp.artemistutorial.artemis.systems;

import com.artemis.Aspect;
import com.artemis.ComponentMapper;
import com.artemis.systems.IteratingSystem;
import com.uni.aisopp.artemistutorial.artemis.components.PositionComponent;
import com.uni.aisopp.artemistutorial.artemis.components.SpriteComponent;
import com.uni.aisopp.artemistutorial.views.Board;

/**
 *
 * Created by AIsopp on 14.03.2018.
 */

public class RendererSystem extends IteratingSystem {

    protected ComponentMapper<SpriteComponent> mSpriteComponent;
    protected ComponentMapper<PositionComponent> mPositionComponent;

    private Board board;
    /**
     * Creates a new EntityProcessingSystem.
     *
     * @param board
     */
    public RendererSystem(Board board) {
        super(Aspect.all(SpriteComponent.class, PositionComponent.class));
        this.board = board;
    }

    @Override
    protected void process(int entityId) {
       SpriteComponent sprite = mSpriteComponent.get(entityId);
       PositionComponent position = mPositionComponent.get(entityId);
       board.render(sprite.getSprite(),position.getPos());
    }
}
