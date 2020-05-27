
package com.jmod.tdcaorsngs.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;

import com.jmod.tdcaorsngs.TdcaorSongsModElements;

@TdcaorSongsModElements.ModElement.Tag
public class SongOfThraItem extends TdcaorSongsModElements.ModElement {
	@ObjectHolder("tdcaor_songs:song_of_thra")
	public static final Item block = null;
	public SongOfThraItem(TdcaorSongsModElements instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}
	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, TdcaorSongsModElements.sounds.get(new ResourceLocation("tdcaor_songs:song_of_thra")),
					new Item.Properties().group(ItemGroup.MISC).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("song_of_thra");
		}

		@Override
		@OnlyIn(Dist.CLIENT)
		public boolean hasEffect(ItemStack itemstack) {
			return true;
		}
	}
}
