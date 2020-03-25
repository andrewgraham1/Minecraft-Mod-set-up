package com.andrewgraham1.blade.init;

import com.andrewgraham1.ModEventSubscriber;
import com.andrewgraham1.SwordMod;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

import java.util.function.Supplier;

public class ModItemGroups {
    public static final ItemGroup MOD_ITEM_GROUP = new ModItemGroup(SwordMod.MODID, () -> new ItemStack(Items.LIGHT_BLUE_BANNER));
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
