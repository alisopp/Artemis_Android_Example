package com.uni.aisopp.artemistutorial.artemis.systems;

import com.artemis.Aspect;
import com.artemis.ComponentMapper;
import com.artemis.systems.IteratingSystem;
import com.uni.aisopp.artemistutorial.artemis.components.PositionComponent;

/**
 * Created by AIsopp on 14.03.2018.
 *
 */

public class MovingSystem extends IteratingSystem {

    protected ComponentMapper<PositionComponent> mPositionComponent;

    /**
     * Creates a new EntityProcessingSystem.
     *
     */
    public MovingSystem() {
        super(Aspect.all(PositionComponent.class));
    }

    @Override
    protected void process(int entityId) {
        PositionComponent positionComponent = mPositionComponent.get(entityId);
        positionComponent.getPos().addX(1);
    }
}
