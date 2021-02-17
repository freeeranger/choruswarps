package com.freeranger.choruswarps.core;

import com.freeranger.choruswarps.blocks.EnderLinkBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final RegistryObject<Block> ENDER_LINK = register("ender_link", () ->
            new EnderLinkBlock(AbstractBlock.Properties.create(Material.GLASS)
            .hardnessAndResistance(10, 30)
            .harvestLevel(2)
            .setRequiresTool()
            .harvestTool(ToolType.PICKAXE)
            .sound(SoundType.GLASS))
            , ItemGroup.MISC
    );

    static void register(){

    }

    private static<T extends Block> RegistryObject<T> register(String name, Supplier<T> block, ItemGroup group){
        RegistryObject<T> ret = Registration.BLOCKS.register(name, block);
        Registration.ITEMS.register(name, () -> new BlockItem(ret.get(), new Item.Properties().group(group)));
        return ret;
    }
}
