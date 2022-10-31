package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.*;

public class Demo {

    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/jideofor";
        String userName = "root";
        String passWord = "ManuelAd1929";
       // Class.forName("com.mysql.jdbc.Driver");
        //There is no need to load this class manually. Just copy mysql connector maven dependency and load it

        //Also to connect to database, check jetbeans guideline on linking mysql to intellij
        Connection con = DriverManager.getConnection(url,userName,passWord);

        String query = "select * from deve";
        Statement st = con.createStatement();
        ResultSet rs  = st.executeQuery(query);
       // rs.next();
        //String n = rs.getString("firstName");
       // System.out.println(n);
        while(rs.next()){
            System.out.println(rs.getInt("id")+" "+
                            rs.getString("firstname")+" "+
                            rs.getString("surname")+" "+
                            rs.getString("town")+" "+
                            rs.getInt("age")+" "
                    );
        }
        st.close();
        con.close();
    }
}
