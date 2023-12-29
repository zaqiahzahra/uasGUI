/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package GUI;
import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class insert {
    koneksi konek = new koneksi();

    public void insert(String nama, int nim, String prodi, String alamat) {

        try {
            konek.koneksi();
            Statement statement = konek.con.createStatement();
            //String sql = "insert into mhs_ilkom (nama, nim, prodi, alamat) values (?, ?, ?, ?)";
            String sql = "insert into z values('" + nim + "','" + nama + "','" + prodi + "','" +alamat + "')";
            statement.executeUpdate(sql);
            statement.close();
           

            JOptionPane.showMessageDialog(null, "Berhasil Disimpan");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}
