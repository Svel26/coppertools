package dev.worldblock.coppertools.registry;

import dev.worldblock.coppertools.CopperTools;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.SwordItem;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(CopperTools.MOD_ID);

    public static final DeferredItem<SwordItem> COPPER_SWORD = ITEMS.registerItem("copper_sword",
            props -> new SwordItem(ModTiers.COPPER, props.attributes(SwordItem.createAttributes(ModTiers.COPPER, 3, -2.4F))));

    public static final DeferredItem<PickaxeItem> COPPER_PICKAXE = ITEMS.registerItem("copper_pickaxe",
            props -> new PickaxeItem(ModTiers.COPPER, props.attributes(PickaxeItem.createAttributes(ModTiers.COPPER, 1.0F, -2.8F))));

    public static final DeferredItem<AxeItem> COPPER_AXE = ITEMS.registerItem("copper_axe",
            props -> new AxeItem(ModTiers.COPPER, props.attributes(AxeItem.createAttributes(ModTiers.COPPER, 7.0F, -3.2F))));

    public static final DeferredItem<ShovelItem> COPPER_SHOVEL = ITEMS.registerItem("copper_shovel",
            props -> new ShovelItem(ModTiers.COPPER, props.attributes(ShovelItem.createAttributes(ModTiers.COPPER, 1.5F, -3.0F))));

    public static final DeferredItem<HoeItem> COPPER_HOE = ITEMS.registerItem("copper_hoe",
            props -> new HoeItem(ModTiers.COPPER, props.attributes(HoeItem.createAttributes(ModTiers.COPPER, -1.0F, -2.0F))));
}
