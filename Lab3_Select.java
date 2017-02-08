import java.sql.*;

public class Lab3_Select
{
  public static void main( String args[] )
  {
    Connection c = null;
    Statement stmt = null;
    try {
      Class.forName("org.sqlite.JDBC");
      c = DriverManager.getConnection("jdbc:sqlite:lab3.db");
      c.setAutoCommit(false);
      System.out.println("Opened database successfully");

      stmt = c.createStatement();
      ResultSet rs = stmt.executeQuery( "SELECT * FROM STU_DATA;" );
      while ( rs.next() ) {
         int id = rs.getInt("sap_id");
         String  name = rs.getString("name");
         int age  = rs.getInt("age");
         String  ROLL = rs.getString("ROLL");
         String batch = rs.getString("batch");
         System.out.println( "SAP_ID = " + id );
         System.out.println( "NAME = " + name );
         System.out.println( "AGE = " + age );
         System.out.println( "ROLL = " + ROLL );
         System.out.println( "BATCH = " + batch );
         System.out.println();
      }
      rs.close();
      stmt.close();
      c.close();
    } catch ( Exception e ) {
      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
      System.exit(0);
    }
    System.out.println("Operation done successfully");
  }
}