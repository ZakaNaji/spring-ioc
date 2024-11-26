package com.znaji;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;

public class Main {
    public static void main(String[] args) {
        final ClassPathXmlApplicationContext xmlApplicationContext
                = new ClassPathXmlApplicationContext("applicationContext.xml");

        final DataSource userDataSource = xmlApplicationContext.getBean("userDataSource", DataSource.class);
        try (Connection connection = userDataSource.getConnection()) {
            connection.createStatement().execute("CREATE TABLE users (id INT, name VARCHAR(50))");
            connection.createStatement().execute("INSERT INTO users (id, name) VALUES (1, 'John Doe')");
            ResultSet resultSet = connection.createStatement().executeQuery("SELECT * FROM users");
            while (resultSet.next()) {
                System.out.println("User id: " + resultSet.getInt("id") + ", name: " + resultSet.getString("name"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        final DataSource productDataSource = xmlApplicationContext.getBean("productDataSource", DataSource.class);
        try (Connection connection = productDataSource.getConnection()) {
            connection.createStatement().execute("CREATE TABLE products (id INT, name VARCHAR(50))");
            connection.createStatement().execute("INSERT INTO products (id, name) VALUES (1, 'Book')");
            ResultSet resultSet = connection.createStatement().executeQuery("SELECT * FROM products");
            while (resultSet.next()) {
                System.out.println("Product id: " + resultSet.getInt("id") + ", name: " + resultSet.getString("name"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}