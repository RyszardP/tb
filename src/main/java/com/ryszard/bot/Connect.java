package com.ryszard.bot;

import java.sql.*;

public class Connect {
    private static final String url = "jdbc:mysql://localhost:3306/city_db?serverTimezone=UTC";
    private static final String user = "root";
    private static final String password = "root";

    private static Connection connection;
    private static ResultSet resultSet;
    private static PreparedStatement preparedStatement;
    private static String dataFromDb;


    public static String getDataFromDb(String city){
        String query = "select tc.description from cities tc where tc.name =?";

        try {

            connection = DriverManager.getConnection(url, user, password);
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, city);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                String cityDescription = resultSet.getString(1);
                dataFromDb = cityDescription;
            }

        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        }finally {
            try { connection.close(); } catch(SQLException se) {
                System.out.println("connect close successful");
            }
            try { preparedStatement.close(); } catch(SQLException se) {
                System.out.println("prepare statement close successful"); }
            try { resultSet.close(); } catch(SQLException se) {
                System.out.println("result set close successful"); }
        }

        return dataFromDb;
    }

}
