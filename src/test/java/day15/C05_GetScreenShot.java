package day15;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.TestBaseBeforeAfter;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C05_GetScreenShot extends TestBaseBeforeAfter {
    @Test
    public void test1() throws IOException {
        driver.get("https://hepsiburada.com");
        TakesScreenshot ts = (TakesScreenshot) driver;
        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("YYMMddHHmmss");
        File tumsayfaresmi = ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(tumsayfaresmi, new File("target/ekranGoruntusu//allpage" + tarih + ".jpg"));
    }
}
