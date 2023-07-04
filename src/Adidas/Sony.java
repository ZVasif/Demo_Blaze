package Adidas;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Sony extends BaseStaticDriver {

        @Test(groups = "Login",priority = 1)
        public void login(){
            driver.get("https://www.demoblaze.com/index.html");

        WebElement logIn=driver.findElement(By.id("login2"));
        logIn.click();
        WebElement userName=driver.findElement(By.id("loginusername"));
        userName.sendKeys("con");
        WebElement password=driver.findElement(By.id("loginpassword"));
        password.sendKeys("4758");
        WebElement save=driver.findElement(By.xpath("(//div[@class='modal-footer']/button)[6]"));
        save.click();

        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();

    }


        @Test(groups = "Sony",priority = 2)
        public void sony(){
            driver.get("https://www.demoblaze.com/index.html");
        WebElement laptop=driver.findElement(By.linkText("Laptops"));
        laptop.click();
        WebElement sony=driver.findElement(By.xpath("//*[contains(text(),'vaio i5')]"));
        sony.click();
        WebElement add=driver.findElement(By.xpath("//*[@onclick=\"addToCart(8)\"]"));
        add.click();

        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();

        WaitClose();

    }

    @Test(groups = "Dell",priority = 3)
    public void dell(){
        driver.get("https://www.demoblaze.com/index.html");

        WebElement laptop=driver.findElement(By.linkText("Laptops"));
        laptop.click();
        WebElement dell=driver.findElement(By.linkText("Dell i7 8gb"));
        dell.click();
        WebElement add=driver.findElement(By.xpath("//*[@onclick=\"addToCart(12)\"]"));
        add.click();

        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();


        WebElement cart=driver.findElement(By.id("cartur"));
        cart.click();
        WebElement delete=driver.findElement(By.linkText("Delete"));
        delete.click();

        wait.until(ExpectedConditions.textToBe(By.id("totalp"),""));

        WebElement place=driver.findElement(By.xpath("//*[contains(text(),'Place Order')]"));
        place.click();
        WebElement name=driver.findElement(By.xpath("//input[@id='name']"));
        name.sendKeys("con");
        WebElement country=driver.findElement(By.id("country"));
        country.sendKeys("Azerbaijan");
        WebElement city=driver.findElement(By.cssSelector("div[class='form-group']>[id='city']"));
        city.sendKeys("Baku");
        WebElement creditCard=driver.findElement(By.cssSelector("label[for='card']~[id]"));
        creditCard.sendKeys("41256523");
        WebElement month=driver.findElement(By.id("month"));
        month.sendKeys("Aprel");
        WebElement year=driver.findElement(By.cssSelector("div[class='form-group'] [id='year']"));
        year.sendKeys("2026");
        WebElement purchase=driver.findElement(By.xpath("//*[@onclick=\"purchaseOrder()\"]"));
        purchase.click();

        WebElement thankBoard=driver.findElement(By.xpath("//*[contains(@class,'lead')]"));
        System.out.println(thankBoard.getText());

        Assert.assertTrue(thankBoard.getText().contains("0 USD"));




//        WebElement idText=driver.findElement(By.xpath("//*[contains(@class,'lead')]/text()[1]"));
//        System.out.println("Id result="+idText.getText());
        //WebElement amountText=driver.findElement(By.xpath("/html/body/div[10]/p/text()[2]"));
        //System.out.println("Amount result="+amountText.getText());
//        Wait(5);
//        WebElement amount=driver.findElement(By.xpath("(//*[contains(@class,'lead')]//text())[2]"));
//        //System.out.println(amount.getText());



//        List<WebElement> all=driver.findElements(By.xpath("//p[starts-with(@class,'lead')]/text()"));
//        for (WebElement e:all)
//            System.out.println("e = " + e.getText().contains("0 USD"));
////            if (e.getText().contains("Id"))
////                System.out.println("id="+e.getText());



        WaitClose();
    }
}
