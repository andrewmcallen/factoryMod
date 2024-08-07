package org.andrew.factorymod.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import org.andrew.factorymod.Factorymod;

public class ModTags {

    public static class Blocks {

        //TAGS GO HERE
        public static final TagKey<Block> METAL_DETECTOR_VALUABLES = tag("metal_detector_valuables");

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(Factorymod.MODID, name));
        }
    }

    public static class Items {

        //TAGS GO HERE


        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(Factorymod.MODID, name));
        }
    }
}
