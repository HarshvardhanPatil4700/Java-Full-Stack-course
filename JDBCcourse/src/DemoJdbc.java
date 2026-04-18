import org.postgresql.Driver;

import java.sql.*; // step 1

public class DemoJdbc {
    public static void main() throws ClassNotFoundException, SQLException {
        /* JDBC Steps
        1. import package
        2. load and register driver (Optional step as after Java 4.0 it is automatically inherited)
        3. create connection
        4. create statement
        5. execute statement
        6. process the result
        7. close connection
         */

        String url = "jdbc:postgresql://localhost:5432/demo";
        String uname = "postgres";
        String passw = "1234";

//        Class.forName("org.postgresql.Driver"); // step 2 (throws exception) NOT required after JDBC 4.0
        Connection con = DriverManager.getConnection(url,uname,passw);// to connect application to database we do it by connection object

        System.out.println("Connected Successfully!");
    }
}
/*
Connection con = DriverManager.getConnection("","",""); - This line is a JDBC step to establish a connection with the database.
It has 3 parts :
1.url (String) - Tells where your database is located and Format depends on DB
2.username (String) - Your DB login username
3.password (String) - Your DB password
*/