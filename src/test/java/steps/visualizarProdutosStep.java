package steps;

import io.cucumber.java.After;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.assertj.core.api.Assertions.assertThat;


public class visualizarProdutosStep {

    private static WebDriver driver;

    @Dado("que estou na página inicial")
    public void que_estou_na_página_inicial() {
        driver = new ChromeDriver();
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://marcelodebittencourt.com/demoprestashop/");
    }
    @Quando("não estou logado")
    public void não_estou_logado() {
       //String elementoSignin = driver.findElement(By.cssSelector("#_desktop_user_info > div > a")).getText();
        //assertThat(driver.getTitle()).isEqualTo("Sign in");

    }
    @Então("visualizo o produto {string} na posicao {string}")
    public void visualizo_o_produto_na_posicao(String string, String posicaoString) {
        System.out.println(posicaoString);
        int posicao = Integer.parseInt(posicaoString);
        String nomeEsperado = string;

        WebElement elementoNome = driver.findElement(By.cssSelector("#content > section > div > article:nth-child(1) > div > div.product-description > h3 > a"));
        String nomeEncontrado = elementoNome.getText();

        assertThat(nomeEncontrado).isEqualTo(nomeEsperado);

    }
//Test2



}
