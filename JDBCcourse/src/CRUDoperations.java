import java.sql.*;

public class CRUDoperations {
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
//        String sql = "insert into student values (6,'Virat',18)";
        // Create Operation
        String sql = "insert into student values (6,'Kohli',18)";
        // Update Operation
        String sql1 = "update student set sname ='Kohli' where sid=6"; // again as it is not ResultSet execute() returns false
        // Delete Operation
        String sql2 = "delete from student where sname='Kohli'";

        // Step 3 :
        Connection con = DriverManager.getConnection(url,uname,passw);// to connect application to database we do it by connection object
        System.out.println("Connected Successfully!");

        //Step 4 :
        Statement st = con.createStatement();
        boolean status = st.execute(sql); // execute() returns a boolean value indicating if operation is done or not
        System.out.println(status); // NOTE : the ("insert into student values (6,'Virat',18)";) obj has been inserted still it returns FALSE as obj is not a ResultSet
        System.out.println(st.execute(sql1)); // Update operation
        System.out.println(st.execute(sql2)); // Delete operation

        // Step 7:
        con.close();
        System.out.println("Connection closed!");
    }
}
/*
1. To insert the data (CREATE) - first, connect the java and DB then create STATEMENT and execute Statement using :
executeQuery() for (non-updating queries) (Use only for SELECT)
execute() for (updating queries) like SELECT,INSERT,UPDATE,DELETE (i.e Use when query type is unknown / dynamic (OR) You are writing generic / flexible code)

2. execute() returns a boolean as :
true → query returned a ResultSet (i.e., SELECT)
false → query returned update count (i.e., INSERT, UPDATE, DELETE)
{In JDBC, the execute() method is used when you don’t know what type of SQL query you are running (SELECT, INSERT, UPDATE, DELETE, etc.).}*/