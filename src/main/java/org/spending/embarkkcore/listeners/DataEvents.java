package org.spending.embarkkcore.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.spending.embarkkcore.api.player.PlayerProfile;

public class DataEvents implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e) {
        Player player = e.getPlayer();


        /*
        * This is where you would check if the player has a profile already.
        * If they do, you would load their data from the database.
        * If they don't, you would create a new profile for them.
         */
        new PlayerProfile(player);
    }
}
