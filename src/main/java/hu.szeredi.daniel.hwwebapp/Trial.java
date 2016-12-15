package hu.szeredi.daniel.hwwebapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.*;

import com.microsoft.sqlserver.jdbc.*;

@Controller
@EnableAutoConfiguration
@SpringBootApplication
public class Trial {
    @RequestMapping("/zumm")
    @ResponseBody
    String home(){
        return "I'm in your applicatioun";
    }

    @RequestMapping("/")
    @ResponseBody
    String asdhome(){
        return "Isadasdasdas'm in your applicatioun";
    }

    @RequestMapping("/tables")
    @ResponseBody
    String getTables(){
        Connection conn = null;
        Statement statement = null;
        ResultSet resultSet = null;
        String username = System.getenv("SQLAZURECONNSTR_username");
        String password = System.getenv("SQLAZURECONNSTR_password");
        String connString = String.format("jdbc:sqlserver://dsz-hw.database.windows.net:1433;database=hw-db;user=%s@dsz-hw;password=%s;encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30;", username, password);
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
            conn = DriverManager.getConnection(connString);
            String selectSql = "SELECT name FROM sys.tables";
            statement = conn.createStatement();
            resultSet = statement.executeQuery(selectSql);
            StringBuilder sb = new StringBuilder();
            while(resultSet.next()){
                sb.append(resultSet.getString(1));
                sb.append(", ");
            }
            sb.append(String.format("\nUsername: %s", username));
            return sb.toString();
        }
        catch (Exception e){
            return String.format("Error occured wondrously! %s", e.toString());
        }
        finally {
            if (resultSet != null) try { resultSet.close(); } catch(Exception e) {}
            if (statement != null) try { statement.close(); } catch(Exception e) {}
            if(conn != null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    // OJJOJOJ
                }
            }
        }*/
    }

    @RequestMapping("/test")
    @ResponseBody
    String testme() {
        return "asdfasdf";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Trial.class, args);
    }

}
