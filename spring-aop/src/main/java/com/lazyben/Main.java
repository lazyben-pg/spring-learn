package com.lazyben;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Random;
import java.util.UUID;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/test?useSSL=false";
        String user = "root";
        String psw = "123";
        Connection connection = DriverManager.getConnection(url, user, psw);
        Random random = new Random();
        for (int i = 0; i < 10000; i++) {
            PreparedStatement statement = connection.prepareStatement("insert into single_table (key1, key2, key3, key_part1, key_part2, key_part3, common_field) values (?, ?, ?, ?, ?, ?, ?)");
            statement.setString(1, Integer.toString(random.nextInt(10000)));
            statement.setInt(2, 10000 - i);
            statement.setString(3, Integer.toString(random.nextInt(10000)));
            statement.setString(4, Integer.toString(random.nextInt(10000)));
            statement.setString(5, Integer.toString(random.nextInt(10000)));
            statement.setString(6, Integer.toString(random.nextInt(10000)));
            statement.setString(7, UUID.randomUUID().toString());
            statement.execute();
        }
    }
}
