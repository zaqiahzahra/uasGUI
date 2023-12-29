/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author zaqiah ahmad
 */
public class delete {
    koneksi konek = new koneksi();

    public void delete (String nama, String nim, String prodi, String alamat) {

        try {
            konek.koneksi();
            Statement statement = konek.con.createStatement();
            // Use PreparedStatement to prevent SQL injection
            String sql = "delete from identitas where nim = nim ";
            
            // Create a PreparedStatement with the SQL query
            PreparedStatement preparedStatement = konek.con.prepareStatement(sql);
            
            // Set values for each parameter
            preparedStatement.setString(1, nama);
            preparedStatement.setString(3, nim);
            preparedStatement.setString(4, prodi);
            preparedStatement.setString(5, alamat);
            
            // Execute the update
            preparedStatement.executeUpdate();
            
            // Close the PreparedStatement
            preparedStatement.close();

            JOptionPane.showMessageDialog(null, "Berhasil Dihapus");
        } catch (Exception ex) {
            ex.printStackTrace(); // Print the stack trace for debugging
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
