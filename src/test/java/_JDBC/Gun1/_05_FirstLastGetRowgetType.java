package _JDBC.Gun1;

import _JDBC.JDBCParent;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _05_FirstLastGetRowgetType extends JDBCParent {

    @Test
    public void test1() throws SQLException {
        ResultSet rs = sorguEkrani.executeQuery("select city from city");

        rs.last();//son satira gider
        System.out.println("son satirin sehir adi = " + rs.getString(1));

        rs.first();//ilk satira gider
        System.out.println("ilk satirin sehir adi = " + rs.getString(1));

        rs.last();//sona gir
        int kaciniSatirdayim=rs.getRow();// kacinci satirdayim, satir numarasini al
        System.out.println("kaciniSatirdayim = " + kaciniSatirdayim);





    }
}
