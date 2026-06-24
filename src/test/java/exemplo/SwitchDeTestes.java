package exemplo;

import org.junit.Assert;
import org.junit.Test;

public class SwitchDeTestes {

    @Test
    public void teste01() {
        String textoNaTela = "Mick Lindao";
        String textoEsperado = "O Mick é lindao!";
        Assert.assertEquals(textoEsperado, textoNaTela);
    }

    @Test
    public void teste02() {
        String textoNaTela = "O Mick é lindao!";
        String textoEsperado = "O Mick é lindao!";
        Assert.assertEquals(textoEsperado, textoNaTela);
    }

    @Test
    public void teste03() {
        System.out.println("Olá mundo!");
    }

    @Test
    public void teste04() {
        System.out.println("Olá mundo!");
    }
}
