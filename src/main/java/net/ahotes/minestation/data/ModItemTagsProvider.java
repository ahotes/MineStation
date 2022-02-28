package net.ahotes.minestation.data;

import net.ahotes.minestation.MineStationMod;
import net.ahotes.minestation.data.DataGenerators;
import net.ahotes.minestation.setup.ModItems;
import net.ahotes.minestation.setup.ModTags;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemTagsProvider extends ItemTagsProvider
{
    public ModItemTagsProvider(DataGenerator dataGenerator, BlockTagsProvider blockTagsProvider, ExistingFileHelper existingFileHelper){
        super(dataGenerator, blockTagsProvider, MineStationMod.MOD_ID, existingFileHelper);
    }

    protected void registerTags(){
        //copy(ModTags.Blocks.ORES_SILVER, ModTags.Items.ORES_SILVER);
        //copy(ModTags.Blocks.STORAGE_BLOCKS_SILVER, ModTags.Items.STORAGE_BLOCKS_SILVER);

        // getOrCreateRawBuilder(ModTags.Items.ORES_SILVER).add(ModItems.Silver_Ingot.get())
    }

}
