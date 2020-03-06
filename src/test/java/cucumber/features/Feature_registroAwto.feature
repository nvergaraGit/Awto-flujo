@loginregistroAwto
Feature: Feature_registroAwto

  Scenario: Registro nuevo usuario en awto
    Given Registro finalizado
    When  Se hace click en registrate
    Then  Ingreso al primer paso
    When  Se ingresan datos personales uno
    Then  Ingreso al segundo paso
    When  Se ingresan datos personales dos
    Then  Ingreso al tercer paso
    When  Se ingresan datos de membresia
    Then  Ingreso al paso final
    When  Se visualiza paso final
    Then  Flujo terminado

