package org.spending.embarkkcore.api;

import org.spending.embarkkcore.EmbarkkCore;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {

    private static final String STORAGE_URL;
    public static final Connection connection;

    static {
        STORAGE_URL = EmbarkkCore.getPlugin().getDataFolder().getAbsolutePath() + "/playerStorage.db";
        try {
            connection = DriverManager.getConnection(STORAGE_URL);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void createTable() {

    }

    public static void savePlayer() {

    }

    public static void loadPlayer() {

    }

    public static void deletePlayer() {

    }
}
