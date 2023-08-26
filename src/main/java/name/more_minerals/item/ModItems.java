package name.more_minerals.item;

import name.more_minerals.MoreMinerals;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item CIRTINE = registerItem("cirtine",
            new Item(new FabricItemSettings()));
    public static final Item RAW_CIRTINE = registerItem("raw_cirtine",
            new Item(new FabricItemSettings()));
    private static Item registerItem(String name,Item item) {
        return Registry.register(Registries.ITEM, new Identifier(MoreMinerals.MOD_ID, name), item);
    }
    private static void addToItemGroup(ItemGroup group, Item item){
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }
    public static void registerModItems(){
        MoreMinerals.LOGGER.info("Registering mod items for" + MoreMinerals.MOD_ID);
    }
    public static void addItemsToItemGroup(){
        addToItemGroup(ItemGroups.INGREDIENTS,CIRTINE);
    }
}
