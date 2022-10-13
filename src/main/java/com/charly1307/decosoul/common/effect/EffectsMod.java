package com.charly1307.decosoul.common.effect;

import com.charly1307.decosoul.DecoSoulM;

import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class EffectsMod {

	public static final DeferredRegister<Effect> MOB_EFFECTS = DeferredRegister.create(ForgeRegistries.POTIONS, DecoSoulM.MOD_ID);

	public static final RegistryObject<Effect> BLEEDING = MOB_EFFECTS.register("bleeding",
			() -> new BleedingEffect(EffectType.HARMFUL, 10027008));

	public static void register(IEventBus eventBus) {
		MOB_EFFECTS.register(eventBus);
	}
}
