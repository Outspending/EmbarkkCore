package org.spending.embarkkcore.api.pmine;

import org.bukkit.entity.Player;
import org.spending.embarkkcore.api.player.PlayerProfile;

import java.util.List;

public class PmineAPI implements PmineHandler {

    /*
    * Returns the pmine with the given name
     */
    public static Pmine getPmine(String name) {
        return pmines.get(name);
    }

    /*
     * Returns the pmine with the given name
     * If the pmine doesn't exist, it will be created
     * If the player doesn't have a profile, null will be returned
     */
    public static Pmine createPmine(String name, PlayerProfile owner) {
        Pmine mine = pmines.get(name);
        return mine != null ? mine : new Pmine(name, owner);
    }

    /*
    * Returns the pmine with the given name
    * If the pmine doesn't exist, it will be created
    * If the player doesn't have a profile, null will be returned
     */
    public static Pmine createPmine(String name, Player player) {
        PlayerProfile profile = PlayerProfile.getProfile(player);
        if (profile != null)
            return createPmine(name, profile);
        return null;
    }

    /*
    * Returns if the pmine's owner is the given profile
     */
    public static boolean isOwner(Pmine pmine, PlayerProfile profile) {
        return pmine.getData().getOwner() == profile;
    }

    /*
    * Returns if the pmine's owner is the given player
     */
    public static boolean isOwner(Pmine pmine, Player player) {
        PlayerProfile profile = PlayerProfile.getProfile(player);
        if (profile != null)
            return pmine.getData().getOwner() == profile;
        return false;
    }

    /*
    * Returns if the pmine contains the given profile
    * This includes the owner and members
     */
    public static boolean containsPlayer(Pmine pmine, PlayerProfile profile) {
        List<PlayerProfile> members = pmine.getData().getMembers();
        members.add(pmine.getData().getOwner());
        return members.contains(profile);
    }

    /*
    * Returns if the pmine contains the given player
    * This includes the owner and members
     */
    public static boolean containsPlayer(Pmine pmine, Player player) {
        List<PlayerProfile> members = pmine.getData().getMembers();
        PlayerProfile profile = PlayerProfile.getProfile(player);

        return profile == pmine.getData().getOwner() || members.contains(profile);
    }

    /*
    * Returns if the pmine contains the given profile as a member
    * This does not include the owner
     */
    public static boolean isMember(Pmine pmine, PlayerProfile profile) {
        return pmine.getData().getMembers().contains(profile);
    }

    /*
    * Returns if the pmine contains the given player as a member
    * This does not include the owner
     */
    public static boolean isMember(Pmine pmine, Player player) {
        PlayerProfile profile = PlayerProfile.getProfile(player);
        if (profile != null)
            return pmine.getData().getMembers().contains(profile);
        return false;
    }
}
