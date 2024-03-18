import java.sql.*;


public class LoginProcess{
    //connection string
    String connString = "jdbc:sqlite:login.db";
    Connection conn;

    LoginProcess() throws SQLException { 
        conn = DriverManager.getConnection(connString);
    }

    // dologin
    public boolean dologin(String username, String password){
        //read the data
        //check if data exist
        // if yes : login success : return true
        // else login failed : return false

        try{

        String sql = "select * from users where userid='" + username + "'";
        // select * from users where username='abhishek'
        Statement stmt = conn.createStatement();
        ResultSet rs= stmt.executeQuery(sql);
        if(rs.next()){
            //you got a result -> user exists
            String pwd= rs.getString("pwd");
            if(pwd.equals(password)) return true;
            else return false;
        }else{ //user does not exits
            return false;
        }
    }catch(SQLException ex){
        return false;
    }
    }
}