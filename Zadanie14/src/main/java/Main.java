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
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.manage().window().maximize();
        driver.get("https://www.mts.by/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement cookieButton = driver.findElement(By.id("cookie-agree"));
        wait.until(ExpectedConditions.elementToBeClickable(cookieButton));
        cookieButton.click();

        WebElement payWrapper = driver.findElement(xpath("//section[@class ='pay']/descendant::div[@class = 'pay__wrapper']"));
        js.executeScript("arguments[0].scrollIntoView();", payWrapper);

        WebElement connectionPhone = driver.findElement(xpath("//*[@id=\"connection-phone\"]"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(xpath("//*[@id=\"connection-phone\"]")));
        if(connectionPhone.isDisplayed()){
            System.out.println("Услуги связи. Надпись в поле 'Номер телефона' соответствует макету");
        } else {
            System.out.println("Услуги связи. Надпись в поле 'Номер телефона' не соответствует макету");
        }
        WebElement connectionSum= driver.findElement(xpath("//*[@id=\"connection-sum\"]"));
        if (connectionSum.isDisplayed()){
            System.out.println("Услуги связи. Надпись в поле 'Сумма' соответствует макету");
        } else {
            System.out.println("Услуги связи. Надпись в поле 'Сумма' не соответствует макету");
        }
        WebElement connectionEmail= driver.findElement(xpath("//*[@id=\"connection-email\"]"));
        if (connectionEmail.isDisplayed()){
            System.out.println("Услуги связи. Надпись в поле 'Email' соответствует макету");
        } else {
            System.out.println("Услуги связи. Надпись в поле 'Email' не соответствует макету");
        }
        WebElement selectW = driver.findElement(xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[1]/div[1]/div[2]/button/span[2]"));
        wait.until(ExpectedConditions.elementToBeClickable(selectW));
        selectW.click();

        WebElement homeInternet = driver.findElement(xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[1]/div[1]/div[2]/ul/li[2]"));
        wait.until(ExpectedConditions.elementToBeClickable(homeInternet));
        homeInternet.click();

        WebElement internetPhone= driver.findElement(xpath("//*[@id=\"internet-phone\"]"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(xpath("//*[@id=\"internet-phone\"]")));
        if (internetPhone.isDisplayed()){
            System.out.println("Домашний интернет. Надпись в поле 'Номер абонента' соответствует макету");
        } else {
            System.out.println("Домашний интернет. Надпись в поле 'Номер абонента' не соответствует макету");
        }
        WebElement internetSum = driver.findElement(xpath("//*[@id=\"internet-sum\"]"));
        if (internetSum.isDisplayed()){
            System.out.println("Домашний интернет. Надпись в поле 'Сумма' соответствует макету");
        } else {
            System.out.println("Домашний интернет. Надпись в поле 'Сумма' не соответствует макету");
        }
        WebElement internetEmail= driver.findElement(xpath("//*[@id=\"internet-email\"]"));
        if (internetEmail.isDisplayed()){
            System.out.println("Домашний интернет. Надпись в поле 'Email' соответствует макету");
        } else {
            System.out.println("Домашний интернет. Надпись в поле 'Email' не соответствует макету");
        }

        WebElement selectW1 = driver.findElement(xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[1]/div[1]/div[2]/button/span[2]"));
        wait.until(ExpectedConditions.elementToBeClickable(selectW1));
        selectW1.click();

        WebElement installmentPlan = driver.findElement(xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[1]/div[1]/div[2]/ul/li[3]/p"));
        wait.until(ExpectedConditions.elementToBeClickable(installmentPlan));
        installmentPlan.click();

        WebElement scoreInstalment = driver.findElement(xpath("//*[@id=\"score-instalment\"]"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(xpath("//*[@id=\"score-instalment\"]")));
        if (scoreInstalment.isDisplayed()){
            System.out.println("Рассрочка. Надпись в поле 'Номер счета на 44' соответствует макету");
        } else {
            System.out.println("Рассрочка. Надпись в поле 'Номер счета на 44' не соответствует макету");
        }
        WebElement instalmentSum = driver.findElement(xpath("//*[@id=\"instalment-sum\"]"));
        if (instalmentSum.isDisplayed()){
            System.out.println("Рассрочка. Надпись в поле 'Сумма' соответствует макету");
        } else {
            System.out.println("Рассрочка. Надпись в поле 'Сумма' не соответствует макету");
        }
        WebElement instalmentEmail= driver.findElement(xpath("//*[@id=\"instalment-email\"]"));
        if (instalmentEmail.isDisplayed()){
            System.out.println("Рассрочка. Надпись в поле 'Email' соответствует макету");
        } else {
            System.out.println("Рассрочка. Надпись в поле 'Email' не соответствует макету");
        }

        WebElement selectW2 = driver.findElement(xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[1]/div[1]/div[2]/button/span[2]"));
        selectW2.click();

        WebElement arrears = driver.findElement(xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[1]/div[1]/div[2]/ul/li[4]/p"));
        wait.until(ExpectedConditions.elementToBeClickable(arrears));
        arrears.click();

        WebElement scoreArrears = driver.findElement(xpath("//*[@id=\"pay-arrears\"]/div[1]"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(xpath("//*[@id=\"pay-arrears\"]/div[1]")));
        if (scoreArrears.isDisplayed()){
            System.out.println("Задолженность. Надпись в поле 'Номер счета на 2073' соответствует макету");
        } else {
            System.out.println("Задолженность. Надпись в поле 'Номер счета на 2073' не соответствует макету");
        }
        WebElement arrearsSum = driver.findElement(xpath("//*[@id=\"pay-arrears\"]/div[2]"));
        if (arrearsSum.isDisplayed()){
            System.out.println("Задолженность. Надпись в поле 'Сумма' соответствует макету");
        } else {
            System.out.println("Задолженность. Надпись в поле 'Сумма' не соответствует макету");
        }
        WebElement arrearsEmail= driver.findElement(xpath("//*[@id=\"pay-arrears\"]/div[3]"));
        if (arrearsEmail.isDisplayed()){
            System.out.println("Задолженность. Надпись в поле 'Email' соответствует макету");
        } else {
            System.out.println("Задолженность. Надпись в поле 'Email' не соответствует макету");
        }

        WebElement selectW3 = driver.findElement(xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[1]/div[1]/div[2]/button/span[2]"));
        selectW3.click();

        WebElement payWrapper1 = driver.findElement(xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[1]/div[1]/div[2]/ul/li[1]/p"));
        wait.until(ExpectedConditions.elementToBeClickable(payWrapper1));
        payWrapper1.click();



        WebElement number = driver.findElement(xpath("//*[@id='connection-phone']"));
        wait.until(ExpectedConditions.elementToBeClickable(number));
        number.click();
        number.sendKeys("297777777");
        WebElement sum = driver.findElement(By.id("connection-sum"));
        sum.sendKeys("250");
        WebElement buttonContinue = driver.findElement(xpath("//*[@id='pay-connection']/button"));
        buttonContinue.click();
        

        WebElement ngContent = driver.findElement(xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/div"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/div")));
        if (ngContent.isDisplayed()){
            System.out.println("В появившемся окне 'Сумма' отображается корректно");
        } else {
            System.out.println("В появившемся окне 'Сумма' отображается некорректно");
        }
        WebElement buttonContent = driver.findElement(xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/app-card-page/div/div[1]/button/text()"));
        if (buttonContent.isDisplayed()){
            System.out.println("В появившемся окне, на кнопке оплатить 'Сумма' отображается корректно");
        } else {
            System.out.println("В появившемся окне, на кнопке оплатить 'Сумма' отображается  некорректно");
        }

        WebElement numberContent = driver.findElement(xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/div/span"));
        if (numberContent.isDisplayed()){
            System.out.println("В появившемся окне 'Номер телефона' отображается корректно");
        }else {
            System.out.println("В появившемся окне 'Номер телефона' отображается некорректно");
        }

        WebElement starInserted = driver.findElement(xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/app-card-page/div/div[1]/app-card-input/form/div[1]/div[1]/app-input/div/div/div[1]/label"));
        if (starInserted.isDisplayed()){
            System.out.println("В появившемся окне. Надпись а поле'Номер карты' отображается корректно");
        }else {
            System.out.println("В появившемся окне. Надпись а поле'Номер карты' отображается некорректно");
        }
        WebElement dateImput = driver.findElement(xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/app-card-page/div/div[1]/app-card-input/form/div[1]/div[2]/div[1]/app-input/div/div/div[1]/label"));
        if (dateImput.isDisplayed()){
            System.out.println("В появившемся окне. Надпись а поле'Срок действия' отображается корректно");
        }else {
            System.out.println("В появившемся окне. Надпись а поле'Срок действия' отображается  некорректно ");
        }
        WebElement cvcInput = driver.findElement(xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/app-card-page/div/div[1]/app-card-input/form/div[1]/div[2]/div[3]/app-input/div/div/div[1]/input"));
        if (cvcInput.isDisplayed()){
            System.out.println("В появившемся окне. Надпись в поле 'CVC' отображается корректно");
        }else {
            System.out.println("В появившемся окне. Надпись в поле 'CVC' отображается некорректно ");
        }
        WebElement formControlName = driver.findElement(xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/app-card-page/div/div[1]/app-card-input/form/div[1]/div[3]/app-input/div/div/div[1]/input"));
        if (formControlName.isDisplayed()){
            System.out.println("В появившемся окне. Надпись в поле 'Имя держателя(как на карте)' отображается корректно ");
        }else {
            System.out.println("В появившемся окне. Надпись в поле 'Имя держателя(как на карте)' отображается некорректно ");
        }

        WebElement gPay = driver.findElement(xpath("//*[@id=\"google-pay-button\"]/div"));
        if (gPay.isDisplayed()){
            System.out.println("В появившемся окне. Кнопка системы платежей 'G Pay' отображается корректно ");
        }else {
            System.out.println("В появившемся окне. Кнопка системы платежей 'G Pay' отображается некорректно ");
        }
        WebElement yPay = driver.findElement(xpath("//*[@id=\"yandex-button\"]"));
        if (yPay.isDisplayed()){
            System.out.println("В появившемся окне. Кнопка системы платежей 'Y Pay' отображается корректно ");
        }else {
            System.out.println("В появившемся окне. Кнопка системы платежей 'Y Pay' отображается некорректно ");
        }
        WebElement paymentIcons= driver.findElement(xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/app-card-page/div/div[1]/app-card-input/form/div[1]/div[1]/app-input/div/div/div[2]/div/div"));
        if (paymentIcons.isDisplayed()){
            System.out.println("В появившемся окне. Иконки системы платежей отображается корректно ");
        }else {
            System.out.println("В появившемся окне. Иконки системы платежей отображается некорректно ");
        }
        driver.quit();
    }
}
