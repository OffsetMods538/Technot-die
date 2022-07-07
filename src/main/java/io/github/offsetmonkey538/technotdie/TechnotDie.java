package io.github.offsetmonkey538.technotdie;


import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.PigEntity;

public class TechnotDie {

    public static boolean isTechnoPig(Object entity) {
        return entity instanceof PigEntity pig && (pig.getCustomName() != null && pig.getCustomName().getString().equals("Technoblade"));
    }
}
