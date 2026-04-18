import java.sql.*;

public class PreparedStatementDemo {
    public static void main() throws ClassNotFoundException, SQLException {

        int sid = 102;
        String sname = "Jarvis";
        int marks = 70;

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
        st.setString(2,sname);
        st.setInt(3,marks);

//        boolean status = st.execute(sql);
//        System.out.println(status);
        int rows = st.executeUpdate();
        System.out.println("Rows inserted: " + rows);

        con.close();
    }
}
/*
import java.sql.*;

public class StatementExample {
    public static void main(String[] args) throws Exception {

        int id = 202;
        String name = "Steve";
        int marks = 90;

        String url = "jdbc:postgresql://localhost:5432/demo";
        String user = "postgres";
        String password = "1234";

        Connection con = DriverManager.getConnection(url, user, password);

        Statement st = con.createStatement();

        // ❌ Concatenation (unsafe)
        String sql = "INSERT INTO student(id, name, marks) VALUES ("
                + id + ", '" + name + "', " + marks + ")";

        int rows = st.executeUpdate(sql);
        System.out.println("Rows inserted: " + rows);

        con.close();
    }
}

USING PreparedStatement :-
import java.sql.*;

public class PreparedStatementExample {
    public static void main(String[] args) throws Exception {

        // Data (can be user input)
        int id = 201;
        String name = "Tony";
        int marks = 85;

        // DB details
        String url = "jdbc:postgresql://localhost:5432/demo";
        String user = "postgres";
        String password = "1234";

        // SQL with placeholders
        String sql = "INSERT INTO student(id, name, marks) VALUES (?, ?, ?)";

        // Step 1: Connection
        Connection con = DriverManager.getConnection(url, user, password);

        // Step 2: Prepare statement
        PreparedStatement ps = con.prepareStatement(sql);

        // Step 3: Set values
        ps.setInt(1, id);
        ps.setString(2, name);
        ps.setInt(3, marks);

        // Step 4: Execute
        int rows = ps.executeUpdate();

        System.out.println("Rows inserted: " + rows);

        // Step 5: Close
        con.close();
    }
}
---------------------------------------------------------------------------------------------------------------------------
Example: SELECT using PreparedStatement
String sql = "SELECT * FROM student WHERE id = ?";

PreparedStatement ps = con.prepareStatement(sql);
ps.setInt(1, 201);

ResultSet rs = ps.executeQuery();

while (rs.next()) {
    System.out.println(
        rs.getInt("id") + " " +
        rs.getString("name") + " " +
        rs.getInt("marks")
    );
}
 */
