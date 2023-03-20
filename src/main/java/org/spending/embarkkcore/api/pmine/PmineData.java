package org.spending.embarkkcore.api.pmine;

import org.spending.embarkkcore.api.player.PlayerProfile;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class PmineData {

    private final Pmine pmine;
    private PlayerProfile owner;
    private List<PlayerProfile> members = new ArrayList<>();
    private List<PmineBlock> blocks = new ArrayList<>();
    private int size;
    private int maxMembers = 10;

    public PmineData(Pmine pmine) {
        this.pmine = pmine;
        this.owner = null;
    }

    public PmineData(Pmine pmine, PlayerProfile owner, List<PlayerProfile> members, List<PmineBlock> blocks) {
        this.pmine = pmine;
        this.owner = owner;
        this.members = members;
        this.blocks = blocks;
    }

    public Pmine getPmine() {
        return pmine;
    }

    public PlayerProfile getOwner() {
        return owner;
    }

    public List<PlayerProfile> getMembers() {
        return members;
    }

    public List<PmineBlock> getBlocks() {
        return blocks;
    }

    public int getSize() {
        return size;
    }

    public int getMaxMembers() {
        return maxMembers;
    }

    public void setOwner(PlayerProfile owner) {
        this.owner = owner;
    }

    public void setMembers(List<PlayerProfile> members) {
        this.members = members;
    }

    public void setBlocks(List<PmineBlock> blocks) {
        this.blocks = blocks;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setMaxMembers(int maxMembers) {
        this.maxMembers = maxMembers;
    }
}
