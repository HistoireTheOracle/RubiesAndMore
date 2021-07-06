
package net.mcreator.rubiesfordummies.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.rubiesfordummies.item.RubyItem;
import net.mcreator.rubiesfordummies.RubiesForDummiesModElements;

@RubiesForDummiesModElements.ModElement.Tag
public class TestcreativetabItemGroup extends RubiesForDummiesModElements.ModElement {
	public TestcreativetabItemGroup(RubiesForDummiesModElements instance) {
		super(instance, 23);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabtestcreativetab") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(RubyItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
