package exemplo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Funcionalidade: Testes XPTO")
public class SwitchDeTests {

    @Test
    @DisplayName("Cenario: Valida o nome errado")
    public void teste01() {
        String textoNaTela = "Mick Lindao";
        String textoEsperado = "O Mick é lindao!";
        Assertions.assertEquals(textoEsperado, textoNaTela);
    }

    @Test
    @DisplayName("Cenario: Valida o nome correto")
    public void teste02() {
        String textoNaTela = "O Mick é lindao!";
        String textoEsperado = "O Mick é lindao!";
        Assertions.assertEquals(textoEsperado, textoNaTela);
    }

    @Test
    @DisplayName("Cenario: Nao Valida")
    public void teste03() {
        System.out.println("Olá mundo!");
    }

    @Test
    @DisplayName("Cenario: Nao Valida")
    public void teste04() {
        System.out.println("Olá mundo!");
    }
}
