package net.hexagoat49.evangelionmod.item;

import net.hexagoat49.evangelionmod.EvangelionMod;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS =
            DeferredRegister.createItems(EvangelionMod.MOD_ID);

    public static final DeferredItem<Item> DONPOLLO = ITEMS.register("donpollo",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
