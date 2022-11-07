package day12;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.TestBaseBeforeAfter;

import java.time.Duration;

public class C03_WaitTest extends TestBaseBeforeAfter {
   @Test
    public void imlibicitytest1(){
    // 1. Bir class olusturun : WaitTest
// 2. Iki tane metod olusturun : implicitWait() , explicitWait()
//    Iki metod icin de asagidaki adimlari test edin.
// 3. https://the-internet.herokuapp.com/dynamic_controls adresine gidin.
       driver.get("https://the-internet.herokuapp.com/dynamic_controls");
// 4. Remove butonuna basin.
       driver.findElement(By.xpath("//*[text()='Remove']")).click();
// 5. "It's gone!" mesajinin goruntulendigini dogrulayin.
       Assert.assertTrue(driver.findElement(By.xpath("//*[text()=\"It's gone!\"]")).isDisplayed());
// 6. Add buttonuna basin
       driver.findElement(By.xpath("//*[text()='Add']")).click();
// 7. It's back mesajinin gorundugunu test edin
       Assert.assertTrue(driver.findElement(By.xpath("//*[text()=\"It's back!\"]")).isDisplayed());


   }
   @Test
   public void imlibicitytest2(){

// 3. https://the-internet.herokuapp.com/dynamic_controls adresine gidin.
      driver.get("https://the-internet.herokuapp.com/dynamic_controls");
// 4. Remove butonuna basin.
      driver.findElement(By.xpath("//*[text()='Remove']")).click();
// 5. "It's gone!" mesajinin goruntulendigini dogrulayin.
      WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20));
      WebElement istgone=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()=\"It's gone!\"]")));
// 6. Add buttonuna basin
      driver.findElement(By.xpath("//*[text()='Add']")).click();
// 7. It's back mesajinin gorundugunu test edin
      Assert.assertTrue(driver.findElement(By.xpath("//*[text()=\"It's back!\"]")).isDisplayed());


   }

}
