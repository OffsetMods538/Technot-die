package io.github.offsetmonkey538.technotdie;


import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.PigEntity;

public class TechnotDie {

    public static boolean isTechnoPig(Entity entity) {
        return entity instanceof PigEntity pig && (pig.getCustomName() != null && entity.getCustomName().getString().equals("Technoblade"));
    }
}
