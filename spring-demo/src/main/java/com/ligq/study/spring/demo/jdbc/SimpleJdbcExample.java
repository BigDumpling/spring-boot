package com.ligq.study.spring.demo.jdbc;

import lombok.extern.slf4j.Slf4j;

import java.sql.*;

@Slf4j
public class SimpleJdbcExample {

    private final static String DRIVER_CLASS = "com.mysql.jdbc.Driver";
    private final static String URL;
    private final static String USERNAME;
    private final static String PASSWORD;

    static {
        URL = "jdbc:mysql://127.0.0.1:3306/root";
        USERNAME = "root";
        PASSWORD = "root";
    }

    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {

            /**
             * 加载驱动
             */
            Class.forName(DRIVER_CLASS);

            /**
             * 使用DriverManager获取数据库连接，获取connection代表了java程序和数据库的连接
             */
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

            /**
             * 创建一个statement队形
             */
            statement = connection.createStatement();

            /**
             * 执行sql，获取结果
             */
            resultSet = statement.executeQuery("select * from t_user");
            if(resultSet.next()){
                log.info("name == {}", resultSet.getString("name"));
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if(resultSet != null){
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if(statement != null){
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if(connection != null){
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
