package latamApp.seleniumgluecode;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import static latamApp.seleniumgluecode.Configuracion.driver;

public class Test extends TestBase{

    @Given("^que el usuario se encuentra en la pagina de Latam$")
    public void que_el_usuario_se_encuentra_en_la_pagina_de_Latam() throws Throwable {
        Assert.assertEquals(homePage.getTituloPagina(),driver.getTitle());
    }

    @And("^esta en la pestana de Vuelos$")
    public void esta_en_la_pestana_de_Vuelos() throws Throwable {
        WebElement pestanaVuelos = SeleniumUtils.esperarElemento("id-tab-flight", "id");
        pestanaVuelos.click();
    }

    @When("^hace clic en el campo Fecha de Ida$")
    public void hace_clic_en_el_campo_Fecha_de_Ida() throws Throwable {
        WebElement clicDatapickerIda = SeleniumUtils.esperarElemento("departureDate", "id");
        clicDatapickerIda.click();
    }

    @And("^selecciona la fecha de Ida$")
    public void selecciona_la_fecha_de_Ida() throws Throwable {
        String xpath = "//td[@aria-label='Elija martes, 2 de abril de 2024 como su fecha de ida. Está disponible.']\n";
        WebElement seleccionarFechaIda = SeleniumUtils.esperarElemento(xpath, "xpath");

        if (seleccionarFechaIda != null && seleccionarFechaIda.isDisplayed()) {
            seleccionarFechaIda.click();
        } else {
            // Manejar la situación donde el elemento no está visible
            System.out.println("El elemento seleccionarFechaIda no está visible o no se encontró.");
            // Puedes lanzar una excepción, imprimir un mensaje o realizar alguna otra acción según tus necesidades.
        }
    }

