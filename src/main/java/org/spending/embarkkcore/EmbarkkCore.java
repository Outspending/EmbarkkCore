package org.spending.embarkkcore;

import org.bukkit.plugin.java.JavaPlugin;
import org.spending.embarkkcore.api.pmine.Pmine;

public final class EmbarkkCore extends JavaPlugin {

    public static JavaPlugin plugin;

    @Override
    public void onEnable() {
        plugin = this;
        Pmine pmine = new Pmine("test");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static JavaPlugin getPlugin() {
        return plugin;
    }
}
