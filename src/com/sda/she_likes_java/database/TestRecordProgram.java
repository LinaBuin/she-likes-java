package com.sda.she_likes_java.database;
import java.sql.Connection;

public class TestRecordProgram {
    public static void main(String[] args) {
        Connection connection = DatabaseUtils.getConnection();
        System.out.println("got connection? " + (connection != null));
        TestRecordRepository recordRepository = new TestRecordRepository(connection);
        recordRepository.getAllTestRowsFromDB();
        System.out.println("Let's store some data");
        TestRecord newRecord = new TestRecord(2, "First insert");
        recordRepository.storeTestRecordIntoDatabase(newRecord);


    }
}


