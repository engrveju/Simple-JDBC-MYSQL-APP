package dao;

//import com.mysql.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDao {
public List<Student> list = null;
    public Student getName(int age) {
        Student s1 = null;

        try {
            s1 = new Student();
            s1.age = age;
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jideofor", "root", "ManuelAd1929");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from deve where age >" + age);
            list = new ArrayList<>();
            while (rs.next()) {
                s1.id = rs.getInt("id");
                s1.firstname = rs.getString("firstname");
                s1.surname = rs.getString("surname");
                s1.town = rs.getString("town");
                s1.age = rs.getInt("age");

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        list.add(s1);
        return s1;
    }
}
