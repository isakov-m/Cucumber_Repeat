package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Locale;

public class GWD {
    private static WebDriver driver;


    // extend report türkçe bilg çalışmaması sebebiyle eklendi
//        Locale.setDefault(new Locale("EN"));
//        System.setProperty("user.language", "EN");


    public static WebDriver getDriver() {
        if (driver == null) { // ilk kez 1 defa calissin
            driver = new ChromeDriver(); // jenkins deyken : sen head olmadan yani hafızada çalış
            driver.manage().window().maximize(); // Ekranı max yapıyor.
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20)); // 20 sn mühlet: sayfayı yükleme mühlet

        }
        return driver;
    }

    public static void quitDriver() {
        // test sonucu ekranda bir miktar beklesin diye
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // driver kapat
        if (driver != null) { // driver var ise
            driver.quit();
            driver = null;
        }

    }

}
