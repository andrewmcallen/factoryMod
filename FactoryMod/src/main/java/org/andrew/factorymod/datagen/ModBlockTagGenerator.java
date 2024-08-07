package org.andrew.factorymod.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.andrew.factorymod.Factorymod;
import org.andrew.factorymod.blocks.ModBlocks;
import org.andrew.factorymod.util.ModTags;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {

    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, Factorymod.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {

        this.tag(ModTags.Blocks.METAL_DETECTOR_VALUABLES)
                .add(ModBlocks.TIN_DEEPSLATE_ORE.get())
                .add(ModBlocks.TIN_ORE.get())
                .add(ModBlocks.DEEPSLATE_MINER_CRYSTAL_ORE.get())
                .addTag(Tags.Blocks.ORES);

        this.tag(BlockTags.WALLS)
                .add(ModBlocks.STEEL_WALL.get());

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.TIN_ORE.get())
                .add(ModBlocks.TIN_DEEPSLATE_ORE.get())
                .add(ModBlocks.STEEL_BLOCK.get())
                .add(ModBlocks.TIN_BLOCK.get());

        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.TIN_ORE.get())
                .add(ModBlocks.TIN_DEEPSLATE_ORE.get());

    }
}
