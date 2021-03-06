package growthcraft.bees.common.item;

import growthcraft.bees.GrowthCraftBees;
import growthcraft.core.common.item.GrcItemFoodBase;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Items;

public class ItemHoneyJar extends GrcItemFoodBase
{
	public ItemHoneyJar()
	{
		super(6, false);
		this.setUnlocalizedName("grc.honeyJar");
		this.setCreativeTab(GrowthCraftBees.tab);
		this.setContainerItem(Items.flower_pot);
		this.setMaxStackSize(1);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister reg)
	{
		this.itemIcon = reg.registerIcon("grcbees:honeyjar");
	}
}
