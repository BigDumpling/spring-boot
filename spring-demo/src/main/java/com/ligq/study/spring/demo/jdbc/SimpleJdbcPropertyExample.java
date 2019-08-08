package com.ligq.study.spring.demo.jdbc;

import lombok.extern.slf4j.Slf4j;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

@Slf4j
public class SimpleJdbcPropertyExample {
    private static String DRIVER_CLASS;
    private static String URL;
    private static String USERNAME;
    private static String PASSWORD;

    static {
        try {
            Properties properties = new Properties();
//            InputStream inputStream = SimpleJdbcPropertyExample.class.getResourceAsStream("com/ligq/study/spring/demo/jdbc/jdbc.properties");
            InputStream inputStream = new FileInputStream("D:\\study\\spring-boot\\spring-demo\\src\\main\\java\\com\\ligq\\study\\spring\\demo\\jdbc\\jdbc.properties");
            properties.load(inputStream);
            DRIVER_CLASS = properties.getProperty("driver.classname");
            URL = properties.getProperty("jdbc.url");
            USERNAME = properties.getProperty("jdbc.username");
            PASSWORD = properties.getProperty("jdbc.password");
            Class.forName(DRIVER_CLASS);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet rt = null;

        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            preparedStatement = connection.prepareStatement("select * from t_user where name = ? and age = ?");
            preparedStatement.setString(1, "ligq");
            preparedStatement.setInt(2, 24);
            rt = preparedStatement.executeQuery();
            log.info("rt == {}", rt);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if(rt != null){
                try {
                    rt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if(preparedStatement != null){
                try {
                    preparedStatement.close();
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
