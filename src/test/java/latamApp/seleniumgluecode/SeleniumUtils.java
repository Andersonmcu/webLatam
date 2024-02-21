package latamApp.seleniumgluecode;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Aqui se tiene metodos reutilizables que ayuda con problemas 
 * repetitivos en la automatización.
 * @author Andersson Viveros
 * @version 1.0
 * @category Utils
 * **/

public class SeleniumUtils {

	public static WebElement esperarElemento(String locator, String type) {

		WebDriverWait wait = new WebDriverWait(Configuracion.driver, 15);
		wait.ignoring(NoSuchElementException.class);

		return wait.until(driver -> {
			switch (type) {
				case "css":
					return driver.findElement(By.cssSelector(locator));
				case "xpath":
					return driver.findElement(By.xpath(locator));
				case "id":
					return driver.findElement(By.id(locator));
				case "class":
					return driver.findElement(By.className(locator));
				case "name":
					return driver.findElement(By.name(locator));
				default:
					return null;
			}
		});
	}

	public static WebElement esperarElemento(String locator, String type, int tiempo) {

		WebDriverWait wait = new WebDriverWait(Configuracion.driver, tiempo);
		wait.ignoring(NoSuchElementException.class);

		return wait.until(driver -> {
			switch (type) {
				case "css":
					return driver.findElement(By.cssSelector(locator));
				case "xpath":
					return driver.findElement(By.xpath(locator));
				case "id":
					return driver.findElement(By.id(locator));
				case "class":
					return driver.findElement(By.className(locator));
				case "name":
					return driver.findElement(By.name(locator));
				default:
					break;

			}
			return null;
		});
	}

	public static void scrollElemento(WebElement element) {
		Configuracion.js.executeScript("arguments[0].scrollIntoView();", element);
		String scroll = "window.scroll(" + (element.getLocation().x ) + ","
				+ (element.getLocation().y -50) + ");";
		Configuracion.js.executeScript(scroll, element);
	}
	
	//Se crea un metodo de espera implicita para esperar 
	//a que carguen las animaciones. 
	public static void esperarAnimacionElemento() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}