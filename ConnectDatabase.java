package code;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectDatabase {
	
	private static String urlAddress = GetConnection.DB_URL_ADDRESS;
    private static String userId = GetConnection.DB_USER_NAME;
    private static String passwd = GetConnection.DB_USER_PASS;
    private static String jdbcDriver = GetConnection.DB_JDBC_DRIVER;

    public static Connection connection;
    public static Statement statement;

/*
  public static void main(String[] args)
  {

    try
    {
      DatabaseConnection dbconn = new DatabaseConnection();
      //update
      //Insert
      //Select
      // dbconn.queryStat("select count(*) from books");
      dbconn.close();
    }
    catch (Exception e) {
      System.err.println("Something went wrong");
      e.printStackTrace(System.err);
      }
    }
*/
    
  /** Create JdbcConection and get Connection to database. */
    
  public ConnectDatabase() throws ClassNotFoundException, SQLException {
    System.out.println("Getting connection ...");
    try
    {
        Class.forName(jdbcDriver);
    }
    catch(Exception e)
    {
        System.out.println("Driver problem "+ e);
    }
    try
    {
        connection = DriverManager.getConnection(urlAddress, userId, passwd);
        System.out.println("Database Connected successfully....");
    }
    catch(Exception ex)
    {
        System.out.println("Connection faild "+ ex);
    }

  }

  /** Issue update command. */
  public void updateStat(String command) throws SQLException
  {
    System.out.println("Executing update command \"" + command + "\" ...");
    statement = connection.createStatement();
    statement.executeUpdate(command);
    connection.commit();
    statement.close();
  }

  /** Issue insert command. */
  public void insertStat(String command) throws SQLException
  {
    System.out.println("Executing insert command \"" + command + "\" ...");
    statement = connection.createStatement();
    statement.executeUpdate(command);
    connection.commit();
    statement.close();
  }

  /** Issue delete command. */
  public void deleteStat(String command) throws SQLException
  {
    System.out.println("Executing delete command \"" + command + "\" ...");
    statement = connection.createStatement();
    statement.executeUpdate(command);
    connection.commit();
    statement.close();
  }

  
  /** Issue query command.
    * This is just an example reading a table with
    * 1st column float and 2nd column integer. */
  public ResultSet queryStat(String command) throws SQLException
  {
    System.out.println("Executing query command \"" + command + "\"...");
    statement = connection.createStatement();
    ResultSet rs = statement.executeQuery(command);
    return rs;
    }

  /** Close statement. */
  public void closeStatement() throws SQLException {
    System.out.println("Closing statement ... ");
    statement.close();
    }

  /** Close connection. */
  public void closeConnection() throws SQLException {
    System.out.println("Closing connection ... ");
    connection.close();
    }

}
