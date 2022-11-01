package mobex.mssql;  
// https://razorsql.com/articles/ms_sql_server_jdbc_connect.html
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
// import mypack.JdbcToolBossConnection;

public class JdbcAllTests {
 
  public static void main(String[] args) {

      // https://stackoverflow.com/questions/26269193/how-to-call-a-method-function-from-another-class
      // B b; // A reference to B
      // b = new B(); // Creating object of class B
      // b.doSomething();  // Calling a method contained in class B from class A
      AzureDwMsDriver adw;
      adw = new AzureDwMsDriver();
      String[] adw_args = {"aa", "bb"}; // These are not used
      adw.connect(adw_args);
      JdbcToolBossMsDriver msTb;
      msTb = new JdbcToolBossMsDriver();
      String[] tb_args = {"aa", "bb"}; // These are not used
      msTb.connect(tb_args);
      JdbcToolBossJtdsDriver jtdsTb;
      jtdsTb = new JdbcToolBossJtdsDriver();
      String[] tb_jtds_args = {"aa", "bb"}; // These are not used
      jtdsTb.connect(tb_jtds_args);


        // conn = DriverManager.getConnection(dbURL, user, pass);
        // if (conn != null) {
        //     DatabaseMetaData dm = (DatabaseMetaData) conn.getMetaData();
        //     System.out.println("Driver name: " + dm.getDriverName());
        //     System.out.println("Driver version: " + dm.getDriverVersion());
        //     System.out.println("Product name: " + dm.getDatabaseProductName());
        //     System.out.println("Product version: " + dm.getDatabaseProductVersion());
        // }

  }
}