import io.qameta.allure.Attachment;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

public class MtsByTest {
    private WebDriver driver;
    private WebDriverWait wait;
    private JavascriptExecutor js;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        js = (JavascriptExecutor) driver;
        driver.manage().window().maximize();
        driver.get("https://www.mts.by/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        acceptCookies();
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Step("Accept cookies")
    @Attachment
    private void acceptCookies() {
        WebElement cookieButton = driver.findElement(By.id("cookie-agree"));
        wait.until(ExpectedConditions.elementToBeClickable(cookieButton));
        cookieButton.click();
    }

    @Test
    @Attachment
    @DisplayName("Test Connection Phone Visibility")
    @Description("Test to verify the visibility of the connection phone element")
    public void testConnectionPhoneVisibility() {
        WebElement payWrapper = driver.findElement(By.xpath("//section[@class ='pay']/descendant::div[@class = 'pay__wrapper']"));
        js.executeScript("arguments[0].scrollIntoView();", payWrapper);

        WebElement connectionPhone = driver.findElement(By.xpath("//*[@id=\"connection-phone\"]"));
        wait.until(ExpectedConditions.visibilityOf(connectionPhone));
        assertTrue(connectionPhone.isDisplayed());
    }

    @Test
    @Attachment
    @DisplayName("Test Connection Sum Visibility")
    @Description("Test to verify the visibility of the connection sum element")
    public void testConnectionSumVisibility() {
        WebElement connectionSum = driver.findElement(By.xpath("//*[@id=\"connection-sum\"]"));
        assertTrue(connectionSum.isDisplayed());
    }

    @Test
    @Attachment
    @DisplayName("Test Connection Email Visibility")
    @Description("Test to verify the visibility of the connection email element")
    public void testConnectionEmailVisibility() {
        WebElement connectionEmail = driver.findElement(By.xpath("//*[@id=\"connection-email\"]"));
        assertTrue(connectionEmail.isDisplayed());
    }

    @Test
    @Attachment
    @DisplayName("Test Home Internet Visibility")
    @Description("Test to verify the visibility of the home internet elements")
    public void testHomeInternetVisibility() {
        selectServiceOption(2);

        WebElement internetPhone = driver.findElement(By.xpath("//*[@id=\"internet-phone\"]"));
        wait.until(ExpectedConditions.visibilityOf(internetPhone));
        assertTrue(internetPhone.isDisplayed());

        WebElement internetSum = driver.findElement(By.xpath("//*[@id=\"internet-sum\"]"));
        assertTrue(internetSum.isDisplayed());

        WebElement internetEmail = driver.findElement(By.xpath("//*[@id=\"internet-email\"]"));
        assertTrue(internetEmail.isDisplayed());
    }

    @Test
    @Attachment
    @DisplayName("Test Instalment Plan Visibility")
    @Description("Test to verify the visibility of the instalment plan elements")
    public void testInstalmentPlanVisibility() {
        selectServiceOption(3);

        WebElement scoreInstalment = driver.findElement(By.xpath("//*[@id=\"score-instalment\"]"));
        wait.until(ExpectedConditions.visibilityOf(scoreInstalment));
        assertTrue(scoreInstalment.isDisplayed());

        WebElement instalmentSum = driver.findElement(By.xpath("//*[@id=\"instalment-sum\"]"));
        assertTrue(instalmentSum.isDisplayed());

        WebElement instalmentEmail = driver.findElement(By.xpath("//*[@id=\"instalment-email\"]"));
        assertTrue(instalmentEmail.isDisplayed());
    }

    @Test
    @Attachment
    @DisplayName("Test Arrears Visibility")
    @Description("Test to verify the visibility of the arrears elements")
    public void testArrearsVisibility() {
        selectServiceOption(4);

        WebElement scoreArrears = driver.findElement(By.xpath("//*[@id=\"pay-arrears\"]/div[1]"));
        wait.until(ExpectedConditions.visibilityOf(scoreArrears));
        assertTrue(scoreArrears.isDisplayed());

        WebElement arrearsSum = driver.findElement(By.xpath("//*[@id=\"pay-arrears\"]/div[2]"));
        assertTrue(arrearsSum.isDisplayed());

        WebElement arrearsEmail = driver.findElement(By.xpath("//*[@id=\"pay-arrears\"]/div[3]"));
        assertTrue(arrearsEmail.isDisplayed());
    }

    @Test
    @Attachment
    @DisplayName("Test Payment Process")
    @Description("Test to verify the payment process functionality")
    public void testPaymentProcess() {
        selectServiceOption(1);

        WebElement number = driver.findElement(By.xpath("//*[@id='connection-phone']"));
        wait.until(ExpectedConditions.elementToBeClickable(number));
        number.click();
        number.sendKeys("297777777");

        WebElement sum = driver.findElement(By.id("connection-sum"));
        sum.sendKeys("250");

        WebElement buttonContinue = driver.findElement(By.xpath("//*[@id='pay-connection']/button"));
        buttonContinue.click();

        WebElement ngContent = driver.findElement(By.xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/div/div/span[1]"));
        wait.until(ExpectedConditions.visibilityOf(ngContent));
        assertTrue(ngContent.isDisplayed());

        WebElement buttonContent = driver.findElement(By.xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/app-card-page/div/div[1]/button/text()"));
        assertTrue(buttonContent.isDisplayed());

        WebElement numberContent = driver.findElement(By.xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/div/span"));
        assertTrue(numberContent.isDisplayed());

        WebElement starInserted = driver.findElement(By.xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/app-card-page/div/div[1]/app-card-input/form/div[1]/div[1]/app-input/div/div/div[1]/label"));
        assertTrue(starInserted.isDisplayed());

        WebElement dateInput = driver.findElement(By.xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/app-card-page/div/div[1]/app-card-input/form/div[1]/div[2]/div[1]/app-input/div/div/div[1]/label"));
        assertTrue(dateInput.isDisplayed());

        WebElement cvcInput = driver.findElement(By.xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/app-card-page/div/div[1]/app-card-input/form/div[1]/div[2]/div[3]/app-input/div/div/div[1]/input"));
        assertTrue(cvcInput.isDisplayed());

        WebElement formControlName = driver.findElement(By.xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/app-card-page/div/div[1]/app-card-input/form/div[1]/div[3]/app-input/div/div/div[1]/input"));
        assertTrue(formControlName.isDisplayed());

        WebElement gPay = driver.findElement(By.xpath("//*[@id=\"google-pay-button\"]/div"));
        assertTrue(gPay.isDisplayed());

        WebElement yPay = driver.findElement(By.xpath("//*[@id=\"yandex-button\"]"));
        assertTrue(yPay.isDisplayed());

        WebElement paymentIcons = driver.findElement(By.xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/app-card-page/div/div[1]/app-card-input/form/div[1]/div[1]/app-input/div/div/div[2]/div/div"));
        assertTrue(paymentIcons.isDisplayed());
    }
    @Step("Scroll to element")
    @Attachment
    private void scrollToElement(By by) {
        WebElement element = driver.findElement(by);
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    @Step("Select service option {optionIndex}")
    @Attachment
    private void selectServiceOption(int optionIndex) {
        WebElement selectButton = driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[1]/div[1]/div[2]/button/span[2]"));
        wait.until(ExpectedConditions.elementToBeClickable(selectButton));
        selectButton.click();

        WebElement option = driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[1]/div[1]/div[2]/ul/li[" + optionIndex + "]/p"));
        wait.until(ExpectedConditions.elementToBeClickable(option));
        option.click();
    }
}

