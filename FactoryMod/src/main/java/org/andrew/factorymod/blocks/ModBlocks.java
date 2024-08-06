package org.andrew.factorymod.blocks;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.andrew.factorymod.Factorymod;
import org.andrew.factorymod.items.ModItems;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS =
        DeferredRegister.create(ForgeRegistries.BLOCKS, Factorymod.MODID);

    //MY BLOCKS GOES HERE
    public static final RegistryObject<Block> STEEL_BLOCK = registryBlock("steel_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));

    public static final RegistryObject<Block> STEEL_DOOR_BLOCK = registryBlock("steel_door_block",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.CHAIN).noOcclusion(), BlockSetType.IRON));

    public static final RegistryObject<Block> STEEL_TRAP_DOOR = registryBlock("steel_trap_door",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.CHAIN).noOcclusion(), BlockSetType.IRON));

    public static final RegistryObject<Block> STEEL_SLAB = registryBlock("steel_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CUT_COPPER_SLAB)));

    public static final RegistryObject<Block> STEEL_BUTTON = registryBlock("steel_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).sound(SoundType.CHAIN),
                    BlockSetType.IRON, 10, true));

    public static final RegistryObject<Block> STEEL_PRESSURE_PLATE = registryBlock("steel_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.CHAIN),
                    BlockSetType.IRON));

    public static final RegistryObject<Block> STEEL_WALL = registryBlock("steel_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).sound(SoundType.CHAIN)));


    //Init
    public static <T extends Block>RegistryObject<T> registryBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        return toReturn;
    }

    public static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, ()-> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
