import java.sql.*;
/**
 * File : MySQLPersonDAO.java
 * Deskripsi : Implementasi PersonDAO untuk MySQL
 */

public class MySQLPersonDAO implements PersonDAO{
    @Override
    public void savePerson(Person person)throws Exception{
        String name = person.getName();
        //membuat koneksi, nama db, user, password menyesuaikan
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(
                            "jdbc:mysql://localhost/pbo","root","Toyyy0512.");
        //kerjakan mysql query
        System.out.println("query");
        String query = "INSERT INTO person(name) VALUES('"+name+"')";
        Statement s = con.createStatement();
        s.executeUpdate(query);
        //tutup koneksi database
        con.close();
    }
}