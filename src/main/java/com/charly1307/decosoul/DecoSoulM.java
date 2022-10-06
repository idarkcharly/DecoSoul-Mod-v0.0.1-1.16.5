package com.charly1307.decosoul;

import java.util.stream.Collectors;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.charly1307.decosoul.common.blocks.BlocksModR;
import com.charly1307.decosoul.common.effect.EffectsMod;
import com.charly1307.decosoul.common.entity.EntityTypesModR;
import com.charly1307.decosoul.common.entity.merchant.render.MelentiaRenderer;
import com.charly1307.decosoul.common.entity.monster.render.BuffZombieRenderer;
import com.charly1307.decosoul.common.entity.monster.render.HollowRender;
import com.charly1307.decosoul.common.items.ItemsModR;
import com.charly1307.decosoul.common.particles.ParticlesMod;
import com.charly1307.decosoul.core.util.DecoSoulSoundEvents;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(DecoSoulM.MOD_ID)
public class DecoSoulM {

	private static final Logger LOGGER = LogManager.getLogger();
	public static final String MOD_ID = "decosoul";

	public DecoSoulM() {

		IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

		// Register Mod Class

		EntityTypesModR.register(eventBus);
		ItemsModR.register(eventBus);
		BlocksModR.register(eventBus);
		DecoSoulSoundEvents.register(eventBus);
		EffectsMod.register(eventBus);
		ParticlesMod.register(eventBus);

		eventBus.addListener(this::setup);
		eventBus.addListener(this::enqueueIMC);
		eventBus.addListener(this::processIMC);
		eventBus.addListener(this::doClientStuff);

		MinecraftForge.EVENT_BUS.register(this);
	}

	private void setup(final FMLCommonSetupEvent event) {
		// some preinit code
		LOGGER.info("HELLO FROM PREINIT");
		LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
	}

	private void doClientStuff(final FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			RenderTypeLookup.setRenderLayer(BlocksModR.BONFIRE.get(), RenderType.getCutout());

		});

		RenderingRegistry.registerEntityRenderingHandler(EntityTypesModR.BUFF_ZOMBIE.get(), BuffZombieRenderer::new);
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesModR.MELENTIA.get(), MelentiaRenderer::new);
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesModR.HOLLOW.get(), HollowRender::new);

	}

	private void enqueueIMC(final InterModEnqueueEvent event) {
		InterModComms.sendTo("examplemod", "helloworld", () -> {
			LOGGER.info("Hello world from the MDK");
			return "Hello world";
		});
	}

	private void processIMC(final InterModProcessEvent event) {
		LOGGER.info("Got IMC {}",
				event.getIMCStream().map(m -> m.getMessageSupplier().get()).collect(Collectors.toList()));
	}

	@SubscribeEvent
	public void onServerStarting(FMLServerStartingEvent event) {
		LOGGER.info("HELLO from server starting");
	}

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
	public static class RegistryEvents {
		@SubscribeEvent
		public static void onBlocksRegistry(final RegistryEvent.Register<Block> blockRegistryEvent) {
			LOGGER.info("HELLO from Register Block");
		}
	}
}