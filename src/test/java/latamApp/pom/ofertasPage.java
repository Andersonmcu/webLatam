package latamApp.pom;

import org.openqa.selenium.By;

public class ofertasPage {
    private String tituloPagina = "Ofertas | LATAM Airlines";
    private By titleOfertaLocator = By.xpath("//*[@id='root']/main/div[1]/div[1]/div/div[1]/div/div[1]/div[1]/div[1]/div/div[2]/div/div/h1");

    public String getTituloPagina() {
        return tituloPagina;
    }

    public By getTitleOfertaLocator() {
        return titleOfertaLocator;
    }
}
