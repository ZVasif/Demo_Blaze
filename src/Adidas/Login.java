package Adidas;

import Utils.BaseStaticDriver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

public class Login extends BaseStaticDriver {

    @BeforeClass
    public void login(){

        WebElement logIn=driver.findElement(By.id("login2"));
        logIn.click();
        WebElement userName=driver.findElement(By.id("loginusername"));
        userName.sendKeys("con");
        WebElement password=driver.findElement(By.id("loginpassword"));
        password.sendKeys("4758");
        WebElement save=driver.findElement(By.xpath("(//div[@class='modal-footer']/button)[6]"));
        save.click();

        Wait(3);

        Alert alert=driver.switchTo().alert();
        alert.accept();

        WaitClose();
    }
}
