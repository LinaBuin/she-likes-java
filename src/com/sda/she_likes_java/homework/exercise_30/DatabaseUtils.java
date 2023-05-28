package com.sda.she_likes_java.homework.exercise_30;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// fasted way to get the url , the connection address for java class??
public class DatabaseUtils {

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection("jdbc:h2:~\\Data\\she-goes-tech\\db", "sa", "sa");
        } catch (SQLException e) {
            return null;

        }
    }
}
