import java.sql.*;

public class Lab3_Insert

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
      String sql = "INSERT INTO STU_DATA (SAP_ID,NAME,AGE,ROLL,BATCH) " +
                   "VALUES (500037844, 'Shubhankar Nath', 21, 'R134214062', 'CSF' );"; 
      stmt.executeUpdate(sql);

      sql = "INSERT INTO STU_DATA (SAP_ID,NAME,AGE,ROLL,BATCH) " +
            "VALUES (500039874, 'Vinit Naag', 21, 'R134214046', 'CSF' );"; 
      stmt.executeUpdate(sql);

      sql = "INSERT INTO STU_DATA (SAP_ID,NAME,AGE,ROLL,BATCH) " +
            "VALUES (500097944, 'Rohit Kapoor', 21, 'R134214022', 'CSF' );"; 
      stmt.executeUpdate(sql);

      stmt.close();
      c.commit();
      c.close();
    } catch ( Exception e ) {
      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
      System.exit(0);
    }
    System.out.println("Records created successfully");
  }
}