package Connect;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author quang
 */
public class ketNoi {

    public  Connection cn;
    public static String user, pass;

    static {
        try {
            BufferedReader bfr = new BufferedReader(new FileReader("driver.txt"));
            user = bfr.readLine();
            pass = bfr.readLine();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Failed: Lỗi đọc file driver: " + ex);
        }
    }

    protected static void driverTest() throws Exception {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (java.lang.ClassNotFoundException e) {
            throw new Exception("MySQL JDBC Driver not found ..." + e);
        }
    }

    public void connect(){
        try {
            ketNoi.driverTest();
            InetAddress host = InetAddress.getLocalHost();
            String localhost = host.getHostName();
            cn = DriverManager.getConnection("jdbc:sqlserver://" + localhost + ":1433;databaseName=QLHOBOI", user, pass);
            System.out.println("Kết nối thành công");
        } catch (UnknownHostException ex) {
            System.out.println("Lỗi kết nối" + ex);
        } catch (Exception e) {
            System.out.println("Lỗi kết nối" + e);
        }
    }

}
