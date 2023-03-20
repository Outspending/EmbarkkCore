package org.spending.embarkkcore.api.player;

import org.bukkit.entity.Player;

import java.util.UUID;

public class PlayerProfile implements ProfileHandler {

    private Player player;
    private UUID uuid;
    private String name;
    private PlayerData data;
    private PlayerScoreboard scoreboard;

    public PlayerProfile(Player player) {
        this.player = player;
        this.uuid = player.getUniqueId();
        this.name = player.getName();
        this.data = new PlayerData(player.getUniqueId());
        profiles.putIfAbsent(player.getUniqueId(), this);
    }

    public static PlayerProfile getProfile(Player player) {
        return profiles.get(player.getUniqueId());
    }

    public static PlayerProfile getProfile(UUID uuid) {
        return profiles.get(uuid);
    }

    public static boolean containsProfile(Player player) {
        return profiles.containsKey(player.getUniqueId());
    }

    public static boolean containsProfile(UUID uuid) {
        return profiles.containsKey(uuid);
    }

    public UUID getUuid() {
        return uuid;
    }

    public String getName() {
        return name;
    }

    public PlayerData getData() {
        return data;
    }

    public Player getPlayer() {
        return player;
    }
}
