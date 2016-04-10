package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.UserBean;

/**
 * @author ldacruz
 */
public class UserDAO {

    public boolean createUser(UserBean theModel) {
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException e) {
            System.err.println(e.getMessage());
            System.exit(0);
        }

        int rowCount = 0;
        try {
            String myDB = "jdbc:derby://localhost:1527/Project353";
            try (Connection DBConn = DriverManager.getConnection(myDB, "itkstu", "student")) {
                Statement stmt = DBConn.createStatement();
                String insertString;
                insertString = "INSERT INTO Project353.Users (first_name,"
                    + "last_name, email, username, sec_question, sec_answer)"
                    + " VALUES ('"
                    + theModel.getFirstName() + "','"
                    + theModel.getLastName() + "','"
                    + theModel.getEmail() + "','"
                    + theModel.getUsername() + "','"
                    + theModel.getSecQuestion() + "','"
                    + theModel.getSecAnswer() + "')";
                rowCount = stmt.executeUpdate(insertString);
                
                insertString = "INSERT INTO Project353.LoginInfo VALUES ('"
                    + theModel.getUsername() + "','"
                    + theModel.getPassword() + "')";
                rowCount = stmt.executeUpdate(insertString);
                
                DBConn.close();
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        System.out.println("rowCount = " + rowCount);
        return rowCount == 1;
    }
    
    public boolean updateUser(UserBean theModel) {
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException e) {
            System.err.println(e.getMessage());
            System.exit(0);
        }

        int rowCount = 0;
        try {
            String myDB = "jdbc:derby://localhost:1527/Project353";
            try (Connection DBConn = DriverManager.getConnection(myDB, "itkstu", "student")) {
                Statement stmt = DBConn.createStatement();
                String updateString;
                updateString = "UPDATE Project353.Users SET "
                    + "first_name = '" + theModel.getFirstName() + "', "
                    + "last_name = '" + theModel.getLastName() + "', "
                    + "email = '" + theModel.getEmail() + "', "
                    + "sec_question = '" + theModel.getSecQuestion() + "', "
                    + "sec_answer = '" + theModel.getSecAnswer() + "' "
                    + "WHERE username = '" + theModel.getUsername() + "'";
                
                System.out.println("updateString = " + updateString);
                
                rowCount = stmt.executeUpdate(updateString);
                
                updateString = "UPDATE Project353.LoginInfo SET "
                    + "PASSWORD = '" + theModel.getPassword() + "' "
                    + "WHERE USERID = '" + theModel.getUsername() + "'";
                rowCount = stmt.executeUpdate(updateString);
                
                DBConn.close();
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        return rowCount == 1;
    }
    
    public int countByUsername(String userName) {
        String query = "SELECT * FROM Project353.Users WHERE username = '"
            + userName + "'";
        
        Connection DBConn = null;
        int count = 0;
        try {
            DBHelper.loadDriver("org.apache.derby.jdbc.ClientDriver");
            String myDB = "jdbc:derby://localhost:1527/Project353";
            DBConn = DBHelper.connect2DB(myDB, "itkstu", "student");

            Statement stmt = DBConn.createStatement();
            ResultSet rs = stmt.executeQuery(query);          
            
            while (rs.next()) {
                count++;
            }
            
            rs.close();
            stmt.close();
        } catch (Exception e) {
            System.err.println("ERROR: Problems with SQL select");
            e.printStackTrace();
        }
        
        try {
            DBConn.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        
        return count;
    }
    
    public boolean checkLogin(String username, String password) {
        String query = "SELECT * FROM Project353.LoginInfo WHERE USERID = '"
            + username + "' AND PASSWORD = '" + password + "'";
        
        Connection DBConn = null;
        int count = 0;
        try {
            DBHelper.loadDriver("org.apache.derby.jdbc.ClientDriver");
            String myDB = "jdbc:derby://localhost:1527/Project353";
            DBConn = DBHelper.connect2DB(myDB, "itkstu", "student");

            Statement stmt = DBConn.createStatement();
            ResultSet rs = stmt.executeQuery(query);          
            
            while (rs.next()) {
                count++;
            }
            
            rs.close();
            stmt.close();
        } catch (Exception e) {
            System.err.println("ERROR: Problems with SQL select");
            e.printStackTrace();
        }
        
        try {
            DBConn.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        
        return count > 0;
    }
    
    public void setModelData(UserBean theModel) {
        String query = "SELECT * FROM Project353.Users WHERE username = '"
            + theModel.getUsername() + "'";
        
        Connection DBConn = null;
        int count = 0;
        try {
            DBHelper.loadDriver("org.apache.derby.jdbc.ClientDriver");
            String myDB = "jdbc:derby://localhost:1527/Project353";
            DBConn = DBHelper.connect2DB(myDB, "itkstu", "student");

            Statement stmt = DBConn.createStatement();
            ResultSet rs = stmt.executeQuery(query);          
            
            while (rs.next()) {
                theModel.setFirstName(rs.getString("first_name"));
                theModel.setLastName(rs.getString("last_name"));
                theModel.setEmail(rs.getString("email"));
                theModel.setSecQuestion(rs.getString("sec_question"));
                theModel.setSecAnswer(rs.getString("sec_answer"));
            }
            
            rs.close();
            stmt.close();
        } catch (Exception e) {
            System.err.println("ERROR: Problems with SQL select");
            e.printStackTrace();
        }
        
        try {
            DBConn.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
