
package net.mcreator.rubiesfordummies.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.HoeItem;

import net.mcreator.rubiesfordummies.itemgroup.TestcreativetabItemGroup;
import net.mcreator.rubiesfordummies.RubiesForDummiesModElements;

@RubiesForDummiesModElements.ModElement.Tag
public class RubyHoeItem extends RubiesForDummiesModElements.ModElement {
	@ObjectHolder("rubies_for_dummies:ruby_hoe")
	public static final Item block = null;
	public RubyHoeItem(RubiesForDummiesModElements instance) {
		super(instance, 11);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 1057;
			}

			public float getEfficiency() {
				return 11f;
			}

			public float getAttackDamage() {
				return 4f;
			}

			public int getHarvestLevel() {
				return 6;
			}

			public int getEnchantability() {
				return 39;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(RubyItem.block, (int) (1)));
			}
		}, 0, -3f, new Item.Properties().group(TestcreativetabItemGroup.tab)) {
		}.setRegistryName("ruby_hoe"));
	}
}
