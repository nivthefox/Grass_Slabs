
package com.kuraion.grassslabs.block;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.storage.loot.LootContext;

import java.util.Collections;
import java.util.List;

public class DirtPathStairsBlock extends StairBlock {
    public DirtPathStairsBlock() {
        super(() -> new Block(Properties.of(Material.DIRT).sound(SoundType.GRASS).strength(0.5f, 0.5f).lightLevel(s -> 0).dynamicShape())
                        .defaultBlockState(),
                Properties.of(Material.DIRT).sound(SoundType.GRASS).strength(0.5f, 0.5f).lightLevel(s -> 0).dynamicShape());
    }

    @Override
    public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
        List<ItemStack> dropsOriginal = super.getDrops(state, builder);
        if (!dropsOriginal.isEmpty())
            return dropsOriginal;
        return Collections.singletonList(new ItemStack(this, 1));
    }
}
