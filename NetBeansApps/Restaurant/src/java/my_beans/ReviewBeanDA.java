/*
 * ReviewBeanDA.java
 * Clint Riley Chris Olson
 *
 * Data access for reviewbean
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
public class ReviewBeanDA {

    public static String getReviewsByLocation(String storeName) {
        String allReviews ="";
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException e) {
            System.err.println(e.getMessage());
            System.exit(0);
        }
        try {
            String myDB = "jdbc:derby://localhost:1527/restaurantDB";
            Connection DBConn = DriverManager.getConnection(myDB, "itkstu", "student");

            String selectString = "select * from reviews where store_name = '" + storeName+ "'";

            Statement stmt = DBConn.createStatement();

            ResultSet rs = stmt.executeQuery(selectString);
            while(rs.next()) {
                String author = rs.getString("author");
                String review_text = rs.getString("review_text");
                int rating = rs.getInt("rating");
                allReviews+= "\""+review_text+"\"<br/> -"+author+"<br/><br/>";
            }

            DBConn.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }

        return allReviews;
    }

    public static void submitReview(String author, String store, String text, int rating){
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException e) {
            System.err.println(e.getMessage());
            System.exit(0);
        }
        try {
            String myDB = "jdbc:derby://localhost:1527/restaurantDB";
            Connection DBConn = DriverManager.getConnection(myDB, "itkstu", "student");

            String insertString = "insert into reviews values(default, '" + store + "', '"+author+"', " + rating + ",'" + text +"', current_timestamp)";

            Statement stmt = DBConn.createStatement();

            stmt.executeUpdate(insertString);

            DBConn.close();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public static String getAllReviews(){
        String allReviews ="";
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException e) {
            System.err.println(e.getMessage());
            System.exit(0);
        }
        try {
            String myDB = "jdbc:derby://localhost:1527/restaurantDB";
            Connection DBConn = DriverManager.getConnection(myDB, "itkstu", "student");

            String selectString = "select * from reviews";

            Statement stmt = DBConn.createStatement();

            ResultSet rs = stmt.executeQuery(selectString);
            while(rs.next()) {
                String author = rs.getString("author");
                String review_text = rs.getString("review_text");
                int rating = rs.getInt("rating");
                
                allReviews+= "<div style='width:500px; height:100%; border-bottom: 1px solid #BBBBBB; margin-left:auto; margin-right:auto;margin-bottom:15px;'>\""+review_text+"\"<strong>("+rating+"/5)</strong><br/> -"+author+"</div>";
            }

            DBConn.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }

        return allReviews;
    }
}
