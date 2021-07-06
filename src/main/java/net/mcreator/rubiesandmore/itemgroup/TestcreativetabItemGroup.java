
package net.mcreator.rubiesandmore.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.rubiesandmore.item.RubyItem;
import net.mcreator.rubiesandmore.RubiesAndMoreModElements;

@RubiesAndMoreModElements.ModElement.Tag
public class TestcreativetabItemGroup extends RubiesAndMoreModElements.ModElement {
	public TestcreativetabItemGroup(RubiesAndMoreModElements instance) {
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
