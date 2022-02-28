package net.ahotes.minestation.data;

import net.ahotes.minestation.MineStationMod;
import net.ahotes.minestation.setup.ModTags;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockTagsProvider extends BlockTagsProvider
{
    public ModBlockTagsProvider(DataGenerator generatorIn, ExistingFileHelper existingFileHelper)
    {
        super(generatorIn, MineStationMod.MOD_ID, existingFileHelper);
    }

    //@Override
    protected void registerTags()
    {
        //getOrCreateRawBuilder(ModTags.Blocks.ORES_SILVER);
    }
}
