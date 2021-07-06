
package net.mcreator.rubiesandmore.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.rubiesandmore.itemgroup.TestcreativetabItemGroup;
import net.mcreator.rubiesandmore.block.RubyBlockBlock;
import net.mcreator.rubiesandmore.RubiesAndMoreModElements;

@RubiesAndMoreModElements.ModElement.Tag
public class CrescentRoseItem extends RubiesAndMoreModElements.ModElement {
	@ObjectHolder("rubies_and_more:crescent_rose")
	public static final Item block = null;
	public CrescentRoseItem(RubiesAndMoreModElements instance) {
		super(instance, 24);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 5648;
			}

			public float getEfficiency() {
				return 6f;
			}

			public float getAttackDamage() {
				return 10f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 25;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(RubyBlockBlock.block, (int) (1)));
			}
		}, 3, -3.1f, new Item.Properties().group(TestcreativetabItemGroup.tab).isImmuneToFire()) {
		}.setRegistryName("crescent_rose"));
	}
}
