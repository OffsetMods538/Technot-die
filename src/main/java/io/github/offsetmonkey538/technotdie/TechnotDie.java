package io.github.offsetmonkey538.technotdie;


import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.PigEntity;

public class TechnotDie {

    public static boolean isTechnoPig(Object entity) {
        if (entity instanceof PigEntity) {
            PigEntity pig = (PigEntity) entity;
            return pig.getCustomName() != null && pig.getCustomName().getString().equals("Technoblade");
        }
    }
}
