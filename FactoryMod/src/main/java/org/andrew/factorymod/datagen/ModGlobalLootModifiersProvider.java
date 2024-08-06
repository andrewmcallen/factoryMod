package org.andrew.factorymod.datagen;

import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.GlobalLootModifierProvider;
import org.andrew.factorymod.Factorymod;

public class ModGlobalLootModifiersProvider extends GlobalLootModifierProvider {
    public ModGlobalLootModifiersProvider(PackOutput output) {
        super(output, Factorymod.MODID);
    }

    @Override
    protected void start() {

        //Modifiers goes here. Look at Git for Example

    }
}
