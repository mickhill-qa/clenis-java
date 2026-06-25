package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.PendingException;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Quando;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeuBarrigaLoginSteps {
    WebDriver driver;

    @Before
    public void antesDeTudo() {
        driver = new ChromeDriver();
    }

    @After
    public void depoisDeTudo() throws InterruptedException {
        Thread.sleep(1000);
        driver.quit();
        driver = null;
    }

    @Dado("que eu estou na pagina inicial")
    public void queEuEstouNaPaginaInicial() {
        driver.get("https://seubarriga.wcaquino.me");
    }

    @Quando("preencher login e senha")
    public void preencherLoginESenha() {
        By _email  = By.id("email");
        By _senha  = By.id("senha");
        driver.findElement(_email).sendKeys("mickhill@test-24-jul-2023-11-56-10");
        driver.findElement(_senha).sendKeys("1234");
    }

    @E("clicar em Entrar")
    public void clicarEmEntrar() {
        By _entrar = By.cssSelector("body > div.jumbotron.col-lg-4 > form > button");
        driver.findElement(_entrar).click();
    }

    @Entao("serei direcionado a area interna do site")
    public void sereiDirecionadoAAreaInternaDoSite() {
        By _msg = By.cssSelector("body > div.alert.alert-success");
        String msgNaTela = driver.findElement(_msg).getText();
        String msgEsperada = "Bem vindo, Mick Hill 24-jul-2023-11-56-10!";
        Assert.assertEquals(msgEsperada, msgNaTela);
    }

    @Quando("preencher login e senha errada")
    public void preencherLoginESenhaErrada() {
        By _email  = By.id("email");
        By _senha  = By.id("senha");
        driver.findElement(_email).sendKeys("mickhill@test-24-jul-2023-11-56-10");
        driver.findElement(_senha).sendKeys("12345");
    }

    @Entao("o site exibe o erro: {string}")
    public void oSiteExibeOErro(String msgEsperada) {
        By _msg = By.cssSelector("body > div.alert.alert-danger");
        String msgNaTela = driver.findElement(_msg).getText();
        Assert.assertEquals(msgEsperada, msgNaTela);
    }

    @Quando("preencher login em branco e senha")
    public void preencherLoginEmBrancoESenha() {
        By _email  = By.id("email");
        By _senha  = By.id("senha");
        driver.findElement(_email).sendKeys("");
        driver.findElement(_senha).sendKeys("12345");
    }
}
