package _JDBC.Gun1;

import _JDBC.JDBCParent;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

import static _JDBC.JDBCParent.sorguEkrani;

public class _04_Soru extends JDBCParent {
    //city tablosundaki tum satirlardaki sehir isimlerini next ile yazdiriniz

    @Test
    public void test1() throws SQLException {
        ResultSet rs = sorguEkrani.executeQuery("select * from city");

        while (rs.next())
            System.out.println(rs.getString("city"));
    }
}
