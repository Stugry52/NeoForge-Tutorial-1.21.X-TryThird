package net.stugry.tutorialmod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.stugry.tutorialmod.TutorialMod;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(TutorialMod.MOD_ID);

    public static final DeferredItem<Item> BISMUTH = ITEMS.register("bismuth",
            () -> new Item(new Item.Properties().setId(
                    ResourceKey.create(
                            Registries.ITEM,
                            ResourceLocation.fromNamespaceAndPath(TutorialMod.MOD_ID, "bismuth")
                    )
            )));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}

