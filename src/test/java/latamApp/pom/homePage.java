package latamApp.pom;

import org.openqa.selenium.By;

public class homePage {

    String tituloPagina = "Cotiza Vuelos, Paquetes, Hoteles y Carros | LATAM en Colombia";
    By pestanaVuelos = By.id("id-tab-flight");

    public String getTituloPagina() {
        return tituloPagina;
    }

    public By getPestanaVuelos() {
        return pestanaVuelos;
    }

}
