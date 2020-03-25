package com.andrewgraham1;

import com.andrewgraham1.blade.init.ModItemGroups;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.IForgeRegistryEntry;
import net.minecraftforge.registries.ObjectHolder;


@Mod.EventBusSubscriber(modid = SwordMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventSubscriber {

    @SubscribeEvent
    public static void onRegisterItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(
                setup(new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)), "sword_item")
        );
    }

    @ObjectHolder(SwordMod.MODID)
    public static class ModItems {
        public static final Item SWORD_ITEM = null;
    }

    // set to bottom of class, these register our entities properly
    public static <T extends IForgeRegistryEntry<T>> T setup(final T entry, final String name) {
        return setup(entry, new ResourceLocation(SwordMod.MODID, name));
    }

    public static <T extends IForgeRegistryEntry<T>> T setup(final T entry, final ResourceLocation registryName) {
        entry.setRegistryName(registryName);
        return entry;
    }
}
