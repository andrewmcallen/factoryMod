package org.andrew.factorymod.items.custom;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegisterEvent;
import net.minecraftforge.registries.RegistryObject;
import org.andrew.factorymod.Factorymod;
import org.andrew.factorymod.blocks.ModBlocks;
import org.andrew.factorymod.items.ModItems;

public class ModCreativeModeTab {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Factorymod.MODID);

    public static final RegistryObject<CreativeModeTab> INDUSTRIAL_TAB = CREATIVE_MODE_TABS.register("industrial_tab",
            ()-> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.WRENCH.get()))
                    .title(Component.translatable("creativetab.industrial_tab"))
                    .displayItems((pParameters, pOutput) -> {

                        //ITEMS
                        pOutput.accept(ModItems.WRENCH.get());

                        //BLOCKS
                        pOutput.accept(ModBlocks.STEEL_BLOCK.get());
                        pOutput.accept(ModBlocks.STEEL_DOOR_BLOCK.get());
                        pOutput.accept(ModBlocks.STEEL_SLAB.get());
                        pOutput.accept(ModBlocks.STEEL_WALL.get());
                        pOutput.accept(ModBlocks.STEEL_BUTTON.get());
                        pOutput.accept(ModBlocks.STEEL_PRESSURE_PLATE.get());
                        pOutput.accept(ModBlocks.STEEL_TRAP_DOOR.get());

                        //ENTITIES

                        //ETC

                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
