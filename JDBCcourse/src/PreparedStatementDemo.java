import java.sql.*;

public class PreparedStatement {
    public static void main() throws ClassNotFoundException, SQLException {

        int sid = 101;
        String sname = "William";
        int smark = 60;

        String url = "jdbc:postgresql://localhost:5432/demo";
        String uname = "postgres";
        String passw = "1234";

        // PROBLEM 1 : Concatenation - we need to put multiple + to use the UserInput in the sql queries as :
        // String sql = "insert into student values (" + sid + " , '" + sname + "' , " + smark + ")";
        // Solution 1:
        String sql = "insert into student values (?,?,?)";

        // PROBLEM 2: Since, values are coming from user, there are possibilities of SQL INJECTION which causes data leakage or unintended data modification
        // PROBLEM 3: Improve performance by CACHING the sql queries (when we want to execute a query multiple times then, java has to send same query to DB multiple times Instead Cache that query and use as many times
        // These PROBLEMS can be solved using PREPARED STATEMENT

        Connection con = DriverManager.getConnection(url,uname,passw);// to connect application to database we do it by connection object

        // Statement st = con.createStatement(); Use Statement when sql query is simple and static (no user i/p).It has Sql injection risk and it is slower than PreparedStatement
        PreparedStatement st = con.prepareStatement(sql);
        st.setInt(1,sid);
        boolean status = st.execute(sql);
        System.out.println(status);

        con.close();
    }
}
