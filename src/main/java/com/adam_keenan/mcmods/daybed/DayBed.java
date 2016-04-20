package com.adam_keenan.mcmods.daybed;

import com.adam_keenan.mcmods.daybed.blocks.DaybedBlock;
import com.adam_keenan.mcmods.daybed.items.DaybedItem;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

@Mod(modid = DayBed.MODID, version = DayBed.VERSION)
public class DayBed
{
    public static final String MODID = "daybed";
    public static final String VERSION = "1.7.10-0.0.0.1";

    public static Block bedBlock;
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        bedBlock = new DaybedBlock()
            .setBlockName("daybed")
            .setHardness(2.0f)
            .setStepSound(Block.soundTypeCloth);
        GameRegistry.registerBlock(bedBlock, "daybed_block");
        DaybedItem bed = new DaybedItem();
        GameRegistry.registerItem(bed, "daybed_item");
        LanguageRegistry.addName(bed, "DAYBeD!");
        LanguageRegistry.addName(bedBlock, "DAYBeD BLuCK!");
        GameRegistry.addRecipe(new ItemStack(bed, 1),
            "SSS",
            "SSS",
            "   ",
            'S', Items.stick);
    }
}
