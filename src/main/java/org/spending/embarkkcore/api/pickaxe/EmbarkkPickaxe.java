package org.spending.embarkkcore.api.pickaxe;

import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;
import org.spending.embarkkcore.EmbarkkCore;

import javax.naming.Name;
import java.util.UUID;

public class EmbarkkPickaxe {

    private UUID uuid;
    private ItemStack pickaxe;

    public EmbarkkPickaxe(UUID uuid, ItemStack pickaxe) {
        this.uuid = uuid;
        this.pickaxe = pickaxe;
    }

    public int getEnchantment(String enchant_name) {
        int level = getContainer().get(new NamespacedKey(EmbarkkCore.getPlugin(), enchant_name), PersistentDataType.INTEGER);
        return level == 0 ? 1 : level;
    }

    public void createEnchant(String enchant_name) {
        PersistentDataContainer container = getContainer();
        container.set(new NamespacedKey(EmbarkkCore.getPlugin(), enchant_name), PersistentDataType.INTEGER, 0);
    }

    public void setEnchantment(String enchant_name, int level) {
        PersistentDataContainer container = getContainer();
        container.set(new NamespacedKey(EmbarkkCore.getPlugin(), enchant_name), PersistentDataType.INTEGER, level);
    }

    public void removeEnchantment(String enchant_name) {
        PersistentDataContainer container = getContainer();
        container.remove(new NamespacedKey(EmbarkkCore.getPlugin(), enchant_name));
    }

    public boolean hasEnchantment(String enchant_name) {
        return getContainer().has(new NamespacedKey(EmbarkkCore.getPlugin(), enchant_name), PersistentDataType.INTEGER);
    }

    public UUID getUuid() {
        return uuid;
    }

    public ItemStack getPickaxe() {
        return pickaxe;
    }

    private PersistentDataContainer getContainer() {
        ItemMeta meta = pickaxe.getItemMeta();
        return meta.getPersistentDataContainer();
    }
}
