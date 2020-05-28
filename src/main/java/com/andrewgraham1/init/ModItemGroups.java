package com.andrewgraham1.blade.init;

import com.andrewgraham1.ModEventSubscriber;
import com.andrewgraham1.SwordMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraftforge.registries.ObjectHolder;

import java.util.function.Supplier;

public class ModItemGroups {
    public static final ItemGroup MOD_ITEM_GROUP = new ModItemGroup(SwordMod.MODID, () -> new ItemStack(ModItems.SWORD_ITEM));
}

@ObjectHolder(SwordMod.MODID)
class ModItems {
    public static final Item SWORD_ITEM = null;
}

class ModItemGroup extends ItemGroup {

    private final Supplier<ItemStack> iconSupplier;

    public ModItemGroup(final String name, final Supplier<ItemStack> iconSupplier) {
        super(name);
        this.iconSupplier = iconSupplier;
    }

    @Override
    public ItemStack createIcon() {
        return iconSupplier.get();
    }



}
