import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mario\\Desktop\\Nueva carpeta (2)r"); 
        driver = new ChromeDriver();
    }

    @Test
    public void testLogin() {
        driver.get("http://localhost:8080/login"); // Reemplaza con la URL de tu aplicación
        WebElement usuario = driver.findElement(By.name("nombreUsuario"));
        WebElement contrasena = driver.findElement(By.name("contrasena"));
        WebElement submit = driver.findElement(By.tagName("input"));

        usuario.sendKeys("usuario");
        contrasena.sendKeys("contrasena");
        submit.click();

        assertTrue(driver.getCurrentUrl().contains("/bienvenido"));
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
