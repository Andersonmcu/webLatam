package latamApp.seleniumgluecode;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


/**
 * <pre>
 * Fecha      Autor     
 * 17-11-2018 Dilan Steven Mejia	
 * </pre>
 * 
 * Aqui se inicia la configuración del driver y el js como un singleton 
 * para que se pueda utilizar solo en la capa de view y no se instancie mas 
 * de una vez.
 * 
 * @author Dilan Steven Mejia
 * @version 1.0
 * @category Utils
 * **/


public class Configuracion {
	public static WebDriver driver;
	public static JavascriptExecutor js;   

	public static void iniciarConfiguracion(){

		switch (Path.NAVEGADOR) {
		case CHROME:
			// crea una nueva instancia
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.addArguments("--no-sandbox");
			// Ignorar certificados SSL (esto no es recomendable para entornos de producción)
			chromeOptions.addArguments("--ignore-certificate-errors");
	        // Permitir ejecutar en entornos no seguros (esto no es recomendable para entornos de producción)
			chromeOptions.addArguments("--allow-running-insecure-content");

			driver = new ChromeDriver(chromeOptions);
			driver.manage().window().maximize();
			driver.get(Path.URL);
			js = (JavascriptExecutor)driver;
			
			break;
		case FIREFOX:
			// crea una nueva instancia
			driver.get(Path.URL);
			driver.manage().window().maximize();
			break;
		case IE:
			// crea una nueva instancia
			driver.get(Path.URL);
			break;
		default:
			// crea una nueva instancia
			driver.get(Path.URL);
			break;
		}
	}
}
