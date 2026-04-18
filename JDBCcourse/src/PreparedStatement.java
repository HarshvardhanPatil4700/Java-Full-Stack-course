import java.sql.*;

public class PreparedStatement {
    public static void main() throws ClassNotFoundException, SQLException {

        int sid = 101;
        String sname = "William";
        int smark = 60;

        String url = "jdbc:postgresql://localhost:5432/demo";
        String uname = "postgres";
        String passw = "1234";

        // PROBLEM 1 : Concatenation - we need to put multiple + to use the UserInput in the sql queries
        String sql = "insert into student values (" + sid + " , '" + sname + "' , " + smark + ")";

        // PROBLEM 2: Since, values are coming from user, there are possibilities of SQL INJECTION which causes data leakage or unintended data modification
        // PROBLEM 3: Improve performance by CACHING the sql queries (when we want to execute a query multiple times then, java has to send same query to DB multiple times Instead Cache that query and use as many times
        // These PROBLEMS can be solved using PREPARED STATEMENT

        Connection con = DriverManager.getConnection(url,uname,passw);// to connect application to database we do it by connection object
        System.out.println("Connected Successfully!");

        Statement st = con.createStatement();
        boolean status = st.execute(sql);
        System.out.println(status);

        con.close();
        System.out.println("Connection closed!");
    }
}
