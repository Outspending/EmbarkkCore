package org.spending.embarkkcore.api.player;

import org.bukkit.entity.Player;

import java.util.UUID;

public class PlayerData {

    private UUID uuid;
    private double balance;
    private int level;
    private double xp;
    private double max_xp;

    public PlayerData(UUID uuid) {
        this.uuid = uuid;
        this.balance = 0;
        this.level = 0;
        this.xp = 0;
        this.max_xp = 100;
    }
}
