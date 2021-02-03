package pl.coderslab.MVC_Workshop.utils;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class DbUtil {
    private static DataSource dataSource;


    public static Connection getConnection() throws SQLException {
        DataSource ds = getInstance();
        return ds.getConnection();
    }

    private static DataSource getInstance() {
        if (dataSource == null) {
            try {
                Context initialContext = new InitialContext();
                Context envContext = (Context) initialContext.lookup("java:/comp/env");
                dataSource = (DataSource) envContext.lookup("/jdbc/users");
            } catch (NamingException e) {
                e.printStackTrace();
            }

        }
        return dataSource;
    }

}
