package ejemploTest;

import manage.DriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.ExamplePage;

public class TestEjemplo extends DriverManager {


    @Test(description = "Abrir pagina web + login + ")
    @Parameters("drive")
    public void abrirPagina(String drive) {
        //DriverManager.createDriver(drive);
        WebDriver driver = manage.DriverManager.getDriver();
        driver.get("https://www.google.com");
    }

    @Test(description = "descripcion")
    public void ejemplo() {
        System.out.println("entro al test");
        ExamplePage page = new ExamplePage();
        page.ejemploMetodo1();
    }
}
