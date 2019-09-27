/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businessLogics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class connect_seagame {
    static String user = "root";
    static String pass = "";
    static String url = "jdbc:mysql://localhost:3306/seagame2019?useUnicode=true&characterEncoding=utf8";

    public static Connection KetnoiCSDL() {
        Connection cnn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cnn = DriverManager.getConnection(url, user, pass);
        } catch (ClassNotFoundException ex) {
        } catch (SQLException ex) {
            Logger.getLogger(connect_seagame.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cnn;
    }
    
}
