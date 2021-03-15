import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;

public class testKod  {
    public static void main(String[] args) throws Exception {

        // declaration and instantiation of objects/variables
        System.setProperty("webdriver.chrome.driver","C:\\WebDriver\\bin\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        String baseUrl1 = "http://www.gittigidiyor.com";
        driver.get(baseUrl1);
        Thread.sleep(100);
        String baseUrl = "http://www.gittigidiyor.com/uye-girisi";
        driver.get(baseUrl);
        driver.manage().window().maximize();

        // Get the WebElement corresponding to the Email Address(TextField)
        WebElement email = driver.findElement(By.name("kullanici"));

        // Get the WebElement corresponding to the Password Field
        WebElement password = driver.findElement(By.name("sifre"));

        email.sendKeys("senaacom@hotmail.com");
        password.sendKeys("1234ab");
        System.out.println("Text Field Set");

        // Deleting values in the text box
        email.clear();
        password.clear();
        System.out.println("Text Field Cleared");

        // Find the submit button
        WebElement login = driver.findElement(By.id("gg-login-enter"));

        // Using click method to submit form
        email.sendKeys("senaacom@hotmail.com");
        password.sendKeys("1234ab");
        System.out.println("Email yazıldı şifre yazıldı.");
        System.out.println("Click basılıyor");
        login.click();
        System.out.println("Click basıldı");
        System.out.println("Login Done with Click");

        WebElement search = driver.findElement(By.name("k"));
        System.out.println("bilgisayar yazılıyor.");
        search.sendKeys("bilgisayar");
        System.out.println("bilgisayar yazıldı.");
        WebElement searchButton = driver.findElement(By.xpath("//*[@id=\"main-header\"]/div[3]/div/div/div/div[2]/form/div/div[2]/button"));
        searchButton.click();


        //using submit method to submit the form. Submit used on password field
        driver.findElement(By.name("kullanici")).sendKeys("senaacom@hotmail.com");
        driver.findElement(By.name("sifre")).sendKeys("1234ab");
        driver.findElement(By.id("gg-login-enter")).submit();
        driver.findElement(By.name("k")).sendKeys("bilgisayar");
        driver.findElement(By.xpath("//*[@id=\"main-header\"]/div[3]/div/div/div/div[2]/form/div/div[2]/button")).submit();
        System.out.println("Login Done with Submit");


        //driver.close();

    }
}