    @And("^hace clic el campo fecha de Vuelta$")
    public void hace_clic_el_campo_fecha_de_Vuelta() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        WebElement clicDatapickerIda = SeleniumUtils.esperarElemento("arrivalDate", "id");
        clicDatapickerIda.click();
    }

    @And("^selecciona la fecha de Vuelta$")
    public void selecciona_la_fecha_de_Vuelta() throws Throwable {
        String xpath = "//td[@aria-label='Elija viernes, 5 de abril de 2024 como fecha de vuelta. Está disponible.']\n";
        WebElement seleccionarFechaVuelta = SeleniumUtils.esperarElemento(xpath, "xpath");

        if (seleccionarFechaVuelta != null && seleccionarFechaVuelta.isDisplayed()) {
            seleccionarFechaVuelta.click();
        } else {
            // Manejar la situación donde el elemento no está visible
            System.out.println("El elemento seleccionarFechaVuelta no está visible o no se encontró.");
            // Puedes lanzar una excepción, imprimir un mensaje o realizar alguna otra acción según tus necesidades.
        }
    }

    @And("^hace clic en el boton Buscar$")
    public void hace_clic_en_el_boton_Buscar() throws Throwable {
        WebElement botonBuscar = SeleniumUtils.esperarElemento("btnSearchCTA", "id");
        botonBuscar.click();
    }

    @Then("^Los dos campos deben de resaltarse en color rojo y mostrar un icono de exclamación sugerente a que se deben diligenciar antes de realizar la busqueda$")
    public void los_dos_campos_deben_de_resaltarse_en_color_rojo_y_mostrar_un_icono_de_exclamacion_sugerente_a_que_se_deben_diligenciar_antes_de_realizar_la_busqueda() throws Throwable {
        WebElement iconoObligatorio = SeleniumUtils.esperarElemento("svg.error-icon", "css");
        iconoObligatorio.click();

    }

    @When("^hace clic en el campo que indica un pasajero$")
    public void en_el_campo_que_dice_un_pasajero_da_clic() throws Throwable {
        WebElement agregarPasajeros = SeleniumUtils.esperarElemento("btnAddPassengerCTA", "id");
        agregarPasajeros.click();
    }

    @When("^ve que se despliega una lista$")
    public void ve_que_se_despliega_una_lista() throws Throwable {
        String id = "popperExtended";
        WebElement listaAgregarPasajeros = SeleniumUtils.esperarElemento(id, "id");

        if (listaAgregarPasajeros != null && listaAgregarPasajeros.isDisplayed()) {
            listaAgregarPasajeros.click();
        } else {
            // Manejar la situación donde el elemento no está visible
            System.out.println("El elemento listaAgregarPasajeros no está visible o no se encontró.");
            // Puedes lanzar una excepción, imprimir un mensaje o realizar alguna otra acción según tus necesidades.
        }
    }

    @When("^hace clic en el boton para agregar bebe dos veces$")
    public void hace_clic_en_el_boton_para_agregar_bebe_dos_veces() throws Throwable {
        WebElement agregarBebe = SeleniumUtils.esperarElemento("btnPlusInfant", "id");
        agregarBebe.click();
        agregarBebe.click();
    }

    @Then("^deberia aparecer un mensaje de alerta con un icono rojo de una X, indicando que no pueden viajar mas bebes que adultos$")
    public void deberia_aparecer_un_mensaje_de_alerta_con_un_icono_rojo_de_una_X_indicando_que_no_pueden_viajar_mas_bebes_que_adultos() throws Throwable {
        String id = "infant-travel-error";
        WebElement restriccionBebes = SeleniumUtils.esperarElemento(id, "id");

        if (restriccionBebes != null && restriccionBebes.isDisplayed()) {
            restriccionBebes.click();
        } else {
            // Manejar la situación donde el elemento no está visible
            System.out.println("El elemento restriccionBebes no está visible o no se encontró.");
            // Puedes lanzar una excepción, imprimir un mensaje o realizar alguna otra acción según tus necesidades.
        }
    }


    @When("^selecciona la fecha de Ida mayor a la fecha actual$")
    public void selecciona_la_fecha_de_Ida_mayor_a_la_fecha_actual() throws Throwable {
        System.out.println("pasa por aqui");
        String xpath = "//*[@id='calendarContainer']/div/div/div/div/div[2]/div[2]/div/div[4]/div/table/tbody/tr[1]/td[1]";
        WebElement seleccionarFechaIda = SeleniumUtils.esperarElemento(xpath, "xpath");

        if (seleccionarFechaIda != null && seleccionarFechaIda.isDisplayed()) {
            seleccionarFechaIda.click();
        } else {
            // Manejar la situación donde el elemento no está visible
            System.out.println("El elemento seleccionarFechaIda no está visible o no se encontró.");
            // Puedes lanzar una excepción, imprimir un mensaje o realizar alguna otra acción según tus necesidades.
        }
        System.out.println("llega aqui");
    }

    @When("^selecciona la fecha de Vuelta menor a la fecha de Ida$")
    public void selecciona_la_fecha_de_Vuelta_menor_a_la_fecha_de_Ida() throws Throwable {
        String xpath = "//*[@id='calendarContainer']/div/div/div/div/div[2]/div[2]/div/div[4]/div/table/tbody/tr[1]/td[1]";
        WebElement seleccionarFechaVuelta = SeleniumUtils.esperarElemento(xpath, "xpath");

        if (seleccionarFechaVuelta != null && seleccionarFechaVuelta.isDisplayed()) {
            seleccionarFechaVuelta.click();
        } else {
            // Manejar la situación donde el elemento no está visible
            System.out.println("El elemento seleccionarFechaVuelta no está visible o no se encontró.");
            // Puedes lanzar una excepción, imprimir un mensaje o realizar alguna otra acción según tus necesidades.
        }
    }

    @Then("^la fecha del campo Ida debe quedar igual a la fecha seleccionada en el campo Vuelta$")
    public void la_fecha_del_campo_Ida_debe_quedar_igual_a_la_fecha_seleccionada_en_el_campo_Vuelta() throws Throwable {

    }

    @Then("^el campo fecha Vuelta debe quedar vacio o con el placeholder Selecciona$")
    public void el_campo_fecha_Vuelta_debe_quedar_vacio_o_con_el_placeholder_Selecciona() throws Throwable {
        String xpath = "//input[@placeholder='Selecciona']";
        WebElement placeholderSeleccionaFecha = SeleniumUtils.esperarElemento(xpath, "xpath");

        if (placeholderSeleccionaFecha != null && placeholderSeleccionaFecha.isDisplayed()) {
            placeholderSeleccionaFecha.click();
        } else {
            // Manejar la situación donde el elemento no está visible
            System.out.println("El elemento placeholderSeleccionaFecha no está visible o no se encontró.");
            // Puedes lanzar una excepción, imprimir un mensaje o realizar alguna otra acción según tus necesidades.
        }
    }

}