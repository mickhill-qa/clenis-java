package exemplo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@DisplayName("Funcionalidade: Aprendendo a usar o Selenium WebDriver")
public class SeleniumTests {

    @Test
    @DisplayName("Cenario: Abrindo o Navegador")
    public void abrindoONavegador() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./chromedriver");

        WebDriver navegador = new ChromeDriver();
        navegador.get("https://facebook.com.br");

        Thread.sleep(5000);
        navegador.quit();
        navegador = null;
    }
}
