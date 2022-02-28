package net.ahotes.minestation.setup;

import net.ahotes.minestation.MineStationMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.Tag;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags
{
    public static final class Blocks
    {
        public static final Tag.Named<Block> ORES_SILVER = forge("ores/silver");
        public static final Tag.Named<Block> STORAGE_BLOCKS_SILVER = forge("storage_blocks/silver");

        private static Tag.Named<Block> forge(String path)
        {
            return BlockTags.makeWrapperTag(new ResourceLocation("forge", path).toString());
        }

        private static Tag.Named<Block> mod(String path)
        {
            return BlockTags.makeWrapperTag(new ResourceLocation(MineStationMod.MOD_ID, path).toString());
        }
    }

    public static final class Items
    {
        public static final Tag.Named<Item> ORES_SILVER = forge("ores/silver");
        public static final Tag.Named<Item> STORAGE_BLOCKS_SILVER = forge("storage_blocks/silver");

        private static Tag.Named<Item> forge(String path)
        {
            return ItemTags.makeWrapperTag;
        }

        private static Tag.Named<Item> mod(String path)
        {
            return ItemTags.makeWrapperTag(new ResourceLocation(MineStationMod.MOD_ID, path).toString());
        }
    }
}
