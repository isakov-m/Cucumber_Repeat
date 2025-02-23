package StepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

import java.util.List;

public class _08_DataTableOrnek {
    @When("Write username {string}")
    public void writeUsername(String username) {
        System.out.println("username = " + username);
    }

    @And("Write username and Password {string} and {string}")
    public void writeUsernameAndPasswordAnd(String username, String password) {
        System.out.println("username = " + username);
        System.out.println("password = " + password);
    }

    @And("Write username as DataTable")
    public void writeUsernameAsDataTable(DataTable userlar) {
        List<String> listUserlar = userlar.asList(String.class);    // Liste

        for (String user : listUserlar)
            System.out.println("user = " + user);

    }

    @And("Write username and Password as DataTable")
    public void writeUsernameAndPasswordAsDataTable(DataTable kullaniciVeSifreler) {
        List<List<String>> listKullaniciVeSifreler = kullaniciVeSifreler.asLists(String.class); // listelerin listi
        for (int i = 0; i < listKullaniciVeSifreler.size(); i++) {
            System.out.println("ListItemleri = " + listKullaniciVeSifreler.get(i).get(0) + " " +    // username
                                                   listKullaniciVeSifreler.get(i).get(1));          // password
        }
    }
}
