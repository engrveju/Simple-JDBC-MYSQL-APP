package dao;

//import com.mysql.jdbc.Driver;

import java.sql.*;

public class StudentDao {

    public Student getName(int age) {
        Student s1 = null;
        try {
            s1 = new Student();
            s1.age = age;
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jideofor", "root", "ManuelAd1929");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select surname from deve where age =" + age);
            rs.next();
            String n = rs.getString("surname");
            s1.name = n;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return s1;
    }
}
