package org.andrew.factorymod.items;


import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import org.andrew.factorymod.Factorymod;
import org.andrew.factorymod.blocks.ModBlocks;

public class ModCreativeModeTab {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Factorymod.MODID);

    public static final RegistryObject<CreativeModeTab> INDUSTRIAL_TAB = CREATIVE_MODE_TABS.register("industrial_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.WRENCH.get()))
                    .title(Component.translatable("creativetab.industrial_tab"))
                    .displayItems((itemDisplayParameters, output) -> {

                        //ITEMS
                        output.accept(ModItems.WRENCH.get());
                        output.accept(ModItems.RAW_TIN.get());
                        output.accept(ModItems.STEEL_INGOT.get());
                        output.accept(ModItems.TIN_INGOT.get());
                        output.accept(ModItems.METAL_DETECTOR.get());
                        output.accept(ModItems.MINER_CRYSTAL.get());

                        //BLOCKS
                        output.accept(ModBlocks.STEEL_BLOCK.get());
                        output.accept(ModBlocks.STEEL_DOOR.get());
                        output.accept(ModBlocks.STEEL_SLAB.get());
                        output.accept(ModBlocks.STEEL_WALL.get());
                        output.accept(ModBlocks.STEEL_BUTTON.get());
                        output.accept(ModBlocks.STEEL_PRESSURE_PLATE.get());
                        output.accept(ModBlocks.STEEL_TRAP_DOOR.get());
                        output.accept(ModBlocks.TIN_BLOCK.get());
                        output.accept(ModBlocks.TIN_ORE.get());
                        output.accept(ModBlocks.TIN_DEEPSLATE_ORE.get());
                        output.accept(ModBlocks.DEEPSLATE_MINER_CRYSTAL_ORE.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }



}