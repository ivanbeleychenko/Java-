import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import static org.openqa.selenium.By.xpath;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.manage().window().maximize();
        driver.get("https://www.mts.by/");
        WebElement cookieButton = driver.findElement(By.id("cookie-agree"));
        cookieButton.click();

        // Проверка названия блока "Онлайн пополнение без комиссии"
        WebElement wrapper = driver.findElement(xpath("//*[@id='pay-section']/div/div/div[2]/section/div/h2"));
        js.executeScript("arguments[0].scrollIntoView();", wrapper);
        if(wrapper.isDisplayed()) {
            System.out.println("Название блока 'Онлайн пополнение без комиссии' соответствует макету");
        } else {
            System.out.println("Название блока 'Онлайн пополнение без комиссии' не соответствует макету");
        }

        // Проверка наличия логотипов платежных систем
        WebElement partners = driver.findElement(xpath("//*[@id='pay-section']/div/div/div[2]/section/div/div[2]/ul"));
        if(partners.isDisplayed()) {
            System.out.println("Логотипы платежных систем присутствуют согласно макету");
        } else {
            System.out.println("Логотипы платежных систем не найдены");
        }

        // Проверка работы ссылки «Подробнее о сервисе»
        WebElement link = driver.findElement(By.linkText("Подробнее о сервисе"));
        link.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(xpath("//*[@id='breadcrumbs']/div/div/div/div/ul/li[1]/a/span")));
        if(driver.getCurrentUrl().contains("https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/")) {
            System.out.println("Ссылка 'Подробнее о сервисе' работает корректно.");
        } else {
            System.out.println("Ссылка 'Подробнее о сервисе' не работает.");
        }
        WebElement imgMts = driver.findElement(xpath("//*[@id=\"breadcrumbs\"]/div/div/div/div/ul/li[1]/a/span"));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        imgMts.click();

        // Проверка работы кнопки "Продолжить"
        WebElement number = driver.findElement(xpath("//*[@id='connection-phone']"));
        js.executeScript("arguments[0].scrollIntoView();", number);
        number.click();
        number.sendKeys("297777777");
        WebElement sum = driver.findElement(By.id("connection-sum"));
        sum.sendKeys("250");
        WebElement buttonContinue = driver.findElement(xpath("//*[@id='pay-connection']/button"));
        buttonContinue.click();
        wait.until(ExpectedConditions.visibilityOf(buttonContinue));
        if(buttonContinue.isDisplayed()) {
            System.out.println("Кнопка 'Продолжить' работает согласно макету");
        } else {
            System.out.println("Кнопка 'Продолжить' не работает согласно макету");
        }

        driver.quit();
    }
}
