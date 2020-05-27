
package com.jmod.tdcaorsngs.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import com.jmod.tdcaorsngs.TdcaorSongsModElements;

@TdcaorSongsModElements.ModElement.Tag
public class TheDarkCrystalMusicItemGroup extends TdcaorSongsModElements.ModElement {
	public TheDarkCrystalMusicItemGroup(TdcaorSongsModElements instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabthe_dark_crystal_music") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(Items.MUSIC_DISC_MALL, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
