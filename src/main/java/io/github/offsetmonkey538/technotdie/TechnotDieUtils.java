package io.github.offsetmonkey538.technotdie;


import net.minecraft.entity.mob.ZombifiedPiglinEntity;
import net.minecraft.entity.passive.PigEntity;
import net.minecraft.text.Text;

public class TechnotDieUtils {

    public static boolean isTechnoPig(Object entity) {
        if (entity instanceof PigEntity) {
            PigEntity pig = (PigEntity) entity;
            Text name = pig.getCustomName();
            return name != null && name.getString().equals("Technoblade");
        }
        return false;
    }

    public static boolean isZombifiedTechnoPiglin(Object entity) {
        if (entity instanceof ZombifiedPiglinEntity) {
            ZombifiedPiglinEntity zombifiedPiglin = (ZombifiedPiglinEntity) entity;
            Text name = zombifiedPiglin.getCustomName();
            return name != null && name.getString().equals("Technoblade");
        }
        return false;
    }
}
