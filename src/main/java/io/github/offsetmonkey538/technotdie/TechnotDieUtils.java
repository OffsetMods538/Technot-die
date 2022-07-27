package io.github.offsetmonkey538.technotdie;


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
}
