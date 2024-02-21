package latamApp.seleniumgluecode;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

    private static int numeroCaso = 0;

    @Before
    public void SetUp(){
        numeroCaso ++;
        System.out.println("Se esta ejecutando el escenario: " + numeroCaso);
        Configuracion.iniciarConfiguracion();
    }

    @After
    public void cerrarNavegador(){
        System.out.println("El escenario numero: " + numeroCaso + " se ejecuto correctamente");
        Configuracion.driver.quit();
    }

}
