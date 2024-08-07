package org.andrew.factorymod.datagen.loot;

import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.registries.RegistryObject;
import org.andrew.factorymod.blocks.ModBlocks;
import org.andrew.factorymod.items.ModItems;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {

        //LootTables goes here
        this.dropSelf(ModBlocks.STEEL_BLOCK.get());
        this.dropSelf(ModBlocks.STEEL_TRAP_DOOR.get());
        this.dropSelf(ModBlocks.STEEL_BUTTON.get());
        this.dropSelf(ModBlocks.STEEL_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.STEEL_WALL.get());
        this.dropSelf(ModBlocks.TIN_BLOCK.get());


        this.add(ModBlocks.STEEL_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.STEEL_SLAB.get()));

        this.add(ModBlocks.STEEL_DOOR.get(),
                block -> createDoorTable(ModBlocks.STEEL_DOOR.get()));

        //ORES
        this.add(ModBlocks.TIN_ORE.get(),
                block -> createLikeCopperOreDrops(ModBlocks.TIN_ORE.get(), ModItems.RAW_TIN.get()));

        this.add(ModBlocks.TIN_DEEPSLATE_ORE.get(),
                block -> createLikeCopperOreDrops(ModBlocks.TIN_DEEPSLATE_ORE.get(), ModItems.RAW_TIN.get()));

        this.add(ModBlocks.DEEPSLATE_MINER_CRYSTAL_ORE.get(),
                block -> createLikeEmeraldOreDrops(ModBlocks.DEEPSLATE_MINER_CRYSTAL_ORE.get(), ModItems.MINER_CRYSTAL.get()));

    }

    protected LootTable.Builder createLikeCopperOreDrops(Block pBlock, Item item) {
        return createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(pBlock,
                        LootItem.lootTableItem(item)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(2.0f, 5.0f)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))));
    }

    protected LootTable.Builder createLikeEmeraldOreDrops(Block pBlock, Item item) {
        return createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(pBlock,
                        LootItem.lootTableItem(item)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0f, 1.0f)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
