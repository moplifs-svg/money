package com.example.moneymod;

import java.util.List;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

public class MoneyItem extends Item {
    private final int value;

    public MoneyItem(int value, Properties properties) {
        super(properties);
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> tooltip, TooltipFlag flag) {
        tooltip.add(Component.translatable("tooltip.moneymod.value", value).withStyle(ChatFormatting.GREEN));
    }
}
