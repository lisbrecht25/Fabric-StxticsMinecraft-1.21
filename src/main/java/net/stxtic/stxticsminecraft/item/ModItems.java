package net.stxtic.stxticsminecraft.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.stxtic.stxticsminecraft.StxticsMinecraft;

public class ModItems {

    public static final Item REPLENISH_BOOK = registerItem("replenish_book", new Item(new Item.Settings()));
    public static final Item LEAD_INGOT = registerItem("lead_ingot", new Item(new Item.Settings()));
    public static final Item RAW_LEAD = registerItem("raw_lead", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(StxticsMinecraft.MOD_ID, name), item);
    }

    public static void registerModItems() {
        StxticsMinecraft.LOGGER.info("Registering Mod Items for " + StxticsMinecraft.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(REPLENISH_BOOK);
            entries.add(LEAD_INGOT);
            entries.add(RAW_LEAD);
        });
    }
}
