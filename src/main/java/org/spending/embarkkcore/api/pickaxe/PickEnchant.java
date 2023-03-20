package org.spending.embarkkcore.api.pickaxe;

import java.util.Arrays;

public enum PickEnchant {

    FORTUNE("Fortune", 0.5f, 3),
    KEY_FINDER("Key Finder", 0.5f, 1),
    JACKHAMMER("Jackhammer", 0.5f, 1),
    LUCKY("Lucky", 0.5f, 1);


    private String defaultName;
    private float chance;
    private int maxLevel;

    PickEnchant(String defaultName, float chance, int maxLevel) {
        this.defaultName = defaultName;
        this.chance = chance;
        this.maxLevel = maxLevel;
    }

    public static PickEnchant getEnchant(String name) {
        return Arrays.stream(PickEnchant.values())
                .filter(enchant -> enchant.getDefaultName().equalsIgnoreCase(name))
                .findFirst()
                .orElse(null);
    }

    public String getDefaultName() {
        return defaultName;
    }

    public float getChance() {
        return chance;
    }

    public int getMaxLevel() {
        return maxLevel;
    }
}
