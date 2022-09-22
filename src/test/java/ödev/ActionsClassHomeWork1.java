package ödev;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBaseBeforeAfter;
//Ödev 1
//Yeni Class olusturun ActionsClassHomeWork
public class ActionsClassHomeWork1 extends TestBaseBeforeAfter {


    @Test
    public void test1() {
        //1- "http://webdriveruniversity.com/Actions" sayfasina gidin
        driver.get("http://webdriveruniversity.com/Actions");
        // 2- Hover over Me First" kutusunun ustune gelin
        WebElement OVERFIRST = driver.findElement(By.xpath("//*[text()='Hover Over Me First!']"));
        //Link 1" e tiklayin
        Actions actions = new Actions(driver);
        actions.moveToElement(OVERFIRST).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();




//Popup mesajini yazdirin
//Popup'i tamam diyerek kapatin
//"Click and hold" kutusuna basili tutun
//7-"Click and hold" kutusunda cikan yaziyi yazdirin
//8- "Double click me" butonunu cift tiklayin



    }
}
