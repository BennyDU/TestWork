import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.sql.Driver;
import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class TestWork {

        static WebDriver driver; // - Инициализация драйвера


        public static void main(String [] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Odmen\\IdeaProjects\\testwork\\Driver\\chromedriver.exe"); // Путь к драйверу
            driver = new ChromeDriver(); // Запуск браузера
            Actions action = new Actions(driver);
            driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);  // Задал неявное ожидание
            driver.manage().window().maximize();  // Открыл браузер в полноэкранном режиме
            driver.get("https://yandex.ru/");  // Открыл Яндекс
            WebElement market=driver.findElement(By.linkText("Маркет"));  //Инициализировал ссылку на маркет
            market.click();  //Инициализировал нажатие на ссылку
            System.out.println("Вы перешли на "+market.getText());  //Вывод информации в консоль
            driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
            for (String tab : driver.getWindowHandles()) {
                driver.switchTo().window(tab);  // Переключение вкладки
            }
            WebElement electro = driver.findElement(By.xpath("/html/body/div[3]/div[4]/noindex/div/div/div/div/div[1]/div[2]/div/a"));
            System.out.println("Вы перешли в "+ electro.getText());
            electro.click();
            Thread.sleep(5000);
            WebElement ss = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div/div/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div/div/div[1]/div[2]/ul/li[1]/div/a"));
            System.out.println("Вы перешли в "+ ss.getText());
            ss.click();
            WebElement price = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[3]/div[5]/aside/div[2]/div/div/div/div/div[2]/div[3]/div/div/fieldset/div/ul/li[2]/p/input"));
            price.sendKeys("20000");
            System.out.println("Выставлена цена до "+price.getAttribute("value")+" рублей ");
            WebElement diag = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[3]/div[5]/aside/div[2]/div/div/div/div/div[2]/div[11]/div/div/fieldset/div/ul/li[1]/p/input"));
            diag.sendKeys("3");
            System.out.println("Выставлена диагональ от "+diag.getAttribute("value")+" дюймов ");
            WebElement s1=driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[3]/div[5]/aside/div[2]/div/div/div/div/div[2]/div[4]/div/div/fieldset/ul/li[1]/div/a/label"));
            s1.click();
            Thread.sleep(4000);
            WebElement s2=driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[3]/div[5]/aside/div[2]/div/div/div/div/div[2]/div[4]/div/div/fieldset/ul/li[9]/div/a/label"));
            s2.click();
            Thread.sleep(4000);
            WebElement s3=driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[3]/div[5]/aside/div[2]/div/div/div/div/div[2]/div[4]/div/div/fieldset/ul/li[3]/div/a/label"));
            s3.click();
            Thread.sleep(4000);
            WebElement s4=driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[3]/div[5]/aside/div[2]/div/div/div/div/div[2]/div[4]/div/div/fieldset/ul/li[4]/div/a/label"));
            s4.click();
            Thread.sleep(4000);
            WebElement s5=driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[3]/div[5]/aside/div[2]/div/div/div/div/div[2]/div[4]/div/div/fieldset/ul/li[11]/div/a/label"));
            s5.click();
            System.out.println("Были выбраны производители: "+s1.getText()+", "+s2.getText()+", "+s3.getText()+", "+s4.getText()+", "+s5.getText()+". ");
            Thread.sleep(7000);
            JavascriptExecutor js;
            js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollTo(0,13806.400390625)");
            Thread.sleep(4000);
            driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[3]/div[5]/div/div[3]/div/div[2]/button")).click();
            WebElement s6=driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[3]/div[5]/div/div[3]/div/div[2]/div/div/button[1]"));
            System.out.println("Выбрано по 12: "+s6.getText());
            s6.click();
            WebElement s7=driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[3]/div[5]/div/div[1]/div/div[1]/button[3]"));
            System.out.println("Фильтрация : "+s7.getText());
            s7.click();
            Thread.sleep(4000);
            WebElement s8=driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[3]/div[5]/div/div[2]/div/div[1]/div/div/div/div/article[1]/div[4]/div[1]/h3/a"));
            System.out.println("Выбран телефон : "+s8.getText());
            s8.click();
            for (String tab : driver.getWindowHandles()) {
                driver.switchTo().window(tab);  // Переключение вкладки
            }
            Thread.sleep(4000);
            WebElement s9=driver.findElement(By.xpath("/html/body/div[1]/div[5]/div/div[4]/div/div[1]/div/div/div[3]/div[1]/div[1]/span"));
            action.moveToElement(s9).build().perform();
            System.out.println("Оценка : "+s9.getText());
            Thread.sleep(10000);
            driver.quit();
        }
}

