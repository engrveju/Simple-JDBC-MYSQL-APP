package org.example;

import java.sql.ResultSet;

public class Main {

    public static void main(String[] args) {
        try {
            DatabaseService dbService = new DatabaseService();

//            dbService.addRecord("Patine", 30, 5000);

            ResultSet result = dbService.getAllRecords();
            while(result.next()){
                int name = result.getInt(1);
                String age= result.getString(2);
                String salary = result.getString(3);
                System.out.println(name+","+age+","+salary);
            }

            System.out.println("Success");
        }
        catch (Exception ex){
            ex.printStackTrace();
        }

    }
}