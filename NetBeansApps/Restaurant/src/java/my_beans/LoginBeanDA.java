/*
 * LoginBeanDA.java
 * Clint Riley, Chris Olson
 * March 27, 2010
 */

package my_beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Data access class for login process.
 *
 * @author Clint
 */
public class LoginBeanDA {

    /**
     * Checks the passed in values against the database.
     * @param username
     * @param password
     * @return true if this is a valid un/pw combination, false otherwise
     */
    public static LoginBean validInfo(String username, String password) {
        LoginBean lb= null;
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException e) {
            System.err.println(e.getMessage());
            System.exit(0);
        }
        try {
            String myDB = "jdbc:derby://localhost:1527/restaurantDB";
            Connection DBConn = DriverManager.getConnection(myDB, "itkstu", "student");

            // The ? below are parameters (i.e., placeholders) to the query and are resolved
            // in the setString method below
            String queryString = "select * from restaurantDB.Users where USERNAME = ? and PASSWORD = ?";

            // Note the use of a diff class, called PreparedStatement
            PreparedStatement pstmt = DBConn.prepareStatement( queryString );
            pstmt.setString( 1, username); // replace the 1st ? with username
            pstmt.setString( 2, password); // replace the 2nd ? with password
            ResultSet rs = pstmt.executeQuery( );
            
            boolean r = rs.next();
            if(r){
                lb = new LoginBean();
                lb.setEmail(rs.getString("email"));
                lb.setFullName(rs.getString("fullname"));
                lb.setFavStore(rs.getString("favoritestore"));
            }
            DBConn.close();
            return lb;

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return null;

    }

    public static boolean usernameTaken(String username){
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException e) {
            System.err.println(e.getMessage());
            System.exit(0);
        }
        try {
            String myDB = "jdbc:derby://localhost:1527/restaurantDB";
            Connection DBConn = DriverManager.getConnection(myDB, "itkstu", "student");


            String queryString = "select * from restaurantDB.Users where USERNAME = '" + username + "'";
            Statement stmt = DBConn.createStatement();

            ResultSet rs = stmt.executeQuery(queryString);

            boolean r = rs.next();

            DBConn.close();
            return r;

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return false;
    }

    public static int storeCustomerToDB(LoginBean cust) {
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException e) {
            System.err.println(e.getMessage());
            System.exit(0);
        }
        int rowCount = 0;
        try {
            String myDB = "jdbc:derby://localhost:1527/restaurantDB";
            Connection DBConn = DriverManager.getConnection(myDB, "itkstu", "student");

            String insertString;
            Statement stmt = DBConn.createStatement();
            insertString = "INSERT INTO RestaurantDB.Users VALUES ('"
                    + cust.getFullName()
                    + "', '" + cust.getUsername()
                    + "', '"+cust.getFavStore()+"', '" +cust.getPassword()
                    + "', '','', '"+cust.getEmail()
                    + "')";
            rowCount = stmt.executeUpdate(insertString);
            System.out.println("insert string =" + insertString);
            DBConn.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        // if insert is successful, rowCount will be set to 1 (1 row inserted successfully). Else, insert failed.
        return rowCount;

    }

    public static int updateCustomerToDB(LoginBean cust) {
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException e) {
            System.err.println(e.getMessage());
            System.exit(0);
        }
        int rowCount = 0;
        try {
            String myDB = "jdbc:derby://localhost:1527/restaurantDB";
            Connection DBConn = DriverManager.getConnection(myDB, "itkstu", "student");

            String insertString;
            Statement stmt = DBConn.createStatement();
            insertString = "UPDATE RestaurantDB.Users set ";
            insertString += (cust.getFullName().equals("")?"":"fullname='"+ cust.getFullName()+"',");
            insertString += (cust.getPassword().equals("")?"":"password='" +cust.getPassword()+"',");
            insertString += (cust.getEmail().equals("")?"":"email='"+cust.getEmail()+"',");
            insertString += (cust.getFavStore().equals("")?"":"favoritestore='"+cust.getFavStore()+"',");
            insertString += " username = '"+cust.getUsername()+"' ";
            insertString += " where username='"+cust.getUsername()+"'";
            rowCount = stmt.executeUpdate(insertString);
            System.out.println("insert string =" + insertString);
            DBConn.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        // if insert is successful, rowCount will be set to 1 (1 row inserted successfully). Else, insert failed.
        return rowCount;

    }
}
