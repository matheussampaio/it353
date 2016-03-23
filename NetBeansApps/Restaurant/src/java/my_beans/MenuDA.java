/*
 * MenuDA.java
 * Clint Riley Chris Olson
 *
 * Data access for MenuBean
 */
package my_beans;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;


/**
 *
 * @author Clint
 */
public class MenuDA {

    /**
     * Add feedback for the food item
     * @param id food item ID
     * @param rtg Rating of 1-5
     * @param name Name of user
     * @param fb Comments
     */
    public static void feedback(int id, String rtg, String name, String fb) {
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException e) {
            System.err.println(e.getMessage());
            System.exit(0);
        }
        try {
            String myDB = "jdbc:derby://localhost:1527/restaurantDB";
            Connection DBConn = DriverManager.getConnection(myDB, "itkstu", "student");

            String insertString = "insert into food_feedback values(default, " + id + ", '" + name + "', current_timestamp, '" + fb + "'," + rtg +")";

            Statement stmt = DBConn.createStatement();

            stmt.executeUpdate(insertString);

            DBConn.close();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }

    }

    /**
     * Find how many reviews for this specific food item
     * @param id food item ID
     * @return Review count
     */

    public static int getCount(int id) {
        int i = 2;
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException e) {
            System.err.println(e.getMessage());
            System.exit(0);
        }
        try {
            String myDB = "jdbc:derby://localhost:1527/restaurantDB";
            Connection DBConn = DriverManager.getConnection(myDB, "itkstu", "student");

            String selectString = "select count(score) as a from food_feedback where food_feedback.food_id = " + id + "";

            Statement stmt = DBConn.createStatement();
            ResultSet rs = stmt.executeQuery(selectString);
            rs.next();

            int r = rs.getInt("a");
            DBConn.close();
            return r;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }

        return 0;

    }

    /**
     * Finds the average score for food item
     * @param id Food item ID
     * @return Average score
     */
    public static double getAverage(int id) {
        int i = 2;
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException e) {
            System.err.println(e.getMessage());
            System.exit(0);
        }
        try {
            String myDB = "jdbc:derby://localhost:1527/restaurantDB";
            Connection DBConn = DriverManager.getConnection(myDB, "itkstu", "student");

            String selectString = "select avg(score) as a from food_feedback where food_feedback.food_id = " + id + "";

            Statement stmt = DBConn.createStatement();
            ResultSet rs = stmt.executeQuery(selectString);
            rs.next();

            double r = rs.getDouble("a");
            DBConn.close();
            return r;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }

        return 0;

    }

    /**
     *
     * @param id Food item
     * @return Vector of Strings representing the feedback in HTML format
     */
    public static Vector<String> getFeedback(int id) {
        Vector<String> rv = new Vector<String>();
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException e) {
            System.err.println(e.getMessage());
            System.exit(0);
        }
        try {
            String myDB = "jdbc:derby://localhost:1527/restaurantDB";
            Connection DBConn = DriverManager.getConnection(myDB, "itkstu", "student");

            String selectString = "select * from food_feedback where food_feedback.food_id = " + id + "";

            Statement stmt = DBConn.createStatement();
            stmt.setMaxRows(5);
            ResultSet rs = stmt.executeQuery(selectString);

            int ct = 0;
            while(rs.next()) {
                String bgString = (ct % 2 == 0) ? "#cccccc" : "#aaaaaa";
                String s = "<div style=\"border: 1px solid black; background-color: " + bgString + "\"><blockquote>Posted by ";
                s += rs.getString("username").equals("") ? "Anonymous" : rs.getString("username");
                s += " on " + rs.getDate("comment_date");
                s += "</blockquote>";

                s += "<p><strong>("  + rs.getInt("score") + "/5)</strong>" + rs.getString("content") + "</p></div>";
                rv.add(s);
                ct++;
            }

            DBConn.close();
            return rv;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }

        return null;

    }

    /**
     * Returns the specific menu item corresponding to the ID
     * @param id The item ID
     * @return MenuItem containing relevant information
     */

    public static MenuItem getMenuData(int id) {

        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException e) {
            System.err.println(e.getMessage());
            System.exit(0);
        }
        try {
            String myDB = "jdbc:derby://localhost:1527/restaurantDB";
            Connection DBConn = DriverManager.getConnection(myDB, "itkstu", "student");

            String selectString = "select * from food_items where food_items.id = " + id + "";

            Statement stmt = DBConn.createStatement();
            MenuItem m = new MenuItem();
            ResultSet rs = stmt.executeQuery(selectString);
            if(!rs.next()) return null;
            m.setId(rs.getInt("id"));
            m.name = rs.getString("name");
            m.setDescription(rs.getString("description"));
            m.setPrice(rs.getDouble("price"));
            m.setCategory(rs.getString("category"));
            m.setImg_path(rs.getString("img_path"));

            DBConn.close();
            return m;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }

        return null;
    }

    /**
     * Returns all menu items.
     *
     */
    public static Vector<MenuItem> fullMenuList() {
        Vector<MenuItem> rVal = new Vector<MenuItem>();
        String rString = "";
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

            String selectString = "select * from food_items order by food_items.category, food_items.name";

            Statement stmt = DBConn.createStatement();

            ResultSet rs = stmt.executeQuery(selectString);
            while(rs.next()) {
                rVal.add(new MenuItem(rs.getInt("id"), rs.getString("name"), rs.getString("description"), rs.getDouble("price"), rs.getString("category"), rs.getString("img_path")));
            }

            DBConn.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        
        return rVal;
    }

    /**
     * Returns menu listings of the specified type
     * @param s type
     * @return Vector of all menu items in the category
     */
    public static Vector<MenuItem> subMenuList(String s) {
        Vector<MenuItem> rVal = new Vector<MenuItem>();
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

            String selectString = "select * from food_items";
            if(s.equals("")) {
                ;
            } else {
                selectString += " where food_items.category = '" + s + "' ";
            }
            selectString += " order by food_items.category, food_items.name";
            Statement stmt = DBConn.createStatement();

            ResultSet rs = stmt.executeQuery(selectString);
            while(rs.next()) {
                rVal.add(new MenuItem(rs.getInt("id"), rs.getString("name"), rs.getString("description"), rs.getDouble("price"), rs.getString("category"), rs.getString("img_path")));
            }

            DBConn.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }

        return rVal;
    }
}
