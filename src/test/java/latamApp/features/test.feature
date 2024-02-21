#Autor: Andersson Viveros
Feature: Buscar Vuelos
  Como usuario quiero buscar las mejores ofertas de vuelos

  #Caso de prueba 1
  Scenario: Validar los Campos Obligatorios Origen y Destino
    Given que el usuario se encuentra en la pagina de Latam
    And esta en la pestana de Vuelos
    When hace clic en el campo Fecha de Ida
    And selecciona la fecha de Ida
    And hace clic el campo fecha de Vuelta
    And selecciona la fecha de Vuelta
    And hace clic en el boton Buscar
    Then Los dos campos deben de resaltarse en color rojo y mostrar un icono de exclamación sugerente a que se deben diligenciar antes de realizar la busqueda

  #Caso de prueba 2
  Scenario: Restricciones de Pasajeros Bebes
    Given que el usuario se encuentra en la pagina de Latam
    And esta en la pestana de Vuelos
    When hace clic en el campo que indica un pasajero
    And ve que se despliega una lista
    And hace clic en el boton para agregar bebe dos veces
    Then deberia aparecer un mensaje de alerta con un icono rojo de una X, indicando que no pueden viajar mas bebes que adultos

  #Caso de prueba 3
  Scenario: Fecha de Vuelta inferior a fecha de Ida
    Given que el usuario se encuentra en la pagina de Latam
    And esta en la pestana de Vuelos
    When hace clic en el campo Fecha de Ida
    And selecciona la fecha de Ida mayor a la fecha actual
    And selecciona la fecha de Vuelta menor a la fecha de Ida
    Then la fecha del campo Ida debe quedar igual a la fecha seleccionada en el campo Vuelta
