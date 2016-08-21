package growthcraft.cellar.client;

import growthcraft.cellar.client.gui.GuiBrewKettle;
import growthcraft.cellar.client.gui.GuiCultureJar;
import growthcraft.cellar.client.gui.GuiFermentBarrel;
import growthcraft.cellar.client.gui.GuiFruitPress;
import growthcraft.cellar.client.render.item.ItemRenderCultureJar;
import growthcraft.cellar.client.render.RenderBrewKettle;
import growthcraft.cellar.client.render.RenderCultureJar;
import growthcraft.cellar.client.render.RenderFermentBarrel;
import growthcraft.cellar.client.render.RenderFruitPress;
import growthcraft.cellar.client.render.RenderFruitPresser;
import growthcraft.cellar.client.renderer.TileEntityCultureJarRenderer;
import growthcraft.cellar.client.renderer.TileEntityFruitPresserRenderer;
import growthcraft.cellar.client.resource.GrcCellarResources;
import growthcraft.cellar.common.CommonProxy;
import growthcraft.cellar.common.tileentity.TileEntityCultureJar;
import growthcraft.cellar.common.tileentity.TileEntityFruitPresser;
import growthcraft.cellar.GrowthCraftCellar;

import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.registry.VillagerRegistry;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.MinecraftForgeClient;

public class ClientProxy extends CommonProxy
{
	public void initRenders()
	{
		MinecraftForgeClient.registerItemRenderer(GrowthCraftCellar.blocks.cultureJar.getItem(), new ItemRenderCultureJar());
		RenderingRegistry.registerBlockHandler(new RenderBrewKettle());
		RenderingRegistry.registerBlockHandler(new RenderCultureJar());
		RenderingRegistry.registerBlockHandler(new RenderFermentBarrel());
		RenderingRegistry.registerBlockHandler(new RenderFruitPress());
		RenderingRegistry.registerBlockHandler(new RenderFruitPresser());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFruitPresser.class, new TileEntityFruitPresserRenderer());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityCultureJar.class, new TileEntityCultureJarRenderer());
	}

	public void registerVillagerSkin()
	{
		final int brewerID = GrowthCraftCellar.getConfig().villagerBrewerID;
		if (brewerID > 0)
		{
			VillagerRegistry.instance().registerVillagerSkin(brewerID, new ResourceLocation("grccellar" , "textures/entity/brewer.png"));
		}
	}

	public void init()
	{
		new GrcCellarResources();
		initRenders();
		registerVillagerSkin();
		GrowthCraftCellar.guiProvider.register("grccellar:fruit_press", GuiFruitPress.class);
		GrowthCraftCellar.guiProvider.register("grccellar:ferment_barrel", GuiFermentBarrel.class);
		GrowthCraftCellar.guiProvider.register("grccellar:culture_jar", GuiCultureJar.class);
		GrowthCraftCellar.guiProvider.register("grccellar:brew_kettle", GuiBrewKettle.class);
	}
}
