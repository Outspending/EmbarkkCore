package org.spending.embarkkcore.api.pmine;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.spending.embarkkcore.api.player.PlayerProfile;
import org.spending.embarkkcore.api.player.ProfileHandler;

import java.util.UUID;

public class Pmine implements PmineHandler, ProfileHandler {

    private final String name;
    private final PmineData data;

    public Pmine(String name) {
        this.name = name;
        this.data = new PmineData(this);
        pmines.add(this);
    }

    public Pmine(String name, PlayerProfile profile) {
        this.name = name;
        this.data = new PmineData(this);
        data.setOwner(profile);
        pmines.add(this);
    }

    /*
    * This resets the pmine and returns the amount of blocks that were reset.
     */
    public int reset() {
        return 0;
    }

    /*
    * This saves the pmine to the PMINE database
     */
    public void save() {

    }

    /*
    * This ranks up the pmine and returns the pmine level
    * Every 5 levels: Block Increase
    * Every 10 levels: Size Increase
     */
    public int rankup() {
        return 0;
    }

    /*
    * This increases the pmine's block limit and returns the pmine size
     */
    public int increaseSize() {
        return 0;
    }

    /*
     * Sets the owner of the pmine to the UUID
     * The old owner WILL be removed from the pmine
     * If changeToMember is true, the old owner will be added to the pmine as a member
     */
    public void setOwner(UUID uuid, boolean changeToMember) {
        PlayerProfile profile = profiles.get(uuid);
        if (profile != null)
            setOwner(profile, changeToMember);
    }

    /*
     * Sets the owner of the pmine to the UUID
     * The old owner WILL be removed from the pmine
     * If changeToMember is true, the old owner will be added to the pmine as a member
     */
    public void setOwner(PlayerProfile profile, boolean changeToMember) {
        if (profile.getPlayer() != null && changeToMember)
            addMember(data.getOwner());
        data.setOwner(profile);
    }

    /*
    * Adds a member to the pmine
     */
    public void addMember(UUID uuid) {
        PlayerProfile profile = profiles.get(uuid);
        data.getMembers().add(profile);
    }

    /*
     * Adds a member to the pmine
     */
    public void addMember(PlayerProfile profile) {
        data.getMembers().add(profile);
    }

    /*
    * Returns if the pmine is full or not
    * This can be changed
     */
    public boolean isMaxPlayers() {
        return data.getMembers().size() >= data.getMaxMembers();
    }

    /*
    * Adds a member to the pmine if the pmine is not full
     */
    public void addMemberIfNotMax(UUID uuid) {
        if (!isMaxPlayers())
            addMember(uuid);
    }

    /*
    * Returns the max size of the pmine
     */
    public int getMaxSize() {
        return 0;
    }

    /*
     * Returns the current amount of members in the pmine
     */
    public int getMemberSize() {
        return 0;
    }

    /*
     * Returns the current amount of blocks in the pmine
     * This includes members and owners
     */
    public int getFullMemberSize() {
        return 0;
    }

    public String getName() {
        return name;
    }

    public PmineData getData() {
        return data;
    }
}
