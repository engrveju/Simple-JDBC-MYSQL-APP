package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DatabaseService {

    public Connection connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/jideofo", "root", "emmanuel");
        } catch (Exception ex) {
            ex.printStackTrace();
            return  null;
        }
    }

    public ResultSet getAllRecords(){
        try {
            Connection connection = this.connect();
            PreparedStatement preparedStatement = connection.prepareStatement("select * from deve where age>20");
            return preparedStatement.executeQuery();
        }
        catch (Exception ex){
            ex.printStackTrace();
            return null;
        }
    }

    public boolean addRecord(String name, int age, double salary){
        try {
            Connection connection = this.connect();
            PreparedStatement preparedStatement = connection.prepareStatement("insert into test(name, age, salary)values(?,?,?)");
            preparedStatement.setString(1,name);
            preparedStatement.setInt(2, age);
            preparedStatement.setDouble(3, salary);
            return preparedStatement.execute();
        }
        catch (Exception ex){
            ex.printStackTrace();
            return false;
        }
    }

    public int updateRecord(){
        // complete this
        return 1;
    }

    public int deleteRecord(){
        //complete this
        return 1;
    }

}
