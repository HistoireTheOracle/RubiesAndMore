
package net.mcreator.rubiesandmore.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.rubiesandmore.RubiesAndMoreModElements;

@RubiesAndMoreModElements.ModElement.Tag
public class ShadiumShovelItem extends RubiesAndMoreModElements.ModElement {
	@ObjectHolder("rubies_and_more:shadium_shovel")
	public static final Item block = null;
	public ShadiumShovelItem(RubiesAndMoreModElements instance) {
		super(instance, 37);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ShovelItem(new IItemTier() {
			public int getMaxUses() {
				return 660;
			}

			public float getEfficiency() {
				return 9f;
			}

			public float getAttackDamage() {
				return 2f;
			}

			public int getHarvestLevel() {
				return 4;
			}

			public int getEnchantability() {
				return 28;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(ShadiumIngotItem.block, (int) (1)));
			}
		}, 1, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("shadium_shovel"));
	}
}
