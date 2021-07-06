
package net.mcreator.rubiesfordummies.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.rubiesfordummies.RubiesForDummiesModElements;

@RubiesForDummiesModElements.ModElement.Tag
public class RubySwordItem extends RubiesForDummiesModElements.ModElement {
	@ObjectHolder("rubies_for_dummies:ruby_sword")
	public static final Item block = null;
	public RubySwordItem(RubiesForDummiesModElements instance) {
		super(instance, 9);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 1057;
			}

			public float getEfficiency() {
				return 11f;
			}

			public float getAttackDamage() {
				return 4.5f;
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
		}, 3, -2.5f, new Item.Properties().group(ItemGroup.COMBAT)) {
		}.setRegistryName("ruby_sword"));
	}
}
