package com.bmc.chatbot.database;

import java.sql.*;

import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Component;
@Component
@PropertySources(value= {@PropertySource(value="classpath:application.properties")})
public class CheckDb {
    private String url="jdbc:postgresql://localhost/demo";
    private String user ="postgres";
    private String password="bmcbot";
    
    public Connection connect()
    {
        Connection connection=null;
        try {
            connection = DriverManager.getConnection(  url, user, password);
            System.out.print("Success");
            
        }catch(SQLException e) {
            System.out.println(e.getMessage());
        }
        return connection;
    }
}
