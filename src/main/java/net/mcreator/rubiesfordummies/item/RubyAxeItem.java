
package net.mcreator.rubiesfordummies.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;

import net.mcreator.rubiesfordummies.itemgroup.TestcreativetabItemGroup;
import net.mcreator.rubiesfordummies.RubiesForDummiesModElements;

@RubiesForDummiesModElements.ModElement.Tag
public class RubyAxeItem extends RubiesForDummiesModElements.ModElement {
	@ObjectHolder("rubies_for_dummies:ruby_axe")
	public static final Item block = null;
	public RubyAxeItem(RubiesForDummiesModElements instance) {
		super(instance, 8);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 1057;
			}

			public float getEfficiency() {
				return 11f;
			}

			public float getAttackDamage() {
				return 7.5f;
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
		}, 1, -3.2000000000000001f, new Item.Properties().group(TestcreativetabItemGroup.tab)) {
		}.setRegistryName("ruby_axe"));
	}
}
