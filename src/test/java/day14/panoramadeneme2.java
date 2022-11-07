package day14;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

public class panoramadeneme2 {
    @Test
    public void panoramadenemeTest1() throws IOException {
        // System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("http://88.255.161.100");
        WebElement kullaniciadi = driver.findElement(By.name("edtUserName"));
        kullaniciadi.sendKeys("dileksugida3");
        WebElement kullanicisifre = driver.findElement(By.id("edtPass"));
        kullanicisifre.sendKeys("Ebn102030" + Keys.ENTER);
        driver.findElement(By.id("ctl09_lblCloseText")).click();
        //driver.findElement(By.className("col-xs-2 col-sm-2 col-lg-2 col-xl-2 tab-item active")).click();


        //driver.findElement(By.xpath("//*[text()='Tanımlamalar']")).click();
        //driver.findElement(By.xpath("//*[text()='Müşteri']")).click();


        //-Dosya yolunu bir String degiskene atayalim
        String dosyaYolu = "src/resources/kredilimitdeneme.xlsx";
        //-FileInputStream objesi olusturup,parametre olarak dosya yolunu girelim
        FileInputStream fis = new FileInputStream(dosyaYolu);
        Workbook workbook = WorkbookFactory.create(fis);
        int sonSatir = workbook.getSheet("Sayfa1").getLastRowNum();
        System.out.println("Satır sayısı = " + sonSatir);
        String carikodlar = "";
        for (int i = 0; i <= sonSatir; i++) {
            carikodlar = workbook.getSheet("Sayfa1").getRow(i).getCell(0).toString();
            Actions actions = new Actions(driver);
            WebElement müsteri = driver.findElement(By.id("txtSearch"));
            müsteri.sendKeys("Müşteri" + Keys.ENTER);
            actions.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
            //actions.moveToElement("");
            //driver.findElement(By.id("igtxtListGrid_edtTxt_TE")).click();
            //kod.sendKeys(carikodlar + Keys.ENTER);

        }

    }
}

