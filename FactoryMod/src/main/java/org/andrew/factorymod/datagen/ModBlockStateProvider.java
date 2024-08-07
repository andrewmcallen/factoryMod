package org.andrew.factorymod.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.*;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import org.andrew.factorymod.Factorymod;
import org.andrew.factorymod.blocks.ModBlocks;

public class ModBlockStateProvider  extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, Factorymod.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {

        blockWithItem(ModBlocks.STEEL_BLOCK);
        blockWithItem(ModBlocks.TIN_BLOCK);
        blockWithItem(ModBlocks.TIN_ORE);
        blockWithItem(ModBlocks.TIN_DEEPSLATE_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_MINER_CRYSTAL_ORE);
        doorBlockWithRenderType(((DoorBlock) ModBlocks.STEEL_DOOR.get()), modLoc("block/steel_door_bottom"), modLoc("block/steel_door_top"), "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.STEEL_TRAP_DOOR.get()), modLoc("block/steel_trap_door"), true, "cutout");
        pressurePlateBlock(((PressurePlateBlock) ModBlocks.STEEL_PRESSURE_PLATE.get()), blockTexture(ModBlocks.STEEL_BLOCK.get()));
        wallBlock(((WallBlock) ModBlocks.STEEL_WALL.get()), blockTexture(ModBlocks.STEEL_BLOCK.get()));
        slabBlock(((SlabBlock) ModBlocks.STEEL_SLAB.get()), blockTexture(ModBlocks.STEEL_BLOCK.get()), blockTexture(ModBlocks.STEEL_BLOCK.get()));
        buttonBlock(((ButtonBlock) ModBlocks.STEEL_BUTTON.get()), blockTexture(ModBlocks.STEEL_BLOCK.get()));

    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }

}
