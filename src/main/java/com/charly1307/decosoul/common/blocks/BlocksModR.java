package com.charly1307.decosoul.common.blocks;

import java.util.function.Supplier;

import com.charly1307.decosoul.DecoSoulM;
import com.charly1307.decosoul.common.blocks.custom.BonfireBlock;
import com.charly1307.decosoul.common.items.ItemsModR;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlocksModR {
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
			DecoSoulM.MOD_ID);

	// All Blocks
	public static final RegistryObject<Block> BONFIRE = registerBlock("bonfire",
			() -> new BonfireBlock(
					AbstractBlock.Properties.create(Material.IRON).hardnessAndResistance(-1.0F, 3600000.0F).notSolid()
					.setLightLevel((state) -> state.get(BonfireBlock.CLICKED) ? 15 : 0), 10));

	// FIN
	private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
		RegistryObject<T> toReturn = BLOCKS.register(name, block);
		registerBlockItem(name, toReturn);
		return toReturn;
	}

	// Se registra el bloque en el Inventario?
	private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
		ItemsModR.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().group(ItemGroup.COMBAT)));
	}

	public static void register(IEventBus eventBus) {
		BLOCKS.register(eventBus);
	}

}
