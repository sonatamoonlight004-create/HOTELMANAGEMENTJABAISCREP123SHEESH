/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel_management_system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USER
 */
public class sayang {
     /*try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myhotel_db", "root", "1234");
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM room");

        DefaultTableModel model = (DefaultTableModel) JTableManageRoom.getModel();
        model.setRowCount(0); // Clear table

        while (rs.next()) {
            Object[] row = {
                rs.getString("RoomNumber"),
                rs.getString("RoomType"),
                rs.getString("BedType"),
                rs.getString("Price"),
                rs.getString("Status")
            };
            model.addRow(row);
        }

        rs.close();
        st.close();
        con.close();

    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error loading data: " + e.getMessage());
    }
*/
}
