package net.mhaks.dustydecorations.item;

import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties RAW_BRATWURST = new FoodProperties.Builder().nutrition(2).saturationModifier(0.3F).build();
    public static final FoodProperties SMOKED_BRATWURST = new FoodProperties.Builder().nutrition(4).saturationModifier(0.45F).build();
    public static final FoodProperties BRATWURST_HOT_DOG = new FoodProperties.Builder().nutrition(5).saturationModifier(0.6F).build();
}
