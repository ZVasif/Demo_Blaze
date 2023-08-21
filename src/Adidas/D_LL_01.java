package Adidas;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class D_LL_01 extends BaseStaticDriver {
    public static void main(String[] args) {

        WebElement laptop=driver.findElement(By.linkText("Laptops"));
        laptop.click();

        WebElement dell=driver.findElement(By.linkText("Dell i7 8gb"));
        dell.click();
    }
}
