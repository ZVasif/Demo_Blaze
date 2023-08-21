package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.devtools.v101.runtime.Runtime;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;


public class BaseStaticDriver {
        public static WebDriver driver;
        public static WebDriverWait wait;

        static{
                KalanOncekileriKapat();
                Logger logger = Logger.getLogger("");
                logger.setLevel(Level.SEVERE);


                System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");
                System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
                driver=new ChromeDriver();
                driver.get("https://www.demoblaze.com/index.html");
                driver.manage().window().maximize();
                driver.manage().deleteAllCookies();
                wait=new WebDriverWait(driver,Duration.ofSeconds(30));


                driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        }

        public static void WaitClose(){
                try {
                        Thread.sleep(3000);
                } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                }
                driver.quit();
        }

        public static void Wait(int saniya){
                try {
                        Thread.sleep(saniya*1000);
                } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                }
        }

        public static void KalanOncekileriKapat() {

                try {
                        Runtime.disable().equals("taskkill /F /IM chromedriver.exe /T");
                } catch (Exception ignored) {

                }
        }
}
