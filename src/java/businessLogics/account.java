/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businessLogics;

import businessLogics.connect_seagame;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class account {

    public int Kiemtra(String taikhoan, String matkhau) {
        Connection cnn = connect_seagame.KetnoiCSDL();
        if (cnn == null) {
            return -1;
        }
        String sql = "SELECT * FROM sltb_user WHERE username=? and password=?";
        try {
            PreparedStatement smt = cnn.prepareStatement(sql);
            smt.setString(1, taikhoan);
            smt.setString(2, matkhau);
            ResultSet rs = smt.executeQuery();
            if (rs.next()) // nếu tồn tại dữ liệu thì trả về 
            {
                return 1;
            } else {
                return 0;
            }
        } catch (SQLException ex) {
            Logger.getLogger(account.class.getName()).log(Level.SEVERE, null, ex);
            return -2; // lỗi sql
        }
    }
}
