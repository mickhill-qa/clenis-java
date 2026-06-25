package exemplo;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@DisplayName("Funcionalidade: Aprendendo a usar o Selenium WebDriver")
public class SeleniumTests {
    public WebDriver driver = new ChromeDriver();

    @BeforeEach
    public void antesDeTudo() {
        driver.get("https://seubarriga.wcaquino.me");
    }

    @AfterEach
    public void depoisDeTudo() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
        driver = null;
    }

    @Test
    @DisplayName("Cenario: Abrindo o Navegador")
    public void abrindoONavegador() {
        By _email  = By.id("email");
        By _senha  = By.id("senha");
        By _entrar = By.cssSelector("body > div.jumbotron.col-lg-4 > form > button");
        By _msg    = By.cssSelector("body > div.alert.alert-success");

        driver.findElement(_email).sendKeys("mickhill@test-24-jul-2023-11-56-10");
        driver.findElement(_senha).sendKeys("1234");
        driver.findElement(_entrar).click();

        String msgNaTela   = driver.findElement(_msg).getText();
        String msgEsperada = "Bem vindo, Mick Hill 24-jul-2023-11-56-10!!";

        Assertions.assertEquals(msgEsperada, msgNaTela);
    }
}
