import org.postgresql.Driver;

import javax.swing.plaf.nimbus.State;
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
        String sql = "select * from student";


        // Class.forName("org.postgresql.Driver"); // step 2 (throws exception) NOT required after JDBC 4.0
        // Step 3 :
        Connection con = DriverManager.getConnection(url,uname,passw);// to connect application to database we do it by connection object
        System.out.println("Connected Successfully!");
        //Step 4 :
        Statement st = con.createStatement();
        // Step 5 :
        ResultSet rs = st.executeQuery(sql);
        // Step 6:
        //System.out.println(rs.next()); // .next() method Moves cursor one row forward and Returns:true → if next row exists (or) false → if no more rows

//        rs.next();
//        String name = rs.getString("sname"); // we need to mention the col name / col IndexNo. of which o/p we want as some query can give multiple columns after execution
//        System.out.println("Name of the Student is : " + name);

        // To fetch multiple records
        /* When we know the no. of columns in table USE THIS :-
        while(rs.next()) { // rs.next() check if there is next row present and also ensures we are jumping row to row
            System.out.print(rs.getString(1) + " : ");
            System.out.print(rs.getString(2) + " - ");
            System.out.print(rs.getString(3));
            System.out.println();
        }*/
        // WHen we Dont know the no. of columns in table USE THIS :-
        ResultSetMetaData metaData = rs.getMetaData();
        int columnCount = metaData.getColumnCount(); // gives no. of columns in table
        while (rs.next()) { // Outer loop -> rows

            // Inner loop → columns
            for (int i = 1; i <= columnCount; i++) {
                System.out.print(rs.getString(i) + " ");
            }

            System.out.println();
        }

        // Step 7:
        con.close();
        System.out.println("Connection closed!");
    }
}
/*
1.Connection con = DriverManager.getConnection("","",""); - This line is a JDBC step to establish a connection with the database.
It has 3 parts :
    1.url (String) - Tells where your database is located and Format depends on DB
    2.username (String) - Your DB login username
    3.password (String) - Your DB password
    Eg : String url = "jdbc:postgresql://localhost:5432/demo";
            JDBC URL: postgresql → DB type,localhost → server,5432 → default PostgreSQL port,demo → database name

2.Connection con = DriverManager.getConnection(url,uname,passw);  It Connects Java app to DB and Returns Connection object

3. Statement st = con.createStatement();  It Creates SQL executor object and used to send queries

4. ResultSet rs = st.executeQuery(sql); Runs SELECT query and Returns data in ResultSet

5. rs.next(); It Moves cursor from before first row → first row (Required before accessing data) else gives error as ResultSet not positioned

6. String name = rs.getString("sname"); Fetches value from column sname and Can also use index: getString(1)

7. con.close(); Closes DB connection and Frees resources

Note:
Before executing the rs points to place before 1st index i.e(kind of -1) so we need to write rs.next() so that it moves to 1st index(Cursor starts at position -1 and rs.next() → moves to row 1)

8. Fetching all records :
while(rs.next()) - Moves cursor row by row and Also checks if a next row exists
👉 Works like:
Move to row 1 → process
Move to row 2 → process
Move to row 3 → process
No row → loop stops

9. ResultMetaData - An object that can be used to get information about the types and properties of the columns in a ResultSet object.
*/