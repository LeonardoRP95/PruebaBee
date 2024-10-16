@PruebasUsuarios
Feature: Pruebas Usuarios

  @CP001
  Scenario: ingresar a la pagina de bancolombia y generar un informe
    Given navego en la aplicación
    When ingreso a corporativos
    And ingreso a capital inteligente
    And ingreso a actualidad economica
    And selecciono el reporte OPEP y lo descargo
    Then valido que el informe generado en pdf sea el correcto



