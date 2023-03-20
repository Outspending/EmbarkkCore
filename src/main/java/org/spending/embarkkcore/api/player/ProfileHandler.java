package org.spending.embarkkcore.api.player;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public interface ProfileHandler {

    Map<UUID, PlayerProfile> profiles = new HashMap<>();
}
