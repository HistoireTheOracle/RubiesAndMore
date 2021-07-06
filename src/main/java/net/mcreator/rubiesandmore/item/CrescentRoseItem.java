
package net.mcreator.rubiesfordummies.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.rubiesfordummies.itemgroup.TestcreativetabItemGroup;
import net.mcreator.rubiesfordummies.block.RubyBlockBlock;
import net.mcreator.rubiesfordummies.RubiesForDummiesModElements;

@RubiesForDummiesModElements.ModElement.Tag
public class CrescentRoseItem extends RubiesForDummiesModElements.ModElement {
	@ObjectHolder("rubies_for_dummies:crescent_rose")
	public static final Item block = null;
	public CrescentRoseItem(RubiesForDummiesModElements instance) {
		super(instance, 22);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 5348;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 10f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 28;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(RubyBlockBlock.block, (int) (1)));
			}
		}, 3, -3f, new Item.Properties().group(TestcreativetabItemGroup.tab).isImmuneToFire()) {
		}.setRegistryName("crescent_rose"));
	}
}
