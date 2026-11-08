package com.example.moneymod;

import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MoneyMod.MODID);

    public static final RegistryObject<Item> MONEY_5 =
            ITEMS.register("money_5", () -> new MoneyItem(5, new Item.Properties()));
    public static final RegistryObject<Item> MONEY_10 =
            ITEMS.register("money_10", () -> new MoneyItem(10, new Item.Properties()));
    public static final RegistryObject<Item> MONEY_100 =
            ITEMS.register("money_100", () -> new MoneyItem(100, new Item.Properties()));
}
