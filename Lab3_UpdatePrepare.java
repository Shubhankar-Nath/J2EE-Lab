import java.sql.*;

public class Lab3_UpdatePrepare

{
  public static void main( String args[] )
  {
    Connection c = null;
    //Statement stmt = null;
    try {
      Class.forName("org.sqlite.JDBC");
      c = DriverManager.getConnection("jdbc:sqlite:lab3.db");
      c.setAutoCommit(false);
      System.out.println("Opened database successfully");

PreparedStatement stmt=null;
      
      String sql = " UPDATE STU_DATA SET NAME='Subhankar' WHERE SAP_ID = ? "; 
      stmt = c.prepareStatement(sql);
      stmt.setInt(1,500040643);
      
      
      ResultSet rs = stmt.executeQuery(sql);
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

    //  stmt.close();
     // c.commit();
     // c.close();
    } catch ( Exception e ) {
      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
      System.exit(0);
    }
    System.out.println("Records created successfully");
  }
}