package Tests;

        import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.chrome.ChromeDriver;
        import org.testng.annotations.Test;

public class ShareLaneTests {
    //1. Open browser, URL - https://www.sharelane.com/cgi-bin/register.py
    //2. Enter value in ZIP code field
    //3. Click Continue button
    //4. Enter value in Sing In code fields
    //5. Click Register button
    //6. Enter value in Search code fields by author
    //7. Click Search button
    //8. Enter value in Search code fields by name book
    @Test
    public void fillInZipCodeFieldTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("555555");
        driver.findElement(By.xpath("//*[@value='Continue']")).click();
    }
    @Test
    public void notFillInFieldSignUpTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("555555");
        driver.findElement(By.xpath("//*[@value='Continue']")).click();
        driver.findElement(By.xpath("//*[@value='Register']")).click();
    }
    @Test
    public void fillInSingUpCodeFieldsAll() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("555555");
        driver.findElement(By.xpath("//*[@value='Continue']")).click();
        driver.findElement(By.name("first_name")).sendKeys("Oleadam");
        driver.findElement(By.name("last_name")).sendKeys("Oliver");
        driver.findElement(By.name("email")).sendKeys("jennifer_gupta@766.94.sharelane.com");
        driver.findElement(By.name("password1")).sendKeys("1111");
        driver.findElement(By.name("password2")).sendKeys("1111");
        driver.findElement(By.xpath("//*[@value='Register']")).click();
    }
    @Test
    public void fillInSingUpCodeFieldsMarkedAsterisk() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("555555");
        driver.findElement(By.xpath("//*[@value='Continue']")).click();
        driver.findElement(By.name("first_name")).sendKeys("Adam");
        driver.findElement(By.name("email")).sendKeys("jennifer_gupta@766.94.sharelane.com");
        driver.findElement(By.name("password1")).sendKeys("1111");
        driver.findElement(By.name("password2")).sendKeys("1111");
        driver.findElement(By.xpath("//*[@value='Register']")).click();
    }
    @Test
    public void fillInSingUpCodeFieldFirstName() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("555555");
        driver.findElement(By.xpath("//*[@value='Continue']")).click();
        driver.findElement(By.name("first_name")).sendKeys("Adam");
        driver.findElement(By.xpath("//*[@value='Register']")).click();
    }
    @Test
    public void fillInSingUpCodeFieldEmail() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("555555");
        driver.findElement(By.xpath("//*[@value='Continue']")).click();
        driver.findElement(By.name("email")).sendKeys("jennifer_gupta@766.94.sharelane.com");
        driver.findElement(By.xpath("//*[@value='Register']")).click();
    }
    @Test
    public void fillInSingUpCodeFieldsEmailPasswordConfirmPassword() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("555555");
        driver.findElement(By.xpath("//*[@value='Continue']")).click();
        driver.findElement(By.name("email")).sendKeys("jennifer_gupta@766.94.sharelane.com");
        driver.findElement(By.name("password1")).sendKeys("1111");
        driver.findElement(By.name("password2")).sendKeys("1111");
        driver.findElement(By.xpath("//*[@value='Register']")).click();
    }
    @Test
    public void fillInSingUpCodeFieldsFirstNameEmailPassword() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("555555");
        driver.findElement(By.xpath("//*[@value='Continue']")).click();
        driver.findElement(By.name("first_name")).sendKeys("Adam");
        driver.findElement(By.name("email")).sendKeys("jennifer_gupta@766.94.sharelane.com");
        driver.findElement(By.name("password1")).sendKeys("1111");
        driver.findElement(By.xpath("//*[@value='Register']")).click();
    }
    @Test
    public void fillInSearchCodeFieldByAuthor() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("555555");
        driver.findElement(By.xpath("//*[@value='Continue']")).click();
        driver.findElement(By.name("keyword")).sendKeys("Mark Twain");
        driver.findElement(By.xpath("//*[@value='Search']")).click();
    }
    @Test
    public void fillInSearchCodeFieldByNameBook() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("555555");
        driver.findElement(By.xpath("//*[@value='Continue']")).click();
        driver.findElement(By.name("keyword")).sendKeys("The Moon and Sixpence");
        driver.findElement(By.xpath("//*[@value='Search']")).click();
    }
}