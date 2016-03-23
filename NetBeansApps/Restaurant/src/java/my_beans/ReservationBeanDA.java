/*
 NOT USED
 */

package my_beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author Chris
 */
public class ReservationBeanDA {
    public static boolean addReservation(ReservationBean rb){
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
            insertString = "INSERT INTO reservations VALUES (default, '"+rb.getStore()
                    + "', '"+rb.getName()
                    + "', '"+rb.getDate()
                    + "', "+rb.getNumGuest()
                    + ", '" +rb.getTime()
                    + "')";
            rowCount = stmt.executeUpdate(insertString);
            System.out.println("insert string =" + insertString);
            DBConn.close();
            if(rowCount!=0) return true;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return false;
    }

    public static String viewReservations(){
        String listRes = "";
        return listRes;
    }

}
