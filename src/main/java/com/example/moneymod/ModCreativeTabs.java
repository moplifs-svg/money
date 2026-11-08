package com.example.moneymod;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MoneyMod.MODID);

    public static final RegistryObject<CreativeModeTab> MONEY_TAB = TABS.register("money_tab",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.moneymod"))
                    .icon(() -> new ItemStack(ModItems.MONEY_100.get()))
                    .displayItems((params, output) -> {
                        output.accept(ModItems.MONEY_5.get());
                        output.accept(ModItems.MONEY_10.get());
                        output.accept(ModItems.MONEY_100.get());
                    })
                    .build());
}
