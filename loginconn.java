import java.sql.*;


public class helloDb{
    public static void main(String[] args){
        try{
        Connection conn = null;
        String connString = "jdbc:sqlite:login.db";  //driver:type:path
        conn = DriverManager.getConnection(connString);  
        System.out.println("Connected");

        Statement stm = conn.createStatement();
        String sql = "Select * from student";
        ResultSet result = stm.executeQuery(sql);  //executequery ; excute ; executeupdate  (statement ko through bata link gardai xa)
        
        //studentid int, firstname text, lastname text
        while (result.next()){ //use of next to control loop
            int studentid = result.getInt("studentid");
            String fname = result.getString("firstname");
            String lname = result.getString("lastname");

            System.err.println("The details: "+ studentid + " " + fname + " " + lname);
        }

        }catch(SQLException ex){ //generic expection
            System.out.println("Error");
            System.out.println(ex.getMessage());
        }
    }
}


//Output:

//javac helloDb.java
//java -classpath ".;sqlite-jdbc-3.39.3.0.jar" helloDb.java