package com.charly1307.decosoul.common.items;

import com.charly1307.decosoul.DecoSoulM;
import com.charly1307.decosoul.common.entity.EntityTypesModR;
import com.charly1307.decosoul.common.items.custom.EstusFlask;
import com.charly1307.decosoul.common.items.custom.FireSwords;
import com.charly1307.decosoul.common.items.custom.LifeGem;
import com.charly1307.decosoul.common.items.custom.LightningSpear;
import com.charly1307.decosoul.common.items.custom.LingeringFlame;
import com.charly1307.decosoul.common.items.custom.LightningSwords;
import com.charly1307.decosoul.common.items.custom.ModSpawnEggItem;
import com.charly1307.decosoul.common.items.custom.PoisonSwords;
import com.charly1307.decosoul.common.items.custom.Souls;

import net.minecraft.item.GlassBottleItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemTier;
import net.minecraft.item.Rarity;
import net.minecraft.item.SwordItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

/* DecoSouls Mod
 * @author Charly1307
 * @version 1.16.5-1.0
 * Stats no equilibradas para PVP
 */
public class ItemsModR {

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, DecoSoulM.MOD_ID);

	// ALL ITEMS

	public static final RegistryObject<Item> SOUL = ITEMS.register("soul",
			() -> new Item(new Item.Properties().isImmuneToFire().rarity(Rarity.RARE).group(ItemGroup.COMBAT)));

	public static final RegistryObject<Item> LARGE_SOUL = ITEMS.register("large_soul", () -> new Souls(
			new Item.Properties().isImmuneToFire().rarity(Rarity.RARE).maxStackSize(1).group(ItemGroup.COMBAT)));

	public static final RegistryObject<Item> EMPTY_ESTUS_FLASK = ITEMS.register("empty_estus_flask",
			() -> new GlassBottleItem(new Item.Properties().maxStackSize(1).isImmuneToFire().rarity(Rarity.EPIC)
					.group(ItemGroup.COMBAT)));

	public static final RegistryObject<Item> LIFEGEM = ITEMS.register("lifegem",
			() -> new LifeGem(new Item.Properties().maxStackSize(16).rarity(Rarity.COMMON).group(ItemGroup.COMBAT)));

	public static final RegistryObject<Item> ESTUS_FLASK = ITEMS.register("estus_flask",
			() -> new EstusFlask(new Item.Properties().maxStackSize(1).isImmuneToFire().rarity(Rarity.EPIC).maxDamage(6)
					.group(ItemGroup.COMBAT)));

	@SuppressWarnings("deprecation")
	public static final RegistryObject<ModSpawnEggItem> BUFF_ZOMBIE_SPAWN_EGG = ITEMS.register("buff_zombie_spawn_egg",
			() -> new ModSpawnEggItem(EntityTypesModR.BUFF_ZOMBIE, 0x464F56, 0x1D6336,
					new Item.Properties().group(ItemGroup.COMBAT)));

	@SuppressWarnings("deprecation")
	public static final RegistryObject<ModSpawnEggItem> MELENTIA_SPAWN_EGG = ITEMS.register("melentia_spawn_egg",
			() -> new ModSpawnEggItem(EntityTypesModR.MELENTIA, 0x464F56, 0x1D6336,
					new Item.Properties().group(ItemGroup.COMBAT)));

	@SuppressWarnings("deprecation")
	public static final RegistryObject<ModSpawnEggItem> HOLLOW_SPAWN_EGG = ITEMS.register("hollow_spawn_egg",
			() -> new ModSpawnEggItem(EntityTypesModR.HOLLOW, 0x464F56, 0x1D6336,
					new Item.Properties().group(ItemGroup.COMBAT)));
	/**
	 * 
	 * ==== Swords Items ====
	 * 
	 * Existen 3 espadas diferentes y cada una tiene 4 categorías: Regular -> No
	 * añade ningún efecto. Lightning -> Slowness IV por 2s. Fire -> Cada hit quema
	 * al target por 2s. Poison -> Poison IV -> 2s
	 */

	// Broken Straight Swords

	public static final RegistryObject<Item> REGULAR_BROKEN_SWORD = ITEMS.register("regular_broken_sword",
			() -> new SwordItem(ItemTier.WOOD, 6, -3.4F,
					new Item.Properties().rarity(Rarity.COMMON).group(ItemGroup.COMBAT)));

	public static final RegistryObject<Item> LIGHTNING_BROKEN_SWORD = ITEMS.register("lightning_broken_sword",
			() -> new LightningSwords(ItemTier.WOOD, 6, -3.4F,
					new Item.Properties().rarity(Rarity.COMMON).group(ItemGroup.COMBAT)));

	public static final RegistryObject<Item> FIRE_BROKEN_SWORD = ITEMS.register("fire_broken_sword",
			() -> new FireSwords(ItemTier.WOOD, 6, -3.4F,
					new Item.Properties().rarity(Rarity.COMMON).group(ItemGroup.COMBAT)));

	public static final RegistryObject<Item> POISON_BROKEN_SWORD = ITEMS.register("poison_broken_sword",
			() -> new PoisonSwords(ItemTier.WOOD, 6, -3.4F,
					new Item.Properties().rarity(Rarity.COMMON).group(ItemGroup.COMBAT)));

	// Heide Knight Swords
	public static final RegistryObject<Item> REGULAR_HEIDE_SWORD = ITEMS.register("regular_heide_sword",
			() -> new SwordItem(ItemTier.WOOD, 6, -2F,
					new Item.Properties().rarity(Rarity.COMMON).group(ItemGroup.COMBAT)));

	public static final RegistryObject<Item> LIGHTNING_HEIDE_SWORD = ITEMS.register("lightning_heide_sword",
			() -> new LightningSwords(ItemTier.IRON, 3, -2F,
					new Item.Properties().rarity(Rarity.COMMON).group(ItemGroup.COMBAT)));

	public static final RegistryObject<Item> FIRE_HEIDE_SWORD = ITEMS.register("fire_heide_sword",
			() -> new FireSwords(ItemTier.IRON, 3, -2F,
					new Item.Properties().rarity(Rarity.COMMON).group(ItemGroup.COMBAT)));

	public static final RegistryObject<Item> POISON_HEIDE_SWORD = ITEMS.register("poison_heide_sword",
			() -> new PoisonSwords(ItemTier.IRON, 3, -2F,
					new Item.Properties().rarity(Rarity.COMMON).group(ItemGroup.COMBAT)));

	// LongSwords
	public static final RegistryObject<Item> REGULAR_LONGSWORD = ITEMS.register("regular_longsword",
			() -> new SwordItem(ItemTier.IRON, 5, -4F,
					new Item.Properties().rarity(Rarity.COMMON).group(ItemGroup.COMBAT)));

	public static final RegistryObject<Item> LIGHTNING_LONGSWORD = ITEMS.register("lightning_longsword",
			() -> new LightningSwords(ItemTier.IRON, 5, -4F,
					new Item.Properties().rarity(Rarity.COMMON).group(ItemGroup.COMBAT)));

	public static final RegistryObject<Item> FIRE_LONGSWORD = ITEMS.register("fire_longsword",
			() -> new FireSwords(ItemTier.IRON, 5, -4F,
					new Item.Properties().rarity(Rarity.COMMON).group(ItemGroup.COMBAT)));

	public static final RegistryObject<Item> POISON_LONGSWORD = ITEMS.register("poison_longsword",
			() -> new PoisonSwords(ItemTier.IRON, 5, -4F,
					new Item.Properties().rarity(Rarity.COMMON).group(ItemGroup.COMBAT)));

	// Magic
	public static final RegistryObject<Item> LINGERING_FLAME = ITEMS.register("lingering_flame",
			() -> new LingeringFlame(new Item.Properties().maxStackSize(1).isImmuneToFire().rarity(Rarity.EPIC)
					.maxDamage(6).group(ItemGroup.COMBAT)));

	public static final RegistryObject<Item> LIGHTNING_SPEAR = ITEMS.register("lightning_spear",
			() -> new LightningSpear(new Item.Properties().maxStackSize(1).isImmuneToFire().rarity(Rarity.EPIC)
					.maxDamage(6).group(ItemGroup.COMBAT)));

	public static void register(IEventBus eventBus) {
		ITEMS.register(eventBus);
	}
}
