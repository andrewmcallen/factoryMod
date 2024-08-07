package org.andrew.factorymod.items;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.andrew.factorymod.Factorymod;
import org.andrew.factorymod.items.custom.MetalDetectorItem;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Factorymod.MODID);

    //Wrench
    public static final RegistryObject<Item> WRENCH = ITEMS.register("wrench",
            () -> new Item(new Item.Properties()));

    //Ingots & Raw Ores
    public static final RegistryObject<Item> RAW_TIN = ITEMS.register("raw_tin",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TIN_INGOT = ITEMS.register("tin_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> MINER_CRYSTAL = ITEMS.register("miner_crystal",
            ()-> new Item(new Item.Properties()));

    //CUSTOM ITEMS
    public static final RegistryObject<Item> METAL_DETECTOR = ITEMS.register("metal_detector",
            () -> new MetalDetectorItem(new Item.Properties().stacksTo(1).durability(1000)));


    //eventBus
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
