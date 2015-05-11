package code;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MyConnectDatabase {
	
	private static String urlAddress = MyGetConnection.DB_URL_ADDRESS;
    private static String userId = MyGetConnection.DB_USER_NAME;
    private static String passwd = MyGetConnection.DB_USER_PASS;
    private static String jdbcDriver = MyGetConnection.DB_JDBC_DRIVER;

    public static Connection connection;
    public static Statement stmt;


    
  public MyConnectDatabase() throws ClassNotFoundException, SQLException {
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
    stmt = connection.createStatement();
    stmt.executeUpdate(command);
    connection.commit();
    stmt.close();
  }

  /** Issue insert command. */
  public void insertStat(String command) throws SQLException
  {
    System.out.println("Executing insert command \"" + command + "\" ...");
    stmt = connection.createStatement();
    stmt.executeUpdate(command);
    connection.commit();
    stmt.close();
  }

  /** Issue delete command. */
  public void deleteStat(String command) throws SQLException
  {
    System.out.println("Executing delete command \"" + command + "\" ...");
    stmt = connection.createStatement();
    stmt.executeUpdate(command);
    connection.commit();
    stmt.close();
  }

  
  /** Issue query command.
    * This is just an example reading a table with
    * 1st column float and 2nd column integer. */
  public ResultSet queryStat(String command) throws SQLException
  {
    System.out.println("Executing query command \"" + command + "\"...");
    stmt = connection.createStatement();
    System.out.println("\t\t >>>>>> 2 error at class" + getClass());
    ResultSet rs = stmt.executeQuery(command);
    return rs;
    }

  /** Close statement. */
  public void closeStatement() throws SQLException {
    System.out.println("Closing statement ... ");
    stmt.close();
    }

  /** Close connection. */
  public void closeConnection() throws SQLException {
    System.out.println("Closing connection ... ");
    connection.close();
    }

}
