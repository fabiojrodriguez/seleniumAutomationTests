package demoblaze;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.Duration;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class retoUnoTest {
    WebDriver driver;

    @BeforeEach
    public void configuracionNavegador(){
        // CONFIGURACION DEL NAVEGADOR
        driver = new ChromeDriver();
        driver.get("https://demoblaze.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @Test
    public void confirmarValorHtcOneM9Test(){
        //NAVEGAR ENTRE CATEGORIAS
        // IR A CATEGORIA LAPTOPS
        WebElement laptopsOptions = driver.findElement(By.linkText("Laptops"));
        laptopsOptions.click();
        // IR A HOME
        WebElement goHome = driver.findElement(By.xpath("//a[contains(.,'Home (current)')]"));
        goHome.click();

        // IR A CATEGORIA PHONES
        WebElement phonesOptions = driver.findElement(By.linkText("Phones"));
        phonesOptions.click();
        
        // SELECCIONAR PRODUCTO HTC ONE M9
        WebElement htcSearch = driver.findElement(By.linkText("HTC One M9"));
        htcSearch.click();

        // PUNTOS DE CONTROL
        WebElement priceHtcOneM9 =  driver.findElement(By.xpath("//h3[@class='price-container']"));
        assertEquals("$700 *includes tax", priceHtcOneM9.getText(), "El precio del móvil es el esperado");
        assertTrue(priceHtcOneM9.isDisplayed());
        assertTrue(priceHtcOneM9.getText().contains("$700 *includes tax"), "El precio del HTC One M9 se muestra correctamente");
        
    }

    @Test
    public void confirmarValorMacBookAirTest(){
        // IR A HOME
        WebElement goHome = driver.findElement(By.xpath("//a[contains(.,'Home (current)')]"));
        goHome.click();

        // SELECCIONAR OPCIÓN LAPTOPS
        WebElement laptopsOptions = driver.findElement(By.linkText("Laptops"));
        laptopsOptions.click();

        // SELECCIONAR PRODUCTO MACBOOK AIR
        WebElement MacBookairSearch = driver.findElement(By.linkText("MacBook air"));
        MacBookairSearch.click();

        // PUNTOS DE CONTROL
        WebElement priceMacBookAir =  driver.findElement(By.xpath("//h3[@class='price-container']"));
        assertEquals("$700 *includes tax", priceMacBookAir.getText(), "El precio del portátil es el esperado");
        assertTrue(priceMacBookAir.isDisplayed());
        assertTrue(priceMacBookAir.getText().contains("$700 *includes tax"), "El precio de la MacBook air se muestra correctamente");
        
    }

    @Test
    public void confirmarValorMacBookProTest(){
        // IR A HOME
        WebElement goHome = driver.findElement(By.xpath("//a[contains(.,'Home (current)')]"));
        goHome.click();

        // SELECCIONAR OPCIÓN LAPTOPS
        WebElement laptopsOptions = driver.findElement(By.linkText("Laptops"));
        laptopsOptions.click();

        // SELECCIONAR PRODUCTO MACBOOK PRO
        WebElement MacBookProSearch = driver.findElement(By.linkText("MacBook Pro"));
        MacBookProSearch.click();

        // PUNTOS DE CONTROL
        WebElement priceMacBookPro =  driver.findElement(By.xpath("//h3[@class='price-container']"));
        assertEquals("$1100 *includes tax", priceMacBookPro.getText(), "El precio del portátil es el esperado");
        assertTrue(priceMacBookPro.isDisplayed());
        assertTrue(priceMacBookPro.getText().contains("$1100 *includes tax"), "El precio de la MacBook Pro se muestra correctamente");
        
    }

    @Test
    public void confirmarValorDelli7Test(){
        // IR A HOME
        WebElement goHome = driver.findElement(By.xpath("//a[contains(.,'Home (current)')]"));
        goHome.click();

        // SELECCIONAR OPCIÓN LAPTOPS
        WebElement laptopsOptions = driver.findElement(By.linkText("Laptops"));
        laptopsOptions.click();

        // SELECCIONAR PRODUCTO DELL i7 8GB
        WebElement Delli7Search = driver.findElement(By.linkText("Dell i7 8gb"));
        Delli7Search.click();

        // PUNTOS DE CONTROL
        WebElement priceDelli7 =  driver.findElement(By.xpath("//h3[@class='price-container']"));
        assertEquals("$700 *includes tax", priceDelli7.getText(), "El precio del portátil es el esperado");
        assertTrue(priceDelli7.isDisplayed());
        assertTrue(priceDelli7.getText().contains("$700 *includes tax"), "El precio de la MacBook Pro se muestra correctamente");
        
    }

    @Test
    public void confirmarValorAsusFullHDTest(){
        // IR A HOME
        WebElement goHome = driver.findElement(By.xpath("//a[contains(.,'Home (current)')]"));
        goHome.click();

        // SELECCIONAR OPCIÓN MONITORES
        WebElement MonitorsOptions = driver.findElement(By.linkText("Monitors"));
        MonitorsOptions.click();

        // SELECCIONAR PRODUCTO DELL i7 8GB
        WebElement AsusFullHDSearch = driver.findElement(By.linkText("ASUS Full HD"));
        AsusFullHDSearch.click();

        // PUNTOS DE CONTROL
        WebElement priceAsusFullHD =  driver.findElement(By.xpath("//h3[@class='price-container']"));
        assertEquals("$230 *includes tax", priceAsusFullHD.getText(), "El precio del portátil es el esperado");
        assertTrue(priceAsusFullHD.isDisplayed());
        assertTrue(priceAsusFullHD.getText().contains("$230 *includes tax"), "El precio de la MacBook Pro se muestra correctamente");
        
    }

    @AfterEach
    public void salirNavegador(){
        driver.quit();
    }
}
