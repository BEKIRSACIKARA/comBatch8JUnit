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
    public void panoramadenemeTest1() throws IOException, InterruptedException {
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
        Thread.sleep(1000);
        driver.findElement(By.id("ctl09_lblCloseText")).click();
        Thread.sleep(1000);
        Actions actions = new Actions(driver);
        WebElement müsteri = driver.findElement(By.id("txtSearch"));
        müsteri.sendKeys("Müşteri");
        Thread.sleep(2000);
        actions.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
        Thread.sleep(1000);
        //driver.findElement(By.className("col-xs-2 col-sm-2 col-lg-2 col-xl-2 tab-item active")).click();



        //driver.findElement(By.xpath("//*[text()='Müşteri']")).click();


        //-Dosya yolunu bir String degiskene atayalim
        String dosyaYolu = "src/resources/kredilimitdeneme.xlsx";
        //-FileInputStream objesi olusturup,parametre olarak dosya yolunu girelim
        FileInputStream fis = new FileInputStream(dosyaYolu);
        Workbook workbook = WorkbookFactory.create(fis);
        int sonSatir = workbook.getSheet("Sayfa1").getLastRowNum();
        System.out.println("Satır sayısı = " + sonSatir);
        String carikodlar = "";
        Actions actions1 = new Actions(driver);
        //Thread.sleep(5000);
        actions1.sendKeys(Keys.ARROW_UP);
      Thread.sleep(3000);
       actions1.sendKeys(Keys.TAB);
       Thread.sleep(3000);
       actions1.sendKeys(Keys.TAB);
        Thread.sleep(3000);
        actions1.sendKeys(Keys.TAB)
        .perform();

       Thread.sleep(3000);
        for (int i = 0; i <= 0; i++) {//sonSatir
            carikodlar = workbook.getSheet("Sayfa1").getRow(i).getCell(0).toString();
            Actions actions2 = new Actions(driver);
            actions2.sendKeys(carikodlar+Keys.ENTER).perform();
           driver.findElement(By.xpath("//*[text()='Düzenle']")).click();
          //  Actions actions3 = new Actions(driver);
           // actions3.sendKeys(Keys.F2).perform();
         //   WebElement duzenle=driver.findElement(By.xpath("//*[@id='igtxtListGrid_edtTxt_TE']"));
        //    duzenle.click();
            Thread.sleep(1000);

            // actions.moveToElement();

            // driver.findElement(By.xpath("//*[@id='ListGrid_R1C3FltBtn']")).click();
            //kod.sendKeys(carikodlar + Keys.ENTER);

        }


    }
}

