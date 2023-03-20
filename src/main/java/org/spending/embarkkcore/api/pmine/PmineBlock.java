package org.spending.embarkkcore.api.pmine;

import org.bukkit.Material;

public class PmineBlock {

    private Material material;
    private double chance;

    public PmineBlock(Material material, double chance) {
        this.material = material;
        this.chance = chance;
    }

    public Material getMaterial() {
        return material;
    }

    public double getChance() {
        return chance;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public void setChance(double chance) {
        this.chance = chance;
    }
}